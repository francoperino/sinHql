package Logica.Entidades;



import java.util.HashSet;
import java.util.Set;


public class Curso   {


     private String codigocurso;
     private String nombre;
     private Set reservas = new HashSet(0);

    public Curso() {
    }

	
    public Curso(String codigocurso) {
        this.codigocurso = codigocurso;
    }
    public Curso(String codigocurso, String nombre, Set reservas) {
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
    public Set getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }




}


