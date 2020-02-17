/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    private String USERNAME="sandro@databasetienda";//
    private String PASSWORD="Blesshome@";//
    private String HOST="databasetienda.mysql.database.azure.com";//
    private String PORT="3306";
    private String DATABASE="cooperativaancash";
    private String CLASSNAME="com.mysql.jdbc.Driver";
    private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE+"?useSSL=true&requireSSL=false";
    private Connection con;
    
    public Conexion(){
        try {
            Class.forName(CLASSNAME);
            con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("conexion ok");
        } catch (ClassNotFoundException e) {
            System.err.println("Error"+e);
        }catch(SQLException ex){
            System.err.println("Error"+ex);
        }
    }
    public Connection getConexion(){
        return con;
    }
    
    public static void main(String[] args) {
        Conexion con=new Conexion();
       con.getConexion();
    }
    
    
}
