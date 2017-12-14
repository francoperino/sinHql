package daos;

import java.util.ArrayList;

import Entidades.ConsultaGenerica;

public class daoDocente {
public ArrayList<ConsultaGenerica> buscarPorId(String id) throws Exception {
	String consultar ="select * from docente c where c.iddocente = '"+id+"';";
	 ArrayList<ConsultaGenerica> res = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consultar, ConsultaGenerica.class));
    return res;
}
}