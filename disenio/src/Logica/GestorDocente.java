package Logica;

import java.util.ArrayList;

import Entidades.ConsultaGenerica;
import Entidades.Docente;
import daos.daoDocente;

public class GestorDocente {

	public ArrayList<ConsultaGenerica> buscarDocente(String id) throws Exception {
		daoDocente dd = new daoDocente();
		return dd.buscarPorId(id);
	}

	public Docente obtenerDocente(String idDocente) throws Exception {
		Docente docente = new Docente();
		daoDocente dd = new daoDocente();
		ArrayList<ConsultaGenerica> doc = new ArrayList<>();
		doc=dd.buscarPorId(idDocente);
		docente.setApellidodoc(doc.get(0).getValor("apellidodoc"));
		docente.setIddocente(Integer.parseInt(doc.get(0).getValor("iddocente")));
		docente.setMaildoc(doc.get(0).getValor("mail"));
		docente.setNombredoc(doc.get(0).getValor("nombredoc"));
		
		return docente;
	}

}