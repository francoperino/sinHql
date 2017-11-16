package Entidades;





public class Esporadica   {


     private int idreserva;
     private Reserva reserva;

    public Esporadica() {
    }

    public Esporadica(Reserva reserva) {
       this.reserva = reserva;
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




}


