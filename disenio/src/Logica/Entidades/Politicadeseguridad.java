package Logica.Entidades;

import java.util.HashSet;
import java.util.Set;


public class Politicadeseguridad  {


     private int idpolitica;
     private String signosespeciales;
     private Integer longclavemin;
     private Boolean contienedigito;
     private Boolean igualaanterior;
     private Set claves = new HashSet(0);

    public Politicadeseguridad() {
    }

	
    public Politicadeseguridad(int idpolitica) {
        this.idpolitica = idpolitica;
    }
    public Politicadeseguridad( String signosespeciales, Integer longclavemin, Boolean contienedigito, Boolean igualaanterior, Set claves) {
       //this.idpolitica = idpolitica;
       this.signosespeciales = signosespeciales;
       this.longclavemin = longclavemin;
       this.contienedigito = contienedigito;
       this.igualaanterior = igualaanterior;
       this.claves = claves;
    }
   
    public int getIdpolitica() {
        return this.idpolitica;
    }
    
    public void setIdpolitica(int idpolitica) {
        this.idpolitica = idpolitica;
    }
    public String getSignosespeciales() {
        return this.signosespeciales;
    }
    
    public void setSignosespeciales(String signosespeciales) {
        this.signosespeciales = signosespeciales;
    }
    public Integer getLongclavemin() {
        return this.longclavemin;
    }
    
    public void setLongclavemin(Integer longclavemin) {
        this.longclavemin = longclavemin;
    }
    public Boolean getContienedigito() {
        return this.contienedigito;
    }
    
    public void setContienedigito(Boolean contienedigito) {
        this.contienedigito = contienedigito;
    }
    public Boolean getIgualaanterior() {
        return this.igualaanterior;
    }
    
    public void setIgualaanterior(Boolean igualaanterior) {
        this.igualaanterior = igualaanterior;
    }
    public Set getClaves() {
        return this.claves;
    }
    
    public void setClaves(Set claves) {
        this.claves = claves;
    }




}


