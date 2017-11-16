package Logica.Entidades;
// Generated 26/10/2017 18:27:25 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Aula {


     private int numero;
     private Integer capacidad;
     private Integer piso;
     private Boolean estadohabitado;
     private Date fechafincuatri;
     private String tipopizarron;
     private Boolean aireacodicionado;
     private Informatica informatica;
     private Set diareservas = new HashSet(0);
     private Multimedia multimedia;
     private Sinrecursosadicionales sinrecursosadicionales;

    public Aula() {
    }

	
    public Aula(int numero) {
        this.numero = numero;
    }
    public Aula(int numero, Integer capacidad, Integer piso, Boolean estadohabitado, Date fechafincuatri, String tipopizarron, Boolean aireacodicionado, Informatica informatica, Set diareservas, Multimedia multimedia, Sinrecursosadicionales sinrecursosadicionales) {
       this.numero = numero;
       this.capacidad = capacidad;
       this.piso = piso;
       this.estadohabitado = estadohabitado;
       this.fechafincuatri = fechafincuatri;
       this.tipopizarron = tipopizarron;
       this.aireacodicionado = aireacodicionado;
       this.informatica = informatica;
       this.diareservas = diareservas;
       this.multimedia = multimedia;
       this.sinrecursosadicionales = sinrecursosadicionales;
    }
   
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Integer getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public Integer getPiso() {
        return this.piso;
    }
    
    public void setPiso(Integer piso) {
        this.piso = piso;
    }
    public Boolean getEstadohabitado() {
        return this.estadohabitado;
    }
    
    public void setEstadohabitado(Boolean estadohabitado) {
        this.estadohabitado = estadohabitado;
    }
    public Date getFechafincuatri() {
        return this.fechafincuatri;
    }
    
    public void setFechafincuatri(Date fechafincuatri) {
        this.fechafincuatri = fechafincuatri;
    }
    public String getTipopizarron() {
        return this.tipopizarron;
    }
    
    public void setTipopizarron(String tipopizarron) {
        this.tipopizarron = tipopizarron;
    }
    public Boolean getAireacodicionado() {
        return this.aireacodicionado;
    }
    
    public void setAireacodicionado(Boolean aireacodicionado) {
        this.aireacodicionado = aireacodicionado;
    }
    public Informatica getInformatica() {
        return this.informatica;
    }
    
    public void setInformatica(Informatica informatica) {
        this.informatica = informatica;
    }
    public Set getDiareservas() {
        return this.diareservas;
    }
    
    public void setDiareservas(Set diareservas) {
        this.diareservas = diareservas;
    }
    public Multimedia getMultimedia() {
        return this.multimedia;
    }
    
    public void setMultimedia(Multimedia multimedia) {
        this.multimedia = multimedia;
    }
    public Sinrecursosadicionales getSinrecursosadicionales() {
        return this.sinrecursosadicionales;
    }
    
    public void setSinrecursosadicionales(Sinrecursosadicionales sinrecursosadicionales) {
        this.sinrecursosadicionales = sinrecursosadicionales;
    }




}


