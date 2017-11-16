package pruebaservidor;
import java.sql.*;
import java.util.ArrayList;

import Entidades.*;
import daos.Conexion;
public class preparestatement {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
	 /*
  try {
   Class.forName("com.mysql.jdbc.Driver").newInstance();
   System.out.println("Registro completo");
  } catch (Exception e) {
   // TODO: handle exception
   System.out.println(e.toString());
  }
  
  Connection con=null;
  //PreparedStatement consulta;
 // ResultSet resultado;
  try {
      con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/disenio","root","");
      String turno = "Tarde";
      String ape = "mansilla";
      String consulta = "select u.apellido,u.nombre,u.nickusuario,b.turno from usuario u,bedel b where (u.nickusuario = b.nickusuario) and b.turno ='"+turno+"' and u.apellido = '"+ape+"'";
      // Otros y operaciones sobre la base de datos...
      
      /*
      Statement stmt = con.createStatement();
      ResultSet rset = stmt.executeQuery(consulta);
      while(rset.next()){
       System.out.println(rset.getString(1)+" "+
         rset.getString(2)+" "+rset.getString(3)+" "+
         rset.getString(4));
      }
      
      con.close();

  } catch (SQLException ex) {

      // Mantener el control sobre el tipo de error
      System.out.println("SQLException: " + ex.getMessage());

  }
  */
	 
	 try {
	      String turno = "Tarde";
	      String ape = "mansilla";
	      //String consulta = "select u.apellido,u.nombre,u.nickusuario,b.turno from usuario u,bedel b where (u.nickusuario = b.nickusuario) and b.turno ='"+turno+"' and u.apellido = '"+ape+"'";
	      String filtro = "A";
	      String consulta = "select * from usuario WHERE Nombre LIKE '%" + filtro + "%';";
	      ArrayList<Usuario> res = (ArrayList<Usuario>)((Object)Conexion.consultar(consulta, Usuario.class));
	      for(Usuario usu : res) {
	    	  System.out.print(usu.getNickusuario() + " - " + usu.getNombre() + " - " + usu.getApellido());
	    	  System.out.println();
	      }
	 }
	 catch(Exception ex) {
	      System.out.println("Exception: " + ex.getMessage());
	 }
 }

}
