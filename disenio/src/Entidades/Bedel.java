package Entidades;

public class Bedel extends Usuario {
	protected String turno;
	private Clave clave;
	public Bedel(String datos) {
		String[] params = datos.split("\t");
		nickusuario = params[0];
		turno = params[1];
		
	}
	public Bedel(String nickusuario,String turno) {
		this.turno = turno;
		this.nickusuario = nickusuario;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Bedel() {
		
	}
	public Clave getClave() {
		return clave;
	}
	public void setClave(Clave clave) {
		this.clave = clave;
	}

}
