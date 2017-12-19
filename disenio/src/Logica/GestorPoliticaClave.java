package Logica;

import java.util.ArrayList;

import Entidades.Clave;
import Entidades.Politicadeseguridad;
import daos.daoPoliticasClave;

public class GestorPoliticaClave {
Boolean iguales=false,contiene=false;
         Integer lgm;
 String sign;
			public Integer validarPoliticas(Clave clave ,String nickBedel) throws Exception{
				 daoPoliticasClave dpc = new daoPoliticasClave();       
                 Politicadeseguridad ps =(Politicadeseguridad) dpc.retornarPoliticas();
                 sign = ps.getSignosespeciales();
                 iguales = ps.getIgualaanterior();
                 lgm = ps.getLongclavemin();
                 contiene = ps.getContienedigito();
         if(contiene){ 
             if(clave.getClaveactual().length()>=lgm && clave.getClaveactual().length()<20){
                 if(esMayuscula(clave.getClaveactual())){
                     if(esDigito(clave.getClaveactual())){
                         if(esEspecial(clave.getClaveactual())){
                        	 if(iguales) {
                        		 if(noEstaEnHistorial(clave.getClaveactual(),nickBedel))	return 0;
                        		 else return 5;
                        	 }else	return 0;
                        }else return 1;
                     }else return 2;
                 }else return 3;
             }else return 4;
                  }
                  else     
             if(clave.getClaveactual().length()>=lgm && clave.getClaveactual().length()<20){
                 if(esMayuscula(clave.getClaveactual())){
                         if(esEspecial(clave.getClaveactual())){
                        	 if(iguales) {
                        		 if(noEstaEnHistorial(clave.getClaveactual(),nickBedel))	return 0;
                        		 else return 5;
                        	 }else	return 0;
                        }else return 1;
                 }else return 3;
             }else return 4;     
          }
         public boolean esMayuscula(String clave){
        	 boolean mayuscula=false;
             for(int i=0; i<clave.length(); i++){
                 if(Character.isUpperCase(clave.charAt(i))){
                     mayuscula=true;
                 }
             }
         return mayuscula;
         }
         public boolean esDigito(String clave){  
             boolean esDigito=false;
             for(int i=0; i<clave.length(); i++){
                 if(Character.isDigit(clave.charAt(i))){
                     esDigito=true;
                 }
             }
         return esDigito;
         }
         public boolean esEspecial(String clave){
             boolean esEspecial=false;
             for(int i=0; i<clave.length(); i++){
                 int resultado = sign.indexOf(clave.charAt(i));

                 if(resultado !=-1){
                     esEspecial=true;
                 }
             }
         return esEspecial;
         }
         public boolean noEstaEnHistorial(String clave, String nomBedel) throws Exception{
        	 GestorBedel gb= new GestorBedel();
        	 ArrayList<String> historial= new ArrayList<>();
        	 historial= gb.historialBedel(nomBedel);
        	 boolean existeEnHistorial= historial.contains(clave);
			return !existeEnHistorial;
        	 
         }
      }

