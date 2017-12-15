package daos;

import java.util.ArrayList;

import Entidades.Bedel;
import Entidades.ConsultaGenerica;
import Entidades.Curso;

public class daoCursos {
     public ArrayList<ConsultaGenerica> obtenerCursos() throws Exception{
    	 String consulta ="select c.nombrecurso from curso c;";
    	 ArrayList<ConsultaGenerica> res = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta, ConsultaGenerica.class));
         return res;
     }

	public Curso buscarCursoPorNombre(String nomCurso) throws Exception {
		Curso c = new Curso();
		String consulta ="select * from curso c where c.nombrecurso='"+nomCurso+"';";
		 ArrayList<Curso> res = (ArrayList<Curso>)((Object)Conexion.consultar(consulta, Curso.class));
		 c.setCodigocurso(res.get(0).getCodigocurso());
		 c.setNombre(res.get(0).getNombre());
		return c;
	}
}
