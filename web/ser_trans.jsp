<%-- 
    Document   : ser_trans
    Created on : 18/11/2019, 08:24:23 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                width: 100%;
                background-size: cover;

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

        <header>   
            <nav class="navbar navbar-light " style="background-color: white; ">
                <a class="navbar-brand" href="index.jsp">
                    <img class="img-fluid"src="img/logo.PNG" alt="">
                </a> 
                <ul class="nav">

                    <li class="nav-item">
                        <a class="nav-link active" href="index.jsp">INICIO</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">SERVICIOS</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="ser_trans.jsp">SERVICIO DE TRANSPORTE</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="contacto.jsp">CONTACTO</a>
                    </li>
                    <div class="nav-item">
                        <a href="registro.jsp"  class="btn btn-success">REGISTRARSE</a>
                        <a href="iniciosesion.jsp"  class="btn btn-success">INICIAR SESION</a>
                    </div>

                </ul>
            </nav>
        </header>  
        <section class="conteiner-fluid slider">
            <H2 align="center">NUESTROS DESTINOS</H2>
            <div class="card-columns" style="width: 1;">
                <div class="card">
                    <img src="img/lima.jpg" class="card-img-top img-fluid" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">LIMA</h5>
                        <p class="card-text">Lima es la ciudad capital de la República del Perú.​ Se encuentra situada en la costa central del país, a orillas del océano Pacífico, conformando una extensa y populosa área urbana conocida como Lima Metropolitana, flanqueada por el desierto costero y extendida sobre los valles de los ríos Chillón, Rímac y Lurín</p>
                        
                    </div>
                </div>
                <div class="card">
                    <img src="img/huaraz.jpg" class="card-img-top img-fluid"" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">HUARAZ</h5>
                        <p class="card-text">La ciudad de Huaraz está en el Callejón de Huaylas, un valle del norte de Perú. Es la capital del departamento de Ancash y está situada a más de 3000 metros sobre el nivel del mar. Los picos nevados de la Cordillera Blanca conforman su llamativo horizonte oriental. Gran parte de esta cordillera la abarca el Parque Nacional Huarascán, donde habitan los cóndores y jaguares andinos, y se encuentra la montaña más alta de Perú, el macizo Huarascán</p>
                        
                    </div>
                </div>
                <div class="card">
                    <img src="img/carhuaz.jpg" class="card-img-top img-fluid"" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">CARHUAZ</h5>
                        <p class="card-text">Carhuaz, fundada como San Pedro de Carhuaz es una ciudad peruana, capital del distrito y provincia del mismo nombre, ubicada en el departamento de Ancash. Está ubicada a 34 km de Huaraz a 2688 msnm. Cerca de la ciudad, se encuentran las aguas termales de Chancos y el aeropuerto de Anta</p>
                        
                    </div>
                </div>
                
            </div>
            <div class="card" style="width: 29%;align-items: center;margin-left: 476px;
                 ">
                    
                    <div class="card-body">
                        
                        <a href="iniciosesion.jsp"  class="btn btn-success" style="width: 300px; align-items: center;">ESCOGER VIAJE</a>
                    </div>
                </div>
            
            
            
           
            
            
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