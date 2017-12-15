package Entidades;



import java.util.Date;


public class Diareserva{


     private Aula aula;
     private Reserva reserva;
     private String horainicio;
     private String duracion;
     private String diacalendario;

    public Diareserva() {
    }

	
    public Diareserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public Diareserva( Aula aula, Reserva reserva, String horainicio, String duracion) {
       
       this.aula = aula;
       this.reserva = reserva;
       this.horainicio = horainicio;
       this.duracion = duracion;
    }
   

    public Aula getAula() {
        return this.aula;
    }
    
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public Reserva getReserva() {
        return this.reserva;
    }
    
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public String getHorainicio() {
        return this.horainicio;
    }
    
    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }
    public String getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }


	public String getDiacalendario() {
		return diacalendario;
	}


	public void setDiacalendario(String diacalendario) {
		this.diacalendario = diacalendario;
	}




}


