package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import Entidades.*;

public class Conexion {
    public static Connection conectar(){
        try {
        	Class.forName("com.mysql.jdbc.Driver").newInstance();
            String connectionUrl = "jdbc:mysql://localhost:3306/disenio";
            Connection conect = DriverManager.getConnection(connectionUrl, "root","");
            return conect;
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
	public static ArrayList<Object> consultar(String query, Class<? extends Object> ob) throws Exception{
        ArrayList<Object> result = new ArrayList<Object>();
        Connection con = null;
        try {
            con = Conexion.conectar();
            ResultSet rs = con.createStatement().executeQuery(query);
            String objeto;
            while(rs.next()){
                objeto = "";
                if(ob == ConsultaGenerica.class){
                    for(int i=1; i<=rs.getMetaData().getColumnCount(); i++){
                        objeto += rs.getMetaData().getColumnName(i) + " -- " + rs.getString(i) + "\t";
                    }
                }
                else{
                    for(int i=1; i<=rs.getMetaData().getColumnCount(); i++){
                        objeto += rs.getString(i) + "\t";
                    }
                }
                Object obj = ob.getConstructor(String.class).newInstance(objeto);
                result.add(obj);
            }
        } 
        catch (Exception ex) {
            throw ex;
        }
        finally{
            if(con != null){
                con.close();
            }
        }
        return result;
    }
    
    public static void ejecutarSentencia(String query) throws Exception{
        Connection con = null;
        try {
            con = Conexion.conectar();
            con.createStatement().executeUpdate(query);
        } catch (Exception ex) {
            throw ex;
        }
        finally{
            if(con != null){
                con.close();
            }
        }
    }
}