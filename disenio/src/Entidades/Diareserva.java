package Entidades;



import java.util.Date;


public class Diareserva{


     private Aula aula;
     private Reserva reserva;
     private Date horainicio;
     private Date duracion;

    public Diareserva() {
    }

	
    public Diareserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public Diareserva( Aula aula, Reserva reserva, Date horainicio, Date duracion) {
       
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
    public Date getHorainicio() {
        return this.horainicio;
    }
    
    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }
    public Date getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(Date duracion) {
        this.duracion = duracion;
    }




}


