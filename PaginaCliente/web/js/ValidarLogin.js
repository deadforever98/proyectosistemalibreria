function Validar() {
    var nome = document.getElementById("user").value;
    var pass = document.getElementById("pass").value;

    if (pass.length > 8) {
        alert("El tamaño Maximo permitido es de 8 caracteres");
        return false;
    }
}