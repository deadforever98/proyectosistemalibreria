<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/Menu.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/estilos.css">
        <script src="js/Sesion.js" type="text/javascript"></script>
        <title>Pagina Principal</title>

        <%@include file="WEB-INF/jspf/scripts.jspf" %>
        <%@include file="WEB-INF/jspf/styles.jspf" %>
    </head>
    <body>
        <h1>AUTORES</h1>
        <%@include file="WEB-INF/jspf/nav.jspf" %>

        <%@include file="WEB-INF/jspf/carrusel.jspf" %>

        <div class="container"><br><br>
            <form style="margin: auto;width: 800px;" action="ControlllerContacto" method="post">
                <div class="form-group row">
                    <h2 style="color: #3D3FD3;">Generar Contacto</h2>
                </div>
                <div class="form-group row">
                    <input type="text"  class="form-control col-lg-5" placeholder="Nombre" required="" name="nombre">
                </div>

                <div class="form-group row">
                    <input type="email"  class="form-control col-lg-5" placeholder="Correo Electronico" required="" name="correo">
                </div>

                <div class="form-group row">
                    <input type="text"  class="form-control col-lg-5" placeholder="Celular" required="" name="celular">
                </div>
                <div class="form-group row">
                    <textarea  rows="4"  class="form-control col-lg-5" placeholder="Hola Estoy interesado(a) solicito más informacion" name="comentario">
                        
                    </textarea>
                </div>
                <div class="form-group row">
                    <input type="submit" value="Solicito Informacion" class="btn btn-success col-lg-5" name="opcion">
                </div>

        </div>
    </form>
</div>


</body>
</html>
