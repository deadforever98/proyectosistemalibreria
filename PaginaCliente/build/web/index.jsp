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
        <%@include file="WEB-INF/jspf/header.jspf" %>

        <%@include file="WEB-INF/jspf/carrusel.jspf" %>

        <div style="background-image: url('img/libreria6.png'); background-size: cover;">
            <br><br>
            <div class="container">

                <div class="row">
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <img src="img/libroimg.jpg" width="100%" height="225">
                            
                            <div class="card-body">
                                <p class="card-text">En esta seccion podras encontrar una pequeña muestra de los libros que poseemos.</p>
                                <div class="d-flex justify-content-center align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn  btn-outline-success">Ir a Libros</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <img src="img/coleccion.jpg"  width="100%" height="225">
                            
                            <div class="card-body">
                                <p class="card-text">Si aun no te decides por algun libro, esta sección es para ti. Aqui podras encontrar algunas sugerencias.</p>
                                <div class="d-flex justify-content-center align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn  btn-outline-success">Ir a Colecciones</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <img src="img/autor.jpg" width="100%" height="225">

                            <div class="card-body">
                                <p class="card-text">Eres fanatico de un autor en especifico? Entonces esta seccion es para ti, no dudes y dale clic al boton de abajo.</p>
                                <div class="d-flex justify-content-center align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn  btn-outline-success">Ir a Autores</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-2"></div>

                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            <img src="img/contactanos.png"  width="100%" height="225">

                            <div class="card-body">
                                <p class="card-text">Estas interesado en contactarnos? No dudes mas, atenderemos todas tus dudas y consultas.</p>
                                <div class="d-flex justify-content-center align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn  btn-outline-success">Ir a Contactos</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="card mb-4 shadow-sm">
                            
                            <img src="img/ensayos.jpg" width="100%" height="225">

                            <div class="card-body">
                                <p class="card-text">Te dejaron una tarea y necesitas fuentes confiables? En esta seccion podras encontrar informacion veridicas.</p>
                                <div class="d-flex justify-content-center align-items-center">
                                    <div class="btn-group">
                                        <button type="button" class="btn  btn-outline-success">Ir a Ensayos y Humanidades</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br><%@include file="WEB-INF/jspf/footer.jspf" %> <br>


    </body>
</html>
