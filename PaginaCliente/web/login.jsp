<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <script src="js/ValidarLogin.js" type="text/javascript"></script>
        <title>Login</title>
    </head>
    <body style="background-image: url('img/libreria6.png'); background-size: cover;">
                
        <form class="login"  name="fr" action="index" method="post" >
            <h3 class="text-center">Inicio de sesión</h3>
            <div class="form-group">
                <label>Nombre</label> 
                <input type="text" class="form-control" name="user" id="Nombre" placeholder="Escribe tu nombre">
            </div>
            <div class="form-group">
                <label >Contraseña</label>
                <input type="password" class="form-control" name="pass" id="Pass" placeholder="Escribe tu Contraseña">
            </div>
            <p class="text-center">
                <button class="btn btn-primary btn-block" >Login</button>
            </p>
        </form>
    </body>
</html>
