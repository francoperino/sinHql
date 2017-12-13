package daos;
 
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
 
import Entidades.ConsultaGenerica;
 
public class daoDiaReserva {
    public Integer buscarDR(String fecha,String horaInicio,Integer aulas,String duracion) throws Exception{
        String consulta1 = "Select d.numeroaula from diareserva d where d.diacalendario ='"+fecha+"' and d.numeroaula = '"+aulas+"';";
        ArrayList<ConsultaGenerica> res = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta1, ConsultaGenerica.class));
        if(res.isEmpty()) {
            return aulas;
           
        }else {
        String consulta = "SELECT d.numeroaula FROM diareserva d where  d.diacalendario= '"+fecha+"' and not( d.horainicio <='"+horaInicio+"' and '"+horaInicio+"' <=(d.horainicio + d.duracion)) and d.numeroaula = '"+aulas+"' and not( d.horainicio <='"+duracion+"' and '"+duracion+"' <=(d.horainicio + d.duracion) );";
        ArrayList<ConsultaGenerica> res1 = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta, ConsultaGenerica.class));
       
        if(res1.isEmpty()) {
            return 0;
        }
       
        else {
        return (Integer.parseInt(res1.get(0).getValor("numeroaula")));
    }
        }
    }
}
