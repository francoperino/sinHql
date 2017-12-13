package Logica;
 
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
 
import Entidades.ConsultaGenerica;
import daos.daoDiaReserva;
 
 
 
public class GestorDiaReserva {
    ArrayList<ConsultaGenerica> aul = new ArrayList<>();
    daoDiaReserva ddr = new daoDiaReserva();
    ArrayList<ConsultaGenerica> listaAulas;
    public  ArrayList<ConsultaGenerica> buscarAulasDisp(String fechas,ArrayList<ConsultaGenerica> aulas ,String horaInicio,String duracion) throws Exception{
        listaAulas = aulas;
        duracion = duracion.replace(":","");
        int temp = Integer.parseInt(duracion);
        String hoo = horaInicio.replace(":","");
        int ini = Integer.parseInt(hoo);
        Calendar calendar = Calendar.getInstance();
        Calendar cal = Calendar.getInstance();
        Calendar c= Calendar.getInstance();
        c.set(2017,12,12,0,0,0);
        cal.set(2017,12,12,temp/100,temp%100,0);
        calendar.set(2017,12,12,ini/100,ini%100, 0);
        Long inicio = (calendar.getTimeInMillis()-c.getTimeInMillis());
        Long duracio = (cal.getTimeInMillis()-c.getTimeInMillis());
        Long result = inicio + duracio +60000;
        Long hor = result/3600000;
        Long restohora = result%3600000;
        Long minuto = restohora/60000;
        String dur = ""+hor+":"+minuto+":00";
        horaInicio = ""+horaInicio+":00";
       
         int tam = aulas.size();
         for(int i=0; i<tam;i++) {
             int valor = ddr.buscarDR(fechas,horaInicio,Integer.parseInt(aulas.get(i).getValor("numeroaula")),dur);
             if(valor != 0) {
                 filtar(valor);
             }
         }
       
         Collections.sort(aul);
        return aul;
       
    }
    public void filtar(Integer valor) {
        int i = 0;
        Boolean bandera = false;
        while(bandera == false && i<listaAulas.size()) {
            if(valor == Integer.parseInt(listaAulas.get(i).getValor("numeroaula")) ) {
                aul.add(listaAulas.get(i));
                bandera=true;
               
            }
            i++;
        }
    }
 
}