package pruebaservidor;
import java.sql.*;
public class Principal {
 public static void main (String [] args) {
	 try {
		 Class.forName("com.mysql.jdbc.Driver").newInstance();
		 System.out.println("Registro completo");
		 
	 }catch (Exception e) {
		 System.out.println(e.toString());
	 }
 

Connection con=null;

try {

    con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/disenio","root","");
    
    // Otros y operaciones sobre la base de datos...
    
    con.close();

} catch (SQLException ex) {

    // Mantener el control sobre el tipo de error
    System.out.println("SQLException: " + ex.getMessage());

}
}
}
