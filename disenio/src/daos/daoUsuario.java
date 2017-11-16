package daos;

import java.util.ArrayList;

import Entidades.Usuario;

public class daoUsuario {
	public static Usuario getUsuario(String nickusuario) throws Exception {
		try {
			return ((ArrayList<Usuario>)((Object)Conexion.consultar(("SELECT * FROM Usuario WHERE Nickusuario = '" + nickusuario + "';"), Usuario.class))).get(0);
		}
		catch(Exception ex) {
			throw ex;
		}
	}
}
