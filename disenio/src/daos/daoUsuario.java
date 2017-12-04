package daos;
 
import java.util.ArrayList;
 
import Entidades.Admin;
import Entidades.Bedel;
import Entidades.ConsultaGenerica;
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
    public static ArrayList<Bedel> obtenerBedel(String nick) throws Exception {
         String consulta = "select * from bedel b where b.nickusuario = '"+nick+"' ;";
          ArrayList<Bedel> res = (ArrayList<Bedel>)((Object)Conexion.consultar(consulta, Bedel.class));
          return res;
    }
    public static ArrayList<Admin> obtenerAdmin(String nick)throws Exception{
        String consulta = "select * from Admin a where a.nickusuario = '"+nick+"' ;";
          ArrayList<Admin> res = (ArrayList<Admin>)((Object)Conexion.consultar(consulta, Admin.class));
          return res;
    }
    public static ArrayList<ConsultaGenerica> clave(String nick) throws Exception {
       
        String consulta1 = "select MAX(c.idclave) AS maxid from clave c where c.nickusuario = '"+nick+"';";
        ArrayList<ConsultaGenerica> res = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta1, ConsultaGenerica.class));
		 Integer id = Integer.parseInt(res.get(0).getValor("maxid"));
		String consulta = "select  c.claveactual from clave c where  c.idclave='"+Integer.parseInt(res.get(0).getValor("maxid"))+"';";
        ArrayList<ConsultaGenerica> res1 = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta, ConsultaGenerica.class));
         
          return res1;
    }
}