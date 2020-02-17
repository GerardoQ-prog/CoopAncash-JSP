/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import include.ViajeLima;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;



/**
 *
 * @author pc
 */
public class Consultas extends Conexion{
    //metodo para autenticar si existe usuario
    public boolean autenticacion(String usuario, String contraseña_usuario){//campos importantes
        PreparedStatement pst=null;
        ResultSet rs=null;// se guarda el resultado de la consulta
        
        try {
            String consulta="select*from usuarios where usuario = ? and contraseña = ?";//se busca en la bd
            pst=getConexion().prepareStatement(consulta);//se le pasa a la conexion la consulta
            pst.setString(1, usuario);//se pasan los parametros
            pst.setString(2, contraseña_usuario);
            rs=pst.executeQuery();//se guardo el rtesutlado
            
            if(rs.absolute(1)){//se busca si tiene registro
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error"+e);
        }finally{
            try {
                if(getConexion()!=null)getConexion().close();//si la conexion no esta nula se cierraaa
                if(pst!=null)pst.close();
                if(rs!=null)rs.close();//cerrar todas las conexiones
            } catch (Exception e) {
                System.err.println("Error"+e);
            }
        }
        return false;
    }
    public boolean autenticacionadmin(String usuario, String contraseña_usuario){//campos importantes
        PreparedStatement pst=null;
        ResultSet rs=null;// se guarda el resultado de la consulta
        
        try {
            String consulta="select*from usuariosadmin where usuarioadmin = ? and contraseñaadmin = ?";//se busca en la bd
            pst=getConexion().prepareStatement(consulta);//se le pasa a la conexion la consulta
            pst.setString(1, usuario);//se pasan los parametros
            pst.setString(2, contraseña_usuario);
            rs=pst.executeQuery();//se guardo el rtesutlado
            
            if(rs.absolute(1)){//se busca si tiene registro
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error"+e);
        }finally{
            try {
                if(getConexion()!=null)getConexion().close();//si la conexion no esta nula se cierraaa
                if(pst!=null)pst.close();
                if(rs!=null)rs.close();//cerrar todas las conexiones
            } catch (Exception e) {
                System.err.println("Error"+e);
            }
        }
        return false;
    }
    
    public boolean admin(String usuario){//campos importantes
        PreparedStatement pst=null;
        ResultSet rs=null;// se guarda el resultado de la consulta
        
        try {
            String consulta="select usuario from usuarios where usuario = ? ";//se busca en la bd
            pst=getConexion().prepareStatement(consulta);//se le pasa a la conexion la consulta
            pst.setString(1, usuario);//se pasan los parametros
            
            rs=pst.executeQuery();//se guardo el rtesutlado
            
            if(rs.absolute(1)){//se busca si tiene registro
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error"+e);
        }finally{
            try {
                if(getConexion()!=null)getConexion().close();//si la conexion no esta nula se cierraaa
                if(pst!=null)pst.close();
                if(rs!=null)rs.close();//cerrar todas las conexiones
            } catch (Exception e) {
                System.err.println("Error"+e);
            }
        }
        return false;
    }
    public int nivel(String usuario,String contraseña_usuario){
        PreparedStatement pst=null;
        ResultSet rs=null;// se guarda el resultado de la consulta
        int nivel=0;
        try {
            String consulta="select nivel from usuarios where usuario = ? and contraseña = ?";//se busca en la bd
            pst=getConexion().prepareStatement(consulta);//se le pasa a la conexion la consulta
            pst.setString(1, usuario);//se pasan los parametros
            pst.setString(2, contraseña_usuario);
            rs=pst.executeQuery();//se guardo el rtesutlado
            
            while(rs.next()){
                nivel=rs.getInt(1);
                
            }
        } catch (Exception e) {
            System.err.println("Error"+e);
        }finally{
            try {
                if(getConexion()!=null)getConexion().close();//si la conexion no esta nula se cierraaa
                if(pst!=null)pst.close();
                if(rs!=null)rs.close();//cerrar todas las conexiones
            } catch (Exception e) {
                System.err.println("Error"+e);
            }
        }
        return nivel;
        
        
    }
    
    
    
    
    //meotod para registrar
    
    public boolean registrar(String nombre_usuario,String apellido_usuario,String usuario,String contraseña_usuario){
        PreparedStatement pst=null;//con esto se inserta
        
        try {
            String consulta="insert into usuarios(nombre,apellido,usuario,contraseña)values(?,?,?,?)";//la consulta
            
            pst =getConexion().prepareStatement(consulta);//al pst entra la consulta
            pst.setString(1, nombre_usuario);
            pst.setString(2, apellido_usuario);
            pst.setString(3, usuario);
            pst.setString(4, contraseña_usuario);//parametros
            
            if(pst.executeUpdate()==1){
                return true;
            }
            
        } catch (Exception ex) {
             System.err.println("Ertor"+ex);
        } finally{ 
            try {
                if(getConexion()!=null)getConexion().close();
                if(pst!=null)pst.close();
            } catch (Exception e) {
                System.err.println("Ertor"+e);
            }
        }

        return false;
    }
   
      public boolean crear_viaje(String destino , String origen, String empresa, String fecha, String hora,String servicio,int precio){
        PreparedStatement pst=null;
       
        try {
            String sql="call insertViaje(?,?,?,?,?,?,?)";//hacemos la consulta ejecutando el prodecimiento alamcenado
            pst=getConexion().prepareStatement(sql);
            pst.setString(1,destino);
            pst.setString(2,origen);
            pst.setString(3,empresa);
            pst.setString(4,fecha);
            pst.setString(5,hora);
            pst.setString(6,servicio);
            pst.setInt(7,precio);//pasamos los parametros a la consultaaa
            
            if(pst.executeUpdate()==1){//cuando es 1 es que existe algo
                return true;
            }  
        } catch (Exception e) {
            System.err.println("error"+e);
        }finally{
            try {
                if(getConexion()!=null)getConexion().close();
                if(pst!=null)pst.close();
            } catch (Exception e) {
                System.err.println("Error"+e);
            }
        }
        
        return false;
        
    }
    //  public static void main(String[] args) {
     //   Consultas co=new Consultas();
      //    System.out.println( co.crear_producto("aaaa", "asd", 122, "a", "aaaaa", ""));
   // }
      
      
       
       public ArrayList<ViajeLima>getAllViajelima(){
           ArrayList<ViajeLima>viajelima=new ArrayList<>();
          PreparedStatement pst=null;
          ResultSet rs=null;
          
          try {
              String sql="call selectViajeslima()";
              pst=getConexion().prepareCall(sql);
              rs=pst.executeQuery();
              while(rs.next()){
                  viajelima.add(new ViajeLima(rs.getInt("id_viaje"),rs.getString("destino"), rs.getString("origen"), rs.getString("empresa"), 
                          rs.getString("fecha_viaje"), rs.getString("hora_viaje"), rs.getString("servicio"), rs.getInt("precio")));

              }
          } catch (Exception e) {
          }finally{
              try {
                  if(getConexion()!=null)getConexion().close();
                  if(pst!=null)pst.close();
                  if(rs!=null)rs.close();
              } catch (Exception e) {
              }
              
          }
          return viajelima;
       }
       
        public ViajeLima getViajeLima(int id){
            ViajeLima viajelima=null;
         PreparedStatement pst=null;
         ResultSet rs=null;
         try {
             String sql="call selectViajeslimas(?)";
             pst=getConexion().prepareCall(sql);
             pst.setInt(1, id);
             rs=pst.executeQuery();
             while (rs.next()) {    
                 viajelima=new ViajeLima(rs.getInt("id_viaje"),rs.getString("destino"), rs.getString("origen"), rs.getString("empresa"), 
                          rs.getString("fecha_viaje"), rs.getString("hora_viaje"), rs.getString("servicio"), rs.getInt("precio"));
                 
             }
         } catch (Exception e) {
         }finally{
             try {
                 if(rs!=null)rs.close();
                 if(pst!=null)pst.close();
                 if(getConexion()!=null)getConexion().close();
             } catch (Exception e) {
             }
         }
         return viajelima;
     }
       
        public static void main(String[] args) {
            Consultas co=new Consultas();
        Conexion con=new Conexion();
       System.out.print(co.registrar("asd", "aa", "asd", "xd"));
    }

}