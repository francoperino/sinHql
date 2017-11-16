package Entidades;
// Generated 26/10/2017 18:27:25 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Ciclolectivo   {


     private int idciclolectivo;
     private Date fechainicuatri;
     private Date fechafinciclo;
     private Date fechainiciclo;
     private Date fechafincuatri;
     private String descripcion;
     private Set reservas = new HashSet(0);

    public Ciclolectivo() {
    }

	
    public Ciclolectivo(int idciclolectivo) {
        this.idciclolectivo = idciclolectivo;
    }
    public Ciclolectivo(int idciclolectivo, Date fechainicuatri, Date fechafinciclo, Date fechainiciclo, Date fechafincuatri, String descripcion, Set reservas) {
       this.idciclolectivo = idciclolectivo;
       this.fechainicuatri = fechainicuatri;
       this.fechafinciclo = fechafinciclo;
       this.fechainiciclo = fechainiciclo;
       this.fechafincuatri = fechafincuatri;
       this.descripcion = descripcion;
       this.reservas = reservas;
    }
   
    public int getIdciclolectivo() {
        return this.idciclolectivo;
    }
    
    public void setIdciclolectivo(int idciclolectivo) {
        this.idciclolectivo = idciclolectivo;
    }
    public Date getFechainicuatri() {
        return this.fechainicuatri;
    }
    
    public void setFechainicuatri(Date fechainicuatri) {
        this.fechainicuatri = fechainicuatri;
    }
    public Date getFechafinciclo() {
        return this.fechafinciclo;
    }
    
    public void setFechafinciclo(Date fechafinciclo) {
        this.fechafinciclo = fechafinciclo;
    }
    public Date getFechainiciclo() {
        return this.fechainiciclo;
    }
    
    public void setFechainiciclo(Date fechainiciclo) {
        this.fechainiciclo = fechainiciclo;
    }
    public Date getFechafincuatri() {
        return this.fechafincuatri;
    }
    
    public void setFechafincuatri(Date fechafincuatri) {
        this.fechafincuatri = fechafincuatri;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getReservas() {
        return this.reservas;
    }
    
    public void setReservas(Set reservas) {
        this.reservas = reservas;
    }




}


