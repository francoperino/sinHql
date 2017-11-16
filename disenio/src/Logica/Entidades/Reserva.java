package Logica.Entidades;

import java.util.HashSet;
import java.util.Set;

public class Reserva   {


     private int idreserva;
     private Ciclolectivo ciclolectivo;
     private Curso curso;
     private Docente docente;
     private Usuario usuario;
     private Integer cantalumnos;
     private String tipoaula;
     private Periodica periodica;
     private Set diareservas = new HashSet(0);
     private Esporadica esporadica;

    public Reserva() {
    }

	
    public Reserva(int idreserva, Docente docente) {
        this.idreserva = idreserva;
        this.docente = docente;
    }
    public Reserva(int idreserva, Ciclolectivo ciclolectivo, Curso curso, Docente docente, Usuario usuario, Integer cantalumnos, String tipoaula, Periodica periodica, Set diareservas, Esporadica esporadica) {
       this.idreserva = idreserva;
       this.ciclolectivo = ciclolectivo;
       this.curso = curso;
       this.docente = docente;
       this.usuario = usuario;
       this.cantalumnos = cantalumnos;
       this.tipoaula = tipoaula;
       this.periodica = periodica;
       this.diareservas = diareservas;
       this.esporadica = esporadica;
    }
   
    public int getIdreserva() {
        return this.idreserva;
    }
    
    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }
    public Ciclolectivo getCiclolectivo() {
        return this.ciclolectivo;
    }
    
    public void setCiclolectivo(Ciclolectivo ciclolectivo) {
        this.ciclolectivo = ciclolectivo;
    }
    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Docente getDocente() {
        return this.docente;
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Integer getCantalumnos() {
        return this.cantalumnos;
    }
    
    public void setCantalumnos(Integer cantalumnos) {
        this.cantalumnos = cantalumnos;
    }
    public String getTipoaula() {
        return this.tipoaula;
    }
    
    public void setTipoaula(String tipoaula) {
        this.tipoaula = tipoaula;
    }
    public Periodica getPeriodica() {
        return this.periodica;
    }
    
    public void setPeriodica(Periodica periodica) {
        this.periodica = periodica;
    }
    public Set getDiareservas() {
        return this.diareservas;
    }
    
    public void setDiareservas(Set diareservas) {
        this.diareservas = diareservas;
    }
    public Esporadica getEsporadica() {
        return this.esporadica;
    }
    
    public void setEsporadica(Esporadica esporadica) {
        this.esporadica = esporadica;
    }




}


