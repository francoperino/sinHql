package Logica.Entidades;


import java.util.HashSet;
import java.util.Set;


public class Docente   {


     private int iddocente;
     private String apellidodoc;
     private String nombredoc;
     private String maildoc;
     private Set reservas = new HashSet(0);

    public Docente() {
    }

	
    public Docente(int iddocente) {
        this.iddocente = iddocente;
    }
    public Docente(int iddocente, String apellidodoc, String nombredoc, String maildoc, Set reservas) {
       this.iddocente = iddocente;
       this.apellidodoc = apellidodoc;
       this.nombredoc = nombredoc;
       this.maildoc = maildoc;
       this.reservas = reservas;
    }
   
    public int getIddocente() {
        return this.iddocente;
    }
    
    public void setIddocente(int iddocente) {
        this.iddocente = iddocente;
    }
    public String getApellidodoc() {
        return this.apellidodoc;
    }
    
    public void setApellidodoc(String apellidodoc) {
        this.apellidodoc = apellidodoc;
    }
    public String getNombredoc() {
        return this.nombredoc;
    }
    
    public void setNombredoc(String nombredoc) {
        this.nombredoc = nombredoc;
    }
    public String getMaildoc() {
        return this.maildoc;
    }
    
    public void setMaildoc(String maildoc) {
        this.maildoc = maildoc;
    }
    public Set getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }




}


