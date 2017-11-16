package Entidades;



import java.util.Date;

public class Clave   {


     private int idclave ;
     private Politicadeseguridad politicadeseguridad;
     private Usuario usuario;
     private String claveactual;
     private Date fechamodificacion;

    public Clave() {
    }

	
    public Clave(int idclave, Politicadeseguridad politicadeseguridad) {
        this.idclave = idclave;
        this.politicadeseguridad = politicadeseguridad;
    }
    public Clave( Politicadeseguridad politicadeseguridad, Usuario usuario, String claveactual, Date fechamodificacion) {
       //this.idclave = idclave;
       this.politicadeseguridad = politicadeseguridad;
       this.usuario = usuario;
       this.claveactual = claveactual;
       this.fechamodificacion = fechamodificacion;
    }
   
    public int getIdclave() {
        return this.idclave;
    }
    
    public void setIdclave(int idclave) {
        this.idclave = idclave;
    }
    public Politicadeseguridad getPoliticadeseguridad() {
        return this.politicadeseguridad;
    }
    
    public void setPoliticadeseguridad(Politicadeseguridad politicadeseguridad) {
        this.politicadeseguridad = politicadeseguridad;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getClaveactual() {
        return this.claveactual;
    }
    
    public void setClaveactual(String claveactual) {
        this.claveactual = claveactual;
    }
    public Date getFechamodificacion() {
        return this.fechamodificacion;
    }
    
    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }




}


