package Entidades;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Curso   {


     private String codigocurso;
     private String nombre;
     private ArrayList reservas = new ArrayList<>();
     public Curso(String datos) {
 		String[] params = datos.split("\t");
 		this.codigocurso = params[0];
 		this.nombre = params[1];
     }
    public Curso() {
    }

	
    public Curso(String codigocurso,Boolean b) {
        this.codigocurso = codigocurso;
    }
    public Curso(String codigocurso, String nombre, ArrayList reservas) {
       this.codigocurso = codigocurso;
       this.nombre = nombre;
       this.reservas = reservas;
    }
   
    public String getCodigocurso() {
        return this.codigocurso;
    }
    
    public void setCodigocurso(String codigocurso) {
        this.codigocurso = codigocurso;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList getReservas() {
        return this.reservas;
    }
    
    public void setReservas(ArrayList reservas) {
        this.reservas = reservas;
    }




}


