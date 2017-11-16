package Logica.Entidades;

public class Periodica   {


     private int idreserva;
     private Reserva reserva;
     private Integer tipoperiodo;

    public Periodica() {
    }

	
    public Periodica(Reserva reserva) {
        this.reserva = reserva;
    }
    public Periodica(Reserva reserva, Integer tipoperiodo) {
       this.reserva = reserva;
       this.tipoperiodo = tipoperiodo;
    }
   
    public int getIdreserva() {
        return this.idreserva;
    }
    
    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }
    public Reserva getReserva() {
        return this.reserva;
    }
    
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public Integer getTipoperiodo() {
        return this.tipoperiodo;
    }
    
    public void setTipoperiodo(Integer tipoperiodo) {
        this.tipoperiodo = tipoperiodo;
    }




}


