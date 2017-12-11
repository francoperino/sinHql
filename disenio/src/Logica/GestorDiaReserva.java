package Logica;

import java.util.ArrayList;

import daos.daoDiaReserva;

public class GestorDiaReserva {
	daoDiaReserva ddr = new daoDiaReserva();
	public  String[][] buscarAulasDisp(String fecha,String aulas,String horaInicio,String duracion){
       
      
      
    	  ddr.buscarDR(fecha,aulas, horaInicio,duracion) ;
     
		
		
		
		return null;
		
	}

}
