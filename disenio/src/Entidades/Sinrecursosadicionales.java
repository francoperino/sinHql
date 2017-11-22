package Entidades;



public class Sinrecursosadicionales {


     private int numero;
     private Aula aula;
     private Boolean ventiladores;

    public Sinrecursosadicionales() {
    }

	
    public Sinrecursosadicionales(Aula aula) {
        this.aula = aula;
    }
    public Sinrecursosadicionales(Aula aula, Boolean ventiladores) {
       this.aula = aula;
       this.ventiladores = ventiladores;
    }
   
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Aula getAula() {
        return this.aula;
    }
    
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public Boolean getVentiladores() {
        return this.ventiladores;
    }
    
    public void setVentiladores(Boolean ventiladores) {
        this.ventiladores = ventiladores;
    }




}


