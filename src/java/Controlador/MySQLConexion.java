package conexion;


import java.sql.*;

public class MySQLConexion {

    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url =   "jdbc:mysql://databasetienda.mysql.database.azure.com:3306/tienda?useSSL=true&requireSSL=false";
            String usr = "sandro@databasetienda";
            String psw = "Blesshome@";
            con = DriverManager.getConnection(url, usr, psw);
            System.out.println("conexion ok");
        } catch (ClassNotFoundException ex) {
            System.out.println("No hay Driver!!");
        } catch (SQLException ex) {
            System.out.println("Error con la BD ");
        }
        return con;
    }
    public static void main(String[] args) {
        MySQLConexion.getConexion();
    }
}
