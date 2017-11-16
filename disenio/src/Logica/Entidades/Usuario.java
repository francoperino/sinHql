package Logica.Entidades;

public class Usuario {

	protected String nickusuario;
	protected String nombre;
	protected String apellido;
	
	public String getNombre() {
		return nombre;
	}

	public String getNickusuario() {
		return nickusuario;
	}

	public void setNickusuario(String nickusuario) {
		this.nickusuario = nickusuario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	
	public Usuario(){
		super();
	}
	
	

	public Usuario(String nicusuario, String nom, String apelido){
		apellido = apelido;
		nombre = nom;
		nickusuario = nicusuario;
	}

}