package Logica;
 
 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
 
import Entidades.Ciclolectivo;
import Entidades.ConsultaGenerica;
 
public class GestorReserva {
    private ArrayList<String> lun = new ArrayList<String>();
    private ArrayList<String> tod = new ArrayList<String>();
    private Calendar cini = Calendar.getInstance();
    private Calendar cfin = Calendar.getInstance();
    private List<String> dates = new ArrayList<String>();
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    public ArrayList<ArrayList<ConsultaGenerica>> consultarDiaReserva(String tipoAula,ArrayList fecha, Integer cantAlumnos,ArrayList horaInicio,ArrayList duracion) throws Exception  {
        GestorAulas ga = new GestorAulas();
        ArrayList<ConsultaGenerica> aulas = ga.obtenerArrayAulas(tipoAula, cantAlumnos);
        int tam = fecha.size();
        ArrayList<ArrayList<ConsultaGenerica>> ar = new ArrayList<>();
        GestorDiaReserva gdr = new GestorDiaReserva();
        for(int i=0; i<tam;i++) {
            ar.add(gdr.buscarAulasDisp((String)fecha.get(i), aulas, (String)horaInicio.get(i),(String) duracion.get(i)));      
        }
        return ar;  
    }
    public ArrayList<ArrayList<ConsultaGenerica>> consultarDiaReserva(String tipoAula,String periodo, Integer cantAlumnos,ArrayList horaInicio,ArrayList duracion,ArrayList diaSemana) throws Exception  {
        GestorAulas ga = new GestorAulas();
        GestorCicloLectivo gcl = new GestorCicloLectivo();
        Ciclolectivo cl = new Ciclolectivo();
        cl=gcl.obtenerCicloLectivo();
        ArrayList<ConsultaGenerica> aulas = ga.obtenerArrayAulas(tipoAula, cantAlumnos);
        /*int tam = fecha.size();
        ArrayList<ArrayList<ConsultaGenerica>> ar = new ArrayList<>();
        GestorDiaReserva gdr = new GestorDiaReserva();
        for(int i=0; i<tam;i++) {
            ar.add(gdr.buscarAulasDisp((String)fecha.get(i), aulas, (String)horaInicio.get(i),(String) duracion.get(i)));      
        }*/
        return null;  
    }
    public ArrayList<String> obtenerArrayFechas(String diaSemana,String periodo,Ciclolectivo cl) throws ParseException {
        Calendar c = Calendar.getInstance();
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH)+1);
        String annio = Integer.toString(c.get(Calendar.YEAR));
        String fechaActual= ""+annio+"-"+mes+"-"+dia+"";
        SimpleDateFormat sdd = new SimpleDateFormat("yyyy-MM-dd");
        Date actual=null;
        try {
            actual = sdd.parse(fechaActual);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date finCiclo=null;
        try {
            finCiclo = sdf.parse(cl.getFechafinciclo());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Date iniCiclo=null;
        try {
            iniCiclo = sdf.parse(cl.getFechainiciclo());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Date finCuatri=null;
        try {
            finCuatri = sdf.parse(cl.getFechafincuatri());
        } catch (ParseException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Date iniCuatri=null;
        try {
            iniCuatri = sdf.parse(cl.getFechainicuatri());
        } catch (ParseException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
       
        if(periodo.equals("Anual")) {
           
            if(actual.compareTo(iniCiclo)>0) {
            cini.setTime(actual);
            }
            else {
                cini.setTime(formatter.parse(cl.getFechainiciclo()));  
            }
            cfin.setTime(formatter.parse(cl.getFechafincuatri()));
            tod = dias(diaSemana);
            cini.setTime(formatter.parse(cl.getFechainicuatri()));
            cfin.setTime(formatter.parse(cl.getFechafinciclo()));
            tod.addAll(dias(diaSemana));
        }
        else if(periodo.equals("1er Cuatrimestre")) {
            if(actual.compareTo(iniCiclo)>0) {
                cini.setTime(actual);
                }
                else {
                    cini.setTime(formatter.parse(cl.getFechainiciclo()));  
                }
                cfin.setTime(formatter.parse(cl.getFechafincuatri()));
                tod = dias(diaSemana);
           
        }
        else {
            if(actual.compareTo(iniCuatri)>0) {
                cini.setTime(actual);
                }
                else {
                    cini.setTime(formatter.parse(cl.getFechainicuatri())); 
                }
                cfin.setTime(formatter.parse(cl.getFechafinciclo()));
                tod = dias(diaSemana);
           
        }
        return tod;
    }
 
public ArrayList<String> dias(String diaSemana) {
    switch (diaSemana) {
    case "Lunes":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
        if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
            dates.add(formatter.format(cini.getTime()));
        }
        cini.add(Calendar.DATE, 1);
        for(String c : dates){
        lun.add(c);
        }
    }
        break;
    case "Martes":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
            if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
                dates.add(formatter.format(cini.getTime()));
            }
            cini.add(Calendar.DATE, 1);
            for(String c : dates){
            lun.add(c);
            }
        }
        break;
       
    case "Miercoles":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
            if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
                dates.add(formatter.format(cini.getTime()));
            }
            cini.add(Calendar.DATE, 1);
            for(String c : dates){
            lun.add(c);
            }
        }
        break;
    case "Jueves":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
            if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
                dates.add(formatter.format(cini.getTime()));
            }
            cini.add(Calendar.DATE, 1);
            for(String c : dates){
            lun.add(c);
            }
        }
        break;
    case "Viernes":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
            if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                dates.add(formatter.format(cini.getTime()));
            }
            cini.add(Calendar.DATE, 1);
            for(String c : dates){
            lun.add(c);
            }
        }
        break;
    case "Sabado":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
            if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                dates.add(formatter.format(cini.getTime()));
            }
            cini.add(Calendar.DATE, 1);
            for(String c : dates){
            lun.add(c);
            }
        }
        break;
}
    return lun;
    }
}