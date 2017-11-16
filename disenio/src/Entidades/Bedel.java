package Entidades;

public class Bedel extends Usuario {
	protected String turno;
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
	

}
