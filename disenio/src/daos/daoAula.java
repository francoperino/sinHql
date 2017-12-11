package daos;

import java.util.ArrayList;

import Entidades.ConsultaGenerica;

public class daoAula {
	 public static ArrayList<ConsultaGenerica> obtenerArrayAulas(String consulta) throws Exception{
	
     ArrayList<ConsultaGenerica> res1 = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta, ConsultaGenerica.class));
		
      
       return res1;

 }
}
