package Logica;

import java.text.ParseException;

import Entidades.Ciclolectivo;

public class GestorReserva {

	public String [][] consultarDiaReserva(String tipoAula, String periodo, String cantAlumnos,String[] horaInicio, String[] duracion, String[] diaSemana) throws ParseException {
		
		GestorCicloLectivo gcl= new GestorCicloLectivo();
		Ciclolectivo cl=new Ciclolectivo();
		cl=gcl.obtenerCicloLectivo(periodo);
		
		
		
		String a[][] = {{"a"},{"e"}};
		return a;
	}
}
