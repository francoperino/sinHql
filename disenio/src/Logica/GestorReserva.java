package Logica;
 
 
import java.util.ArrayList;
import Entidades.ConsultaGenerica;
 
public class GestorReserva {
    public ArrayList<ArrayList<ConsultaGenerica>> consultarDiaReserva(String tipoAula,ArrayList fecha, Integer cantAlumnos,ArrayList horaInicio,ArrayList duracion) throws Exception  {
        GestorAulas ga = new GestorAulas();
        ArrayList<ConsultaGenerica> aulas = ga.obtenerArrayAulas(tipoAula, cantAlumnos);
        ArrayList<ConsultaGenerica> lis = null;
        int tam = fecha.size();
        ArrayList<ArrayList<ConsultaGenerica>> ar = new ArrayList<>();
        GestorDiaReserva gdr = new GestorDiaReserva();
        for(int i=0; i<tam;i++) {
            ar.add(gdr.buscarAulasDisp((String)fecha.get(i), aulas, (String)horaInicio.get(i),(String) duracion.get(i)));
           
        }
        return ar;
    }
 
}