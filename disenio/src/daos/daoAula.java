package daos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import Entidades.Aula;
import Entidades.Ciclolectivo;
import Entidades.ConsultaGenerica;

public class daoAula {
	 public static ArrayList<ConsultaGenerica> obtenerArrayAulas(String consulta) throws Exception{
	
     ArrayList<ConsultaGenerica> res1 = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta, ConsultaGenerica.class));
		
      
       return res1;

 }
	 public Aula obtenerAula(String aul) throws Exception {
	        String consulta2 = "select * from aula a where a.numeroaula = '"+Integer.parseInt(aul)+"' ;";
	        ArrayList<ConsultaGenerica> res = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta2, ConsultaGenerica.class));
	       Aula aula = new Aula();
	       aula.setNumero(Integer.parseInt(res.get(0).getValor("numeroaula")));
		 return aula;
	 }
}
