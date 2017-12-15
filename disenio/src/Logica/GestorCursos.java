package Logica;

import java.util.ArrayList;

import Entidades.ConsultaGenerica;
import Entidades.Curso;
import daos.daoCursos;

public class GestorCursos {
	public ArrayList<ConsultaGenerica> buscarCursos() throws Exception{	
		daoCursos dc = new daoCursos();
		return dc.obtenerCursos();
		
	}

	public Curso obtenerCurso(String nomCurso) throws Exception {
		daoCursos dc = new daoCursos();
		return dc.buscarCursoPorNombre(nomCurso);
	}

}