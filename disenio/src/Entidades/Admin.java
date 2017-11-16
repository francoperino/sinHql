package Entidades;

import Logica.GestorUsuario;

public class Admin extends Usuario {
	public Admin(String datos) {
		String[] params = datos.split("\t");
		this.nickusuario = params[0];
		try {
			Usuario usu = GestorUsuario.getUsuario(this.nickusuario);
			this.nombre = usu.getNombre();
			this.apellido = usu.getApellido();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
