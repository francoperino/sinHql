package Logica;

import Entidades.Usuario;
import daos.daoUsuario;

public class GestorUsuario {
	
	public static Usuario getUsuario(String nickusuario) throws Exception {
		try {
			return daoUsuario.getUsuario(nickusuario);
		}
		catch(Exception ex) {
			throw ex;
		}
	}

}
