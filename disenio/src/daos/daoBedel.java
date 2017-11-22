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

public class daoBedel {


private Connection con;

	public  List<Bedel> consultarNickBedel(String nickusuario) throws Exception {
		
		     
		      //String consulta = "select u.apellido,u.nombre,u.nickusuario,b.turno from usuario u,bedel b where (u.nickusuario = b.nickusuario) and b.turno ='"+turno+"' and u.apellido = '"+ape+"'";
		     
		      String consulta = "select * from bedel b where b.nickusuario = '"+nickusuario+"' ;";
		      ArrayList<Bedel> res = (ArrayList<Bedel>)((Object)Conexion.consultar(consulta, Bedel.class));
		     return (res);
	
	 }
	public void insertarBedel(String apellido, String nombre, String turno, String nickUsuario, String contrasea) throws Exception {
		
		Conexion.ejecutarSentencia("insert into usuario(nickusuario,nombre,apellido)"+"values('"+nickUsuario+"','"+nombre+"','"+apellido+"');");
		Conexion.ejecutarSentencia("insert into bedel(nickusuario,turno)"+"values('"+nickUsuario+"','"+turno+"');");
		Calendar c = Calendar.getInstance();
		String dia = Integer.toString(c.get(Calendar.DATE));
		String mes = Integer.toString(c.get(Calendar.MONTH)+1);
		String annio = Integer.toString(c.get(Calendar.YEAR));
		String fechaActual= ""+annio+"-"+mes+"-"+dia+"";
		String consulta= "select MAX(idpolitica) AS maxid from politicadeseguridad;"; 
	    ArrayList<ConsultaGenerica> res = (ArrayList<ConsultaGenerica>)((Object)Conexion.consultar(consulta, ConsultaGenerica.class));  
		Conexion.ejecutarSentencia("insert into clave(nickusuario,claveactual,fechamodificacion,idpolitica)"+"values('"+nickUsuario+"','"+contrasea+"','"+fechaActual+"','"+res.get(0).getValor("maxid")+"');");
		
	}

}
