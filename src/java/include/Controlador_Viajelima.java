/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package include;

import Controlador.Consultas;

/**
 *
 * @author pc
 */
public class Controlador_Viajelima {
    
    public String getViewViajeLima(){
     String htmlcode="";
         Consultas consultas=new Consultas();
    for(ViajeLima p: consultas.getAllViajelima()){
            htmlcode+=
"  <tbody>\n" +
"    <tr>\n" +
"      <td>"+p.getId()+"</td>\n" +
"      <td>"+p.getDestino()+"</td>\n" +
"      <td>"+p.getOrigen()+"</td>\n" +
"      <td>"+p.getEmpresa()+"</td>\n" +
"      <td>"+p.getFecha()+"</td>\n" +
"      <td>"+p.getHora()+"</td>\n" +
"      <td>"+p.getServicio()+"</td>\n" + 
 "      <td>S/"+p.getPrecio()+"</td>\n" +
"      <td><a href=\"lima.jsp?id="+p.getId()+"\" class=\"btn btn-success\">ELEGIR</a></td>\n" +  
"    </tr>\n" +
"  </tbody>\n";

                            
                        
    }
    return htmlcode;
    }
    public String getViewViajeLima1(){
     String htmlcode="";
         Consultas consultas=new Consultas();
    for(ViajeLima p: consultas.getAllViajelima()){
            htmlcode+=
"  <tbody>\n" +
"    <tr>\n" +
"      <td>"+p.getId()+"</td>\n" +
"      <td>"+p.getDestino()+"</td>\n" +
"      <td>"+p.getOrigen()+"</td>\n" +
"      <td>"+p.getEmpresa()+"</td>\n" +
"      <td>"+p.getFecha()+"</td>\n" +
"      <td>"+p.getHora()+"</td>\n" +
"      <td>"+p.getServicio()+"</td>\n" + 
 "      <td>S/"+p.getPrecio()+"</td>\n" + 
"    </tr>\n" +
"  </tbody>\n";

                            
                        
    }
    return htmlcode;
    }
    
     public ViajeLima getviajelima(int id){
         return new Consultas().getViajeLima(id);
     }
}


