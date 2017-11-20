package daos;

import java.util.ArrayList;
import java.util.List;

import Entidades.Bedel;
import Entidades.ConsultaGenerica;
import Entidades.Politicadeseguridad;
import Entidades.Usuario;

public class daoPoliticasClave {
	public  Politicadeseguridad retornarPoliticas() throws Exception  {
        
         String consulta1= "select MAX(idpolitica) AS maxid from politicadeseguridad;"; 
 	    ArrayList<ConsultaGenerica> res1 = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta1, ConsultaGenerica.class));  
	     String consulta2 = "select * from politicadeseguridad p where p.idpolitica = '"+res1.get(0).getValor("maxid")+"' ;";
	     
	     return ((ArrayList<Politicadeseguridad>)((Object)Conexion.consultar((consulta2), Politicadeseguridad.class))).get(0);

}
}
