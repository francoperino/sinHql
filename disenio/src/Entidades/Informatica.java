package Entidades;



public class Informatica   {


     private int numero;
     private Aula aula;
     private Integer cantpc;
     private Boolean canion;

    public Informatica() {
    }

	
    public Informatica(Aula aula) {
        this.aula = aula;
    }
    public Informatica(Aula aula, Integer cantpc, Boolean canion) {
       this.aula = aula;
       this.cantpc = cantpc;
       this.canion = canion;
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
    public Integer getCantpc() {
        return this.cantpc;
    }
    
    public void setCantpc(Integer cantpc) {
        this.cantpc = cantpc;
    }
    public Boolean getCanion() {
        return this.canion;
    }
    
    public void setCanion(Boolean canion) {
        this.canion = canion;
    }




}


