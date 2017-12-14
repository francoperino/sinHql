package daos;

import java.util.ArrayList;

import Entidades.Bedel;
import Entidades.ConsultaGenerica;

public class daoCursos {
     public ArrayList<ConsultaGenerica> obtenerCursos() throws Exception{
    	 String consulta ="select c.nombrecurso from curso c;";
    	 ArrayList<ConsultaGenerica> res = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta, ConsultaGenerica.class));
         return res;
     }
}
