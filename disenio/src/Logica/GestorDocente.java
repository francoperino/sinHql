package Logica;

import java.util.ArrayList;

import Entidades.ConsultaGenerica;
import daos.daoDocente;

public class GestorDocente {

	public ArrayList<ConsultaGenerica> buscarDocente(String id) throws Exception {
		daoDocente dd = new daoDocente();
		return dd.buscarPorId(id);
	}

}