package Logica;

import Entidades.Politicadeseguridad;
import daos.daoPoliticasClave;

public class GestorPoliticaClave {
Boolean iguales=false,contiene=false;
         Integer lgm;
 String sign;
			public Integer validarPoliticas(String clave) throws Exception{
          
         daoPoliticasClave dpc = new daoPoliticasClave();
         
        
                 Politicadeseguridad ps =(Politicadeseguridad) dpc.retornarPoliticas();
                 sign = ps.getSignosespeciales();
                 iguales = ps.getIgualaanterior();
                 lgm = ps.getLongclavemin();
                 contiene = ps.getContienedigito();
                 
             
              
             
         
        
        
         if(contiene){
             
             if(clave.length()>=lgm && clave.length()<20){
                 if(esMayuscula(clave)){
                     if(esDigito(clave)){
                         if(esEspecial(clave)){
                             return 0;
                        }else return 1;
                     }else return 2;
                 }else return 3;
             }else return 4;
                  }
                  else 
             
             if(clave.length()>=lgm && clave.length()<20){
                 if(esMayuscula(clave)){
                         if(esEspecial(clave)){
                             return 0;
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
      }

