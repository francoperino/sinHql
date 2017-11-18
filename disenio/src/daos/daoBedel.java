package daos;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import Entidades.Bedel;

public class daoBedel {
private PreparedStatement ps;
private Statement stmnt;
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
		
	}

}
