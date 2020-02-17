<%-- 
    Document   : iniciosesionadmin
    Created on : 25/11/2019, 09:55:33 AM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="dist/css/bootstrap.css">
    <link href="https://fonts.googleapis.com/css?family=Lora|Montserrat&display=swap" rel="stylesheet">
    <link rel="stylesheet"  href="estilos.css">
    <title>Document</title>
   
    <style>
      .slider{
                background: url("img/bus.png");
                background-color: #302f2f;
                background-blend-mode: soft-light;
                height: 100%;
                width: 100%;
                background-size: cover;
                background-position: center;

            }

    </style>
</head>
<body class=" slider conteiner-fluid ">
    <div style="margin-left: 470px;padding-top: 80px;padding-bottom: 30px;">
        <img src="img/logo.PNG">
    <H1 style="color: white">ADMINISTRADORES</H1>
    </div>
    <section class="conteiner-fluid ">
         <div class="col-lg-4 offset-lg-4">
                <div class="card">
                    <h5 class="card-header" text-align="center">Iniciar Sesión</h5>
                    <div class="card-body">
                        <form action="inicioadmin" method="post" >
                            <div class="form-group">
                                <label for="txtCorreo">Usuario</label>
                                <input type="text" class="form-control" name="usuario"  id="usuario" placeholder="Ingresar correo">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Contraseña</label>
                                <input type="password" class="form-control"  name="contra" id="contraseña"placeholder="Ingresar clave">
                            </div>
                            <input type="submit" class="btn btn-success" value="Iniciar Sesion">  
                        </form>
                    </div>
                </div>
            </div>
        </div>   
</section>



    <script src="main.js"></script>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script src="dist/js/bootstrap.js"></script>    
</body>
</html>
