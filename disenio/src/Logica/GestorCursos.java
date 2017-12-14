package Logica;

import java.util.ArrayList;

import Entidades.ConsultaGenerica;
import daos.daoCursos;

public class GestorCursos {
	public ArrayList<ConsultaGenerica> buscarCursos() throws Exception{	
		daoCursos dc = new daoCursos();
		return dc.obtenerCursos();
		
	}

}