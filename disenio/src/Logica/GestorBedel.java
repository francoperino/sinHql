package Logica;

import Entidades.Bedel;
import Entidades.Usuario;
import daos.daoBedel;
import daos.daoUsuario;

public class GestorBedel {

	 public Integer registrarBedel(String apellido,String nombre,String turno,String nickUsuario,String contrasea ) throws Exception{
	       daoBedel db = new daoBedel();
	       GestorPoliticaClave gpc = new GestorPoliticaClave();
	       
	        Integer valor = gpc.validarClave(contrasea);
	        switch(valor){
	            case 0:
	                 if(db.consultarNickBedel(nickUsuario).isEmpty()){
	                     db.insertarBedel(apellido,nombre,turno,nickUsuario,contrasea);
	                     valor =7 ;
	                     
	                 }
	                 else{
	                     valor = 100;
	                 }
	                break;
	            default:
	                
	                
	                break;
	                
	            
	        }
	                
	       return valor; 
	    }
}
