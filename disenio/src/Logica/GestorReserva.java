package Logica;

import java.text.ParseException;
import java.util.ArrayList;

import Entidades.Ciclolectivo;

public class GestorReserva {
	public  String[][] buscarAulasDisp(ArrayList fecha,ArrayList aulas,ArrayList horaInicio,ArrayList duracion){
	//public String [][] consultarDiaReserva(String tipoAula, String periodo, String cantAlumnos,String[] horaInicio, String[] duracion, String[] diaSemana) throws ParseException {
		/*GestorCicloLectivo gcl= new GestorCicloLectivo();
		Ciclolectivo cl=new Ciclolectivo();
		cl=gcl.obtenerCicloLectivo(periodo);
		String a[][] = {{"a"},{"e"}};*/
		int tam = fecha.size(); 
		GestorDiaReserva gdr = new GestorDiaReserva();
		for(int i=0; i<tam;i++) {
			gdr.buscarAulasDisp(fecha, aulas, horaInicio, duracion);
		}
		return null;
	}
}
