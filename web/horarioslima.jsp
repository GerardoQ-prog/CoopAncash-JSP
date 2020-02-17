<%-- 
    Document   : horarioslima
    Created on : 20/11/2019, 11:36:58 AM
    Author     : pc
--%>

<%@page import="include.Controlador_Viajelima"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession objsesion=request.getSession(false);//aqui la sesion ya inicio
    String usuario=(String)objsesion.getAttribute("usuario");
    if(usuario.equals("")){
        response.sendRedirect("iniciosesion.jsp");
    }
    
    %>
    
    
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link href="https://fonts.googleapis.com/css?family=Lora|Montserrat&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="dist/css/bootstrap.css">
        <link rel="stylesheet" href="dist/css/estilos.css">
        <title>Cooperativa Ancash</title>
        <style>
            .slider{
                background: url("img/bus.png");
                height: 100%;
                width: 100% ;
                background-size: cover;
                padding-top: 50px;
                padding-bottom: 50px;
                

            }

            footer{

                width: 100%;
                height: 230px;
                background-color:black;
                color: white; 

            }

        </style>
    </head>
    <body>


        <nav class="navbar navbar-light" style="background-color: white;">
            <a class="navbar-brand" href="index_1.jsp">
                <img class="img-fluid"src="img/logo.PNG" alt="">
            </a> 
            <ul class="nav">

                <li class="nav-item">
                    <a class="nav-link active" href="index_1.jsp">INICIO</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">SERVICIOS</a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="ser_trans_1.jsp">SERVICIO DE TRANSPORTE</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contacto.jsp">CONTACTO</a>
                </li>
                <li class="nav-item">
                    <a class="nav-item nav-link active" >Bienvenido: <% out.println(usuario);%></a>
                </li>
                <div class="nav-item">
                    <a href="reservas.jsp" class="btn btn-success">MIS RESERVAS</a>
                    <a href="index.jsp"  class="btn btn-success">SALIR</a>
                </div>
            </ul>
        </nav>
                <section class="conteiner-fluid slider">
                    
                    <h1 align="center">ESCOGER VIAJE</h1>
                    <table class="table table-hover" id="testTable" style="background-color: white; width: 90%; margin-left: 50px;">
  <thead >
    <tr>
      <th scope="col">Nro</th>
      <th scope="col">Destino</th>
      <th scope="col">Origen</th>
      <th scope="col">Empresa</th>
      <th scope="col">Fecha</th>
      <th scope="col">Hora </th>
      <th scope="col">Servicio</th>
      <th scope="col">Precio</th>
      <th scope="col">Seleccione</th>
    </tr>
  </thead>  
 <%
            Controlador_Viajelima cp= new Controlador_Viajelima();
            %>
            <%= cp.getViewViajeLima()
                %> 
    
           
            </table>  
    </section>
                
                 <footer class="page-footer font-small blue pt-4">
            <div class="container-fluid text-center text-md-left">
                <div class="row">
                    <div class="col-md-6 mt-md-0 mt-3">
                        <h5 class="text-uppercase">Cooperativa de Transporte Ancash</h5>
                        <p>Tu mejor opción para viajar.</p>
                    </div>
                    <hr class="clearfix w-100 d-md-none pb-3">
                    <div class="col-md-3 mb-md-0 mb-3">
                        <h5 class="text-uppercase">Redes Sociales</h5>
                        <ul class="list-unstyled">
                            <li>
                                <a href="https://www.facebook.com/">Facebook</a>
                            </li>
                            <li>
                                <a href="https://twitter.com/?lang=es">Twitter</a>
                            </li>
                            <li>
                                <a href="https://www.instagram.com/">Instagram</a>
                            </li>
                            <li>
                                <a href="https://web.whatsapp.com/">WhatsApp</a>
                            </li>
                        </ul>
                    </div>
                   
                </div>
            </div>
            <div class="footer-copyright text-center py-3">© 2018 Copyright: COOPERATIVA DE TRANSPORTES ANCASH </div>
        </footer>
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="dist/js/bootstrap.js"></script>
</html>


