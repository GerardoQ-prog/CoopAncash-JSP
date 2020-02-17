/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import include.Viaje;
import include.ViajeLima;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pc
 */
public class Addviaje extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        int dni=Integer.parseInt(request.getParameter("dni"));
         int cantidad=Integer.parseInt(request.getParameter("cantidad"));
        int idviaje=Integer.parseInt(request.getParameter("idviaje"));
        
        HttpSession sesion =request.getSession();
        ArrayList<Viaje> viajelima=sesion.getAttribute("carrito")==null?new ArrayList<>():(ArrayList)sesion.getAttribute("carrito");
        boolean flag=false;
        
        if(viajelima.size()>0){
            for(Viaje a : viajelima){
                if(idviaje==a.getIdviaje()){
                    a.setCantidad(a.getCantidad()+cantidad);
                    flag=true;
                    break;
                }
            }
        }
        if(!flag){
            viajelima.add(new Viaje(nombre, apellido, dni, idviaje, cantidad));
        }
        sesion.setAttribute("carrito", viajelima);
        
        response.sendRedirect("reservas.jsp");
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
