package Logica;

import java.util.ArrayList;

import Entidades.ConsultaGenerica;
import daos.daoAula;

public class GestorAulas {
	public  ArrayList<ConsultaGenerica> obtenerArrayAulas(String tipoAula,Integer numAlum) throws Exception {
		String consulta=null;
		daoAula da = new daoAula();
		
		if(tipoAula.equals("Informatica")) {
			consulta = "select * from aula a,informatica i where a.numeroaula = i.numeroaula and a.capacidad >= '"+numAlum+"'; ";
		}
		if(tipoAula.equals("Multimedios")) {
			consulta = "select * from aula a,multimedio m where a.numeroaula = m.numeroaula and a.capacidad >= '"+numAlum+"'; ";
		}
		if(tipoAula.equals("Sin recursos adicionales")) {
			consulta = "select * from aula a,sinrecursosadicionales sra where a.numeroaula = sra.numeroaula and a.capacidad >= '"+numAlum+"'; ";
		}
		
		ArrayList<ConsultaGenerica> lista = daoAula.obtenerArrayAulas(consulta);
		
		return lista;
		
	}
}
