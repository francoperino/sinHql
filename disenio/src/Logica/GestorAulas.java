package Logica;
 
import java.util.ArrayList;

import Entidades.Aula;
import Entidades.ConsultaGenerica;
import daos.Conexion;
import daos.daoAula;
 
public class GestorAulas {
    public  static ArrayList<ConsultaGenerica> obtenerArrayAulas(String tipoAula,Integer numAlum) throws Exception {
        String consulta=null;
      
       
        if(tipoAula.equals("Informatica")) {
            consulta = "select * from aula a,informatica i where a.numeroaula = i.numeroaula and a.capacidad >= '"+numAlum+"' and a.estado ='1' ; ";
        }
        if(tipoAula.equals("Multimedios")) {
            consulta = "select * from aula a,multimedio m where a.numeroaula = m.numeroaula and a.capacidad >= '"+numAlum+"' and a.estado ='1';  ";
        }
        if(tipoAula.equals("Sin recursos adicionales")) {
            consulta = "select * from aula a,sinrecursosadicionales sra where a.numeroaula = sra.numeroaula and a.capacidad >= '"+numAlum+"' and a.estado ='1'; ";
        }
       
        ArrayList<ConsultaGenerica> lista = daoAula.obtenerArrayAulas(consulta);
       
        return lista;
       
    }
    public Aula obtenerAula(String aul) throws Exception {
      daoAula da = new daoAula();
	 return da.obtenerAula(aul);
 }
}