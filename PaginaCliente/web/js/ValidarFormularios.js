function ValidarFecha() {
    var fe = document.getElementById("lfecha").value;
    var fv = document.getElementById("lfechaVen").value;
    var fechaE = new Date(fe);
    var fechaV = new Date(fv);

    if (fechaE > fechaV) {
        alert("La fecha " + fe + " no puede ser mayor a la fecha de vencimiento : " + fv);
        return false;
    } else {
        alert("Grabacion Ok.!!");
    }
}