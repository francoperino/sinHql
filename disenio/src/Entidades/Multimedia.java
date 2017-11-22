package Entidades;





public class Multimedia  {


     private int numero;
     private Aula aula;
     private Boolean pc;
     private Boolean dvd;
     private Boolean tv;
     private Boolean canion;

    public Multimedia() {
    }

	
    public Multimedia(Aula aula) {
        this.aula = aula;
    }
    public Multimedia(Aula aula, Boolean pc, Boolean dvd, Boolean tv, Boolean canion) {
       this.aula = aula;
       this.pc = pc;
       this.dvd = dvd;
       this.tv = tv;
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
    public Boolean getPc() {
        return this.pc;
    }
    
    public void setPc(Boolean pc) {
        this.pc = pc;
    }
    public Boolean getDvd() {
        return this.dvd;
    }
    
    public void setDvd(Boolean dvd) {
        this.dvd = dvd;
    }
    public Boolean getTv() {
        return this.tv;
    }
    
    public void setTv(Boolean tv) {
        this.tv = tv;
    }
    public Boolean getCanion() {
        return this.canion;
    }
    
    public void setCanion(Boolean canion) {
        this.canion = canion;
    }




}


