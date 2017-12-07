package daos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entidades.Ciclolectivo;

public class DAOCicloLectivo {

	public Ciclolectivo obtenerCLActual() throws ParseException {
		
		//Datos de ejemplo solamente!!
		Ciclolectivo cl=new Ciclolectivo();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		cl.setIdciclolectivo(1);
		cl.setFechainiciclo(sdf.parse("01-03-2017"));
		cl.setFechafincuatri(sdf.parse("29-06-2017"));
		cl.setFechainicuatri(sdf.parse("01-08-2017"));
		cl.setFechafinciclo(sdf.parse("29-11-2017"));
		
		return cl;
		
	}
}
