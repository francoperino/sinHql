package Logica;
 
import java.util.ArrayList;
 
import Entidades.ConsultaGenerica;
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
    public Integer ConsultaInicio(String nick) throws Exception {
        Integer i =-1;
        if(daoUsuario.obtenerBedel(nick).isEmpty() && daoUsuario.obtenerAdmin(nick).isEmpty()) {
            i=7;
        }else {if(daoUsuario.obtenerAdmin(nick).isEmpty()) {
             i=0;
        }else i=1;
    }
        return i;  
   }
    public ArrayList ConsultaClave( String nick) throws Exception{
        ArrayList<ConsultaGenerica> res = daoUsuario.clave(nick);
        return res;
    }
 
}
