<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/Menu.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/estilos.css">
        <script src="js/Sesion.js" type="text/javascript"></script>
        <title>Libros</title>

        <%@include file="WEB-INF/jspf/scripts.jspf" %>
        <%@include file="WEB-INF/jspf/styles.jspf" %>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/nav.jspf" %>

        <div style="background-image: url('img/libreria6.png'); background-size: cover;">
            <br><br>
            <div class="container">
                <div class="row p-4 p-md-5 mb-5 text-white rounded bg-dark">
                    <div class="col-md-3"></div>
                    <div class="col-md-6 col-sm-12 px-0 text-center">
                        <h1 class="display-4 font-italic">Vale la pena que te roben una lagrima un suspiro una risa o el aliento si el ladron <b>ES UN LIBRO </b></h1>
                        <p class="lead my-3">Autor: Anonimo</p>
                    </div>
                </div>
            </div>





            <div class="container">
                <div class="row g-0 border rounded overflow-hidden flex-md-row shadow-sm h-md-250 position-relative bg-white">
                    <div class="col p-4 d-flex flex-column position-static">
                        <strong class="d-inline-block mb-2 text-success">Novela de Miguel de Cervantes</strong>
                        <h3 class="mb-0">El ingenioso caballero Don Quijote de la Mancha</h3>
                        <div class="mb-1 text-muted">Sintesis</div>
                        <p class="mb-auto">Don Quijote de la Mancha​ es una novela escrita por el español Miguel de Cervantes Saavedra. Publicada su primera parte con el título de El ingenioso hidalgo don Quijote de la Mancha a comienzos....</p>
                        <div class="mb-1 text-muted">Genero: Parodia, Sátira, Ficción de aventuras, Farsa, Ficción histórica, Novela psicológica</div>
                    </div>
                    <div class="col-auto d-none d-lg-block">
                        <img class="bd-placeholder-img" src="img/libro1.jpeg" width="200" height="100%" alt="img">
                    </div>
                </div>
            </div>
            <br><br>
            <div class="container">
                <div class="row g-0 border rounded overflow-hidden flex-md-row shadow-sm h-md-250 position-relative bg-white">
                    <div class="col-auto d-none d-lg-block">
                        <img class="bd-placeholder-img" src="img/libro2.jpg" width="200" height="100%" alt="img">

                    </div>
                    <div class="col p-4 d-flex flex-column position-static">
                        <strong class="d-inline-block mb-2 text-success text-right">Libro de Fernando Trujillo</strong>
                        <h3 class="mb-0 text-right">La biblia de los caídos</h3>
                        <div class="mb-1 text-muted text-right">Sintesis</div>
                        <p class="mb-auto text-right">El mundo cuenta con un lado oculto, una cara sobrenatural que nos susurra, que se intuye, pero que muy pocos perciben. La inmensa mayoría de las personas no es consciente de ese lado paranormal... ni de sus riesgos.
                            A veces la gente se topa con esos peligros y desespera, se atemoriza, y no sabe qué hacer ni a quién recurrir. Pero no todo está perdido...</p>
                        <div class="mb-1 text-muted text-right">Generos: Literatura Fantastica, suspenso, ficcion paranormal</div>
                    </div>

                </div>
            </div>
            <br><br>

            <div class="container">
                <div class="row g-0 border rounded overflow-hidden flex-md-row shadow-sm h-md-250 position-relative bg-white">
                    <div class="col p-4 d-flex flex-column position-static">
                        <strong class="d-inline-block mb-2 text-success">Novela de Miguel de Cervantes</strong>
                        <h3 class="mb-0">El hijo de la perdición</h3>
                        <div class="mb-1 text-muted">Sintesis</div>
                        <p class="mb-auto">Son tiempos convulsos: la Tercera Guerra Mundial acaba de terminar, mientras se planea la inminente firma de un tratado de desnuclearización entre Rusia, la Liga Árabe e Israel. Paralelamente, las Fuerzas de Paz de la ONU ocupan el templo Moria y las fronteras israelíes. Pronto el Templo de Jerusalén será reconstruido en el cuadrante norte. Pero entonces el Arca de la Alianza es descubierta, y el Hijo de la Perdición se prepara para gobernar...</p>
                        <div class="mb-1 text-muted">Genero: Alta fantasía, Thriller, Suspenso, Literatura fantástica, Ficción religiosa</div>
                    </div>
                    <div class="col-auto d-none d-lg-block">
                        <img class="bd-placeholder-img" src="img/libro3.jpg" width="200" height="100%" alt="img">

                    </div>
                </div>
            </div>
            <br><br>
            
            <div class="container">
                <div class="row g-0 border rounded overflow-hidden flex-md-row shadow-sm h-md-250 position-relative bg-white">
                    <div class="col-auto d-none d-lg-block">
                        <img class="bd-placeholder-img" src="img/libro4.jpg" width="200" height="100%" alt="img">

                    </div>
                    <div class="col p-4 d-flex flex-column position-static">
                        <strong class="d-inline-block mb-2 text-success text-right">Libro de Wendy Alec</strong>
                        <h3 class="mb-0 text-right">Los ojos de mi princesa</h3>
                        <div class="mb-1 text-muted text-right">Sintesis</div>
                        <p class="mb-auto text-right">Relata la historia de José Carlos, un joven estudiante de quince años, que se enamora de una joven compañera del colegio a la que él llama Sheccid, cuyo nombre real es Lorenna Deghemteri. ... José Carlos tendrá que superar muchos problemas para por fin estar cerca de su princesa.</p>
                        <div class="mb-1 text-muted text-right">Genero: Novela rosa, Ficción adulto joven</div>
                    </div>

                </div>
            </div><br><br>
            
        </div>
        <br>
        <%@include file="WEB-INF/jspf/footer.jspf" %> <br>


    </body>
</html>
