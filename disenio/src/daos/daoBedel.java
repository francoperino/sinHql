package daos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.sql.Connection;

//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.Statement;

import Entidades.Bedel;
import Entidades.ConsultaGenerica;
import Entidades.Politicadeseguridad;
import Entidades.Usuario;

public class daoBedel {


private Connection con;


	public  List<Bedel> consultarNickBedel(String nickusuario) throws Exception {
		
		     
		      //String consulta = "select u.apellido,u.nombre,u.nickusuario,b.turno from usuario u,bedel b where (u.nickusuario = b.nickusuario) and b.turno ='"+turno+"' and u.apellido = '"+ape+"'";
		     
		      String consulta = "select * from bedel b where b.nickusuario = '"+nickusuario+"' ;";
		      ArrayList<Bedel> res = (ArrayList<Bedel>)((Object)Conexion.consultar(consulta, Bedel.class));
		     return (res);
	
	 }
	public void insertarBedel(Bedel b, String contrasea) throws Exception {
		
		Conexion.ejecutarSentencia("insert into usuario(nickusuario,nombre,apellido)"+"values('"+b.getNickusuario()+"','"+b.getNombre()+"','"+b.getApellido()+"');");
		Conexion.ejecutarSentencia("insert into bedel(nickusuario,turno)"+"values('"+b.getNickusuario()+"','"+b.getTurno()+"');");
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH)+1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		String fechaActual= ""+annio+"-"+mes+"-"+dia+"";
		String consulta= "select MAX(idpolitica) AS maxid from politicadeseguridad;"; 
	    ArrayList<ConsultaGenerica> res = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta, ConsultaGenerica.class));  
		Conexion.ejecutarSentencia("insert into clave(nickusuario,claveactual,fechamodificacion,idpolitica)"+"values('"+b.getNickusuario()+"','"+contrasea+"','"+fechaActual+"','"+res.get(0).getValor("maxid")+"');");
		
	}
    public ArrayList <ConsultaGenerica> BuscarPorTurno(String turno) throws Exception{
    	String consulta1 = "select * from bedel b, Usuario u where b.turno = '"+turno+"' and u.nickusuario = b.nickusuario;";
    	ArrayList<ConsultaGenerica> res1 = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta1, ConsultaGenerica.class));  
    	
    	return res1;
    	
    }
    public ArrayList <ConsultaGenerica> BuscarPorTurno() throws Exception{
    	String consulta1 = "select * from bedel b, Usuario u where  u.nickusuario = b.nickusuario;";
    	ArrayList<ConsultaGenerica> res1 = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta1, ConsultaGenerica.class));  
    	
    	return res1;
    }
    public ArrayList <ConsultaGenerica> BuscarPorApellido(String ape) throws Exception{
    	String consulta1 = "select * from bedel b, Usuario u where  u.nickusuario = b.nickusuario and upper(u.apellido) like '"+ape.toUpperCase()+"%';";
    	ArrayList<ConsultaGenerica> res1 = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta1, ConsultaGenerica.class));
		return res1;  
    	
    }
    public ArrayList<ConsultaGenerica> BuscarPorApellidoYTurno(String apel,String tur) throws Exception{
    	String consulta1 = "select * from bedel b, Usuario u where  u.nickusuario = b.nickusuario and upper(u.apellido) like ' "+apel.toUpperCase()+"%'and b.turno = '"+tur+"';";
    	ArrayList<ConsultaGenerica> res1 = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta1, ConsultaGenerica.class));
		return res1; 
	
}
}
