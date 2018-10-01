package mx.edu.ipn.cecyt9.edusite.utils;
import java.sql.*;
 
public class ConexionClase {
 
    private Connection conexion=null;
    private String servidor="localhost";
    private String database="lab3";
    private String usuario="root";
    private String password="n0m3l0";
    private String url="jdbc:mysql://localhost:3306/lab3?zeroDateTimeBehavior=convertToNull [root on Default schema]";
 
    public ConexionClase(String servidor, String database, String usuario, String password){
        try {
 
            this.servidor = servidor;
            this.database = database;
 
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            url="jdbc:mysql://"+servidor+"/"+database;
            conexion=DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion a Base de Datos "+url+" . . . . .Ok");
 
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
 
    public Connection getConexion(){
        return conexion;
    }
 
    public Connection cerrarConexion(){
        try {
            conexion.close();
             System.out.println("Cerrando conexion a "+url+" . . . . . Ok");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        conexion=null;
        return conexion;
    }
}