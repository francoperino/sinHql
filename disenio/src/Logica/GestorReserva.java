package Logica;
 
 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.mysql.fabric.xmlrpc.base.Array;

import Entidades.Ciclolectivo;
import Entidades.ConsultaGenerica;
import Entidades.Curso;
import Entidades.Diareserva;
import Entidades.Docente;
import Entidades.Esporadica;
import Entidades.Periodica;
import Entidades.Reserva;
import Entidades.Usuario;
import daos.daoReserva;
 
public class GestorReserva {
    private ArrayList<String> lun;
    private ArrayList<String> tod;
    private Calendar cini = Calendar.getInstance();
    private Calendar cfin = Calendar.getInstance();
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    public ArrayList<ArrayList<ConsultaGenerica>> validar(ArrayList<Integer> diaSemana,String tipoAula,String periodo,int cantAlumnos,ArrayList horaInicio,ArrayList duracion) throws Exception {
    	 Map<String,ArrayList<ConsultaGenerica>> lun = new HashMap<String,ArrayList<ConsultaGenerica>>();
    	 ArrayList lunes = new ArrayList<>();
    	 ArrayList martes = new ArrayList<>();
    	 ArrayList miercoles = new ArrayList<>();
    	 ArrayList jueves = new ArrayList<>();
    	 ArrayList viernes = new ArrayList<>();
    	 ArrayList sabado = new ArrayList<>();
    	 ArrayList<ArrayList<ConsultaGenerica>> total = new ArrayList<>();
    	 total.add(0,lunes);
    	 total.add(1,lunes);
    	 total.add(2,lunes);
    	 total.add(3,lunes);
    	 total.add(4,lunes);
    	 total.add(5,lunes);
    	 
    	for(int i=0;i<6;i++) {
    	   if(diaSemana.get(i)==1) {
    		   switch (i){
    			   case 0:
    				   lunes = filtro(consultarDiaReserva(tipoAula,periodo, cantAlumnos,horaInicio, duracion,i));
    				   total.remove(0);
    				   total.add(0,lunes);
    				   break;
    			   case 1:
    				   martes = filtro(consultarDiaReserva(tipoAula,periodo, cantAlumnos,horaInicio, duracion,i));
    				   total.remove(1);
    				   total.add(1,martes);
    			       break;
    			   case 2:
    				   miercoles = filtro(consultarDiaReserva(tipoAula,periodo, cantAlumnos,horaInicio, duracion,i));
    				   total.remove(2);
    				   total.add(2,miercoles);
    				   break;
    			   case 3:
    				   jueves = filtro(consultarDiaReserva(tipoAula,periodo, cantAlumnos,horaInicio, duracion,i));
    				   total.remove(3);
    				   total.add(3,jueves);
    				   break;
    			   case 4:
    				   viernes = filtro(consultarDiaReserva(tipoAula,periodo, cantAlumnos,horaInicio, duracion,i));
    				   total.remove(4);
    				   total.add(4,viernes);
    				   break;
    			   case 5:
    				   sabado = filtro(consultarDiaReserva(tipoAula,periodo, cantAlumnos,horaInicio, duracion,i));
    				   total.remove(5);
    				   total.add(5,sabado);
    				   break;
    		   }
    		  
    	   }
    	
    		
    	}
    	 for(int K=0;K<total.size();K++) {
   		  System.out.println(total.get(K)); 
   		   }
    	return total;
    }
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
    public Map<String, ArrayList<ConsultaGenerica>> consultarDiaReserva(String tipoAula,String periodo, Integer cantAlumnos,ArrayList horaInicio,ArrayList duracion,Integer diaSemana) throws Exception  {
    	
    	GestorAulas ga = new GestorAulas();
        GestorCicloLectivo gcl = new GestorCicloLectivo();
        Ciclolectivo cl = new Ciclolectivo();
        cl=gcl.obtenerCicloLectivo();
        ArrayList<ConsultaGenerica> aulas = ga.obtenerArrayAulas(tipoAula, cantAlumnos);
        GestorDiaReserva gdr = new GestorDiaReserva();
        ArrayList<String> lunes;
        ArrayList<String> martes;
        ArrayList<String> miercoles;
        ArrayList<String> jueves;
        ArrayList<String> viernes;
        ArrayList<String> sabado;
        Map<String,ArrayList<ConsultaGenerica>> lun = new HashMap<String,ArrayList<ConsultaGenerica>>(); 
        Map<String,ArrayList<ConsultaGenerica>> mar = new HashMap<String,ArrayList<ConsultaGenerica>>();
        Map<String,ArrayList<ConsultaGenerica>> mie = new HashMap<String,ArrayList<ConsultaGenerica>>();
        Map<String,ArrayList<ConsultaGenerica>> jue = new HashMap<String,ArrayList<ConsultaGenerica>>();
        Map<String,ArrayList<ConsultaGenerica>> vie = new HashMap<String,ArrayList<ConsultaGenerica>>();
        Map<String,ArrayList<ConsultaGenerica>> sab = new HashMap<String,ArrayList<ConsultaGenerica>>();
        	
        		switch (diaSemana) {
        			case 0:
        				lunes = obtenerArrayFechas("Lunes",periodo,cl);
        				int tam = lunes.size();
        				for(int j =0; j<tam;j++ ) {
        					lun.put(lunes.get(j),gdr.buscarAulasDisp(lunes.get(j), aulas, (String)horaInicio.get(diaSemana),(String) duracion.get(diaSemana)));
        				}
        				return lun;
        				
        			case 1:
        				martes = obtenerArrayFechas("Martes",periodo,cl);
        				int tam1 = martes.size();
        				for(int j =0; j<tam1;j++ ) {
        					mar.put(martes.get(j),gdr.buscarAulasDisp(martes.get(j), aulas, (String)horaInicio.get(diaSemana),(String) duracion.get(diaSemana)));
        				}
        				return mar;
        				
        			case 2:
        				miercoles = obtenerArrayFechas("Miercoles",periodo,cl);
        				int tam2 = miercoles.size();
        				for(int j =0; j<tam2;j++ ) {
        					mie.put(miercoles.get(j),gdr.buscarAulasDisp(miercoles.get(j), aulas, (String)horaInicio.get(diaSemana),(String) duracion.get(diaSemana)));
        				}
        				return mie;
        				
        			case 3:
        				jueves = obtenerArrayFechas("Jueves",periodo,cl);
        				int tam3 = jueves.size();
        				for(int j =0; j<tam3;j++ ) {
        					jue.put(jueves.get(j),gdr.buscarAulasDisp(jueves.get(j), aulas, (String)horaInicio.get(diaSemana),(String) duracion.get(diaSemana)));
        				}
        				return jue;
        				
        			case 4:
        				viernes = obtenerArrayFechas("Viernes",periodo,cl);
        				int tam4 = viernes.size();
        				for(int j =0; j<tam4;j++ ) {
        					vie.put(viernes.get(j),gdr.buscarAulasDisp(viernes.get(j), aulas, (String)horaInicio.get(diaSemana),(String) duracion.get(diaSemana)));
        				}
        				
        				return vie;
				case 5:
        				sabado = obtenerArrayFechas("Sabado",periodo,cl);
        				int tam5 = sabado.size();
        				for(int j =0; j<tam5;j++ ) {
        					sab.put(sabado.get(j),gdr.buscarAulasDisp(sabado.get(j), aulas, (String)horaInicio.get(diaSemana),(String) duracion.get(diaSemana)));
        				}
        				return sab;
        			
        	
          }
				return null;
        	
        
       
    }
    public ArrayList<String> obtenerArrayFechas(String diaSemana,String periodo,Ciclolectivo cl) throws ParseException {
    	tod = new ArrayList<String>();
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
    	lun = new ArrayList<String>();
     ArrayList<String>	dates = new ArrayList<String>();
    switch (diaSemana) {
    case "Lunes":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
        if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
            dates.add(formatter.format(cini.getTime()));
        }
        cini.add(Calendar.DATE, 1);
        
    }
        for(String c : dates){
            lun.add(c);
            }
        break;
    case "Martes":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
            if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
                dates.add(formatter.format(cini.getTime()));
            }
            cini.add(Calendar.DATE, 1);
           
        }
        for(String c : dates){
            lun.add(c);
            }
        break;
       
    case "Miercoles":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
            if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
                dates.add(formatter.format(cini.getTime()));
            }
            cini.add(Calendar.DATE, 1);
           
        }
        for(String c : dates){
            lun.add(c);
            }
        break;
    case "Jueves":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
            if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
                dates.add(formatter.format(cini.getTime()));
            }
            cini.add(Calendar.DATE, 1);
        }
            for(String c : dates){
            lun.add(c);
            }
        break;
    case "Viernes":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
            if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                dates.add(formatter.format(cini.getTime()));
            }
            cini.add(Calendar.DATE, 1);
        }
            for(String c : dates){
            lun.add(c);
            }
        break;
    case "Sabado":
        while (!cfin.before(cini)|| cfin.equals(cini)) {
            if (cini.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                dates.add(formatter.format(cini.getTime()));
            }
            cini.add(Calendar.DATE, 1);
        }
            for(String c : dates){
            lun.add(c);
            }
        break;
}
    return lun;
    }
    public ArrayList<ConsultaGenerica> filtro(Map<String, ArrayList<ConsultaGenerica>> dia){
    	Iterator<Entry<String, ArrayList<ConsultaGenerica>>> it = dia.entrySet().iterator();
    	
    	String claveActual="";
    	Set<String> aa = dia.keySet();
    	String[] y = new String[aa.size()];
    	y=aa.toArray(y);
     
    	for (String ke : aa) {
    	  claveActual = ke;
    	  break;
    	}
    	Set<String> vec = dia.keySet();
    	for(String ke : vec) {
    		dia.get(claveActual).retainAll(dia.get(ke));
    	}
    	
    	return dia.get(claveActual);	
    }
    public void registrarReserva(int cantAlumnos,String tipoAula,String nomCurso,ArrayList<String> fechas,ArrayList<String> aulas,ArrayList<String> horaIni,ArrayList<String> duracion,String idDocente,String idBedel) throws Exception {

    	Reserva reserva = new Reserva();
    	daoReserva dr = new daoReserva();
    	reserva= obtenerobjetosasociados(nomCurso,fechas,aulas,horaIni,duracion,idDocente,idBedel,reserva);    	
    	reserva.setCantalumnos(cantAlumnos);
    	reserva.setTipoaula(tipoAula);
    	dr.registrarReserva(reserva);
    	
    	
    	/*reserva.setCantalumnos(cantAlumnos);
    	reserva.setTipoaula(tipoAula);
		reserva.setCurso(curso);
		//reserva.setDiareservas(diareservas);
		reserva.setCiclolectivo(ciclolectivo);
		reserva.setUsuario(usuario);
		reserva.setEsporadica(esporadica);
		reserva.setPeriodica(periodica);
		reserva.setDocente(docente);
		daoReserva dr = new daoReserva();
		*/
    }
    Reserva obtenerobjetosasociados(String nomCurso,ArrayList<String> fechas, ArrayList<String> aulas, ArrayList<String> horaIni, ArrayList<String> duracion, String idDocente,String idBedel, Reserva reserva) throws Exception{
    	GestorCicloLectivo gcl = new GestorCicloLectivo();
		GestorDocente gd= new GestorDocente();
	    GestorCursos gcu = new GestorCursos();
	    GestorBedel gu = new GestorBedel();
		GestorDiaReserva  gdr = new GestorDiaReserva();
	    reserva.setCurso(gcu.obtenerCurso(nomCurso));
    	reserva.setDocente(gd.obtenerDocente(idDocente));
    	reserva.setUsuario(gu.obtenerBedel(idBedel));
    	reserva.setCiclolectivo(gcl.obtenerCicloLectivo());
    	reserva.setDiareservas(gdr.obtenerArr(fechas, aulas, horaIni, duracion));
    	return reserva;
    	
    }
    
}

