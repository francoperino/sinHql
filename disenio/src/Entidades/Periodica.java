package Entidades;

public class Periodica extends Reserva  {


     private int idreserva;
     private Reserva reserva;
     private String tipoperiodo;

    public Periodica() {
    }

	
    public Periodica(Reserva reserva) {
        this.reserva = reserva;
    }
    public Periodica(Reserva reserva, String tipoperiodo) {
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
    public String getTipoperiodo() {
        return this.tipoperiodo;
    }
    
    public void setTipoperiodo(String tipoperiodo) {
        this.tipoperiodo = tipoperiodo;
    }




}


