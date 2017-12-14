package Logica;
 
import java.text.ParseException;
 
import Entidades.Ciclolectivo;
import daos.daoCicloLectivo;
 
public class GestorCicloLectivo {
 
    public Ciclolectivo obtenerCicloLectivo() throws Exception {
        daoCicloLectivo dcl=new daoCicloLectivo();
        return dcl.obtenerClactual();
    }
}