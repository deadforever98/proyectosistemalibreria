function ValidarSesion(){
    var res = confirm("¿Esta Seguro que desea Cerrar Sesion?");
    
    if(res ===false){
        return false;   
    }
}