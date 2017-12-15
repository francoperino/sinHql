package Logica;

import java.util.ArrayList;
import java.util.List;

import Entidades.Bedel;
import Entidades.ConsultaGenerica;
import Entidades.Usuario;
import daos.daoBedel;

public class GestorBedel {

	 public Integer registrarBedel(String apellido,String nombre,String turno,String nickUsuario,String contrasea ) throws Exception{
	       daoBedel db = new daoBedel();
	       GestorPoliticaClave gpc = new GestorPoliticaClave();
	       
	        Integer valor = gpc.validarPoliticas(contrasea);
	        switch(valor){
	            case 0:
	                 if(db.consultarNickBedel(nickUsuario).isEmpty()){
	                	 Bedel b = new Bedel();
	                	 b.setApellido(apellido);
	                	 b.setNombre(nombre);
	                	 b.setNickusuario(nickUsuario);
	                	 b.setTurno(turno);
	                     db.insertarBedel(b,contrasea);
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
     public ArrayList<ConsultaGenerica> BuscarBedel(String turno,String apellido) throws Exception {
    	 ArrayList<ConsultaGenerica> lista = null;
    	 daoBedel db = new daoBedel();
    	 if(apellido.equals("")&& turno.equals("Todos")) {
    		 lista = db.BuscarPorTurno();
    	 }else { 
    	   if(apellido.equals("")) {
    		   lista = db.BuscarPorTurno(turno);
    		 
    	  }
    	   else { 
    		   if(turno.equals("Todos")) {
    			   lista = db.BuscarPorApellido(apellido);
    		   }
    		   else {lista = db.BuscarPorApellidoYTurno(apellido, turno);}
    	 }}
    	 return lista;
     }
	public Integer modificarBedel(String myPass, String tu, String apelido, String nobre,String nick,String contra) throws Exception {
		daoBedel db = new daoBedel();
		GestorPoliticaClave gpc = new GestorPoliticaClave();
	       
        Integer valor = gpc.validarPoliticas(myPass);
        switch(valor){
            case 0:  
            	     
                	 Bedel b = new Bedel();
                	 b.setNickusuario(nick);
                	 b.setApellido(apelido);
                	 b.setNombre(nobre);
                	 b.setTurno(tu);
                	 if(contra.equals(myPass)) {
                		 db.actualizarBedel(b);
                     
                     valor =7 ;    
            	     }
            	     else {
            	    	 db.actualizarBedel(b,myPass);
            	    	 valor = 7;
            	     }
                break;
            default:
                
                
                break;
                
            
        }
                
       return valor; 
	}
	public Bedel obtenerBedel(String nick) throws Exception {
		daoBedel db = new daoBedel();
		return db.buscarPorNick(nick);
	}
}
