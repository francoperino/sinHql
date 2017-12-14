package daos;
 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;
 
import Entidades.Ciclolectivo;
import Entidades.ConsultaGenerica;
 
public class daoCicloLectivo {
 
 
 
    public Ciclolectivo obtenerClactual() throws Exception {
        String consulta = "select MAX(c.idciclolectivo) AS maxid from ciclolectivo c ";
        ArrayList<ConsultaGenerica> res1 = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta, ConsultaGenerica.class));  
        String consulta2 = "select * from ciclolectivo c where c.idciclolectivo = '"+res1.get(0).getValor("maxid")+"' ;";
        ArrayList<ConsultaGenerica> res = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta2, ConsultaGenerica.class));
        Ciclolectivo cl=new Ciclolectivo();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        cl.setIdciclolectivo(Integer.parseInt(res.get(0).getValor("idciclolectivo")));
        cl.setFechainiciclo(res.get(0).getValor("fechainiciclo"));
        cl.setFechafincuatri(res.get(0).getValor("fechafincuatri"));
        cl.setFechainicuatri(res.get(0).getValor("fechainicuatri"));
        cl.setFechafinciclo(res.get(0).getValor("fechafinciclo"));
        return cl;
       
    }
   
}