package Logica;

import java.text.ParseException;

import Entidades.Ciclolectivo;
import daos.DAOCicloLectivo;

public class GestorCicloLectivo {

	public Ciclolectivo obtenerCicloLectivo(String periodo) throws ParseException {
		DAOCicloLectivo dcl=new DAOCicloLectivo();
		return dcl.obtenerCLActual();
	}
}
