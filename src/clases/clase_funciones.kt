package clases

fun mensajeBienvenida() {
    println("====== Sistema de email =====")
    println("Bienvenido al gestor de email")
}

fun saludarUsuario(nombre: String = "Camilo") {
    println("Hola $nombre. Tienes emails nuevos")
}

fun leerEmails(): String{
    println("Ingrese su email")
    val email = readLine()?.trim()?: "Sin correo"
    return email
}

fun leerAsunto(): String{
    println("Ingrese el asunto")
    val asunto = readLine()?.trim()?: "Sin asunto"
    return asunto
}

fun leerMensaje(): String{
    println("Ingrese el mensaje del correo")
    val mensaje = readLine()?.trim()?: "Sin mensaje"
    return mensaje
}

fun main(){
    mensajeBienvenida()
    saludarUsuario("Juan")

    val email = leerEmails()
    val asunto = leerAsunto()
    val mensaje = leerMensaje()
}

fun crearCorreo(destinatario : String, asunto : String, mensaje : String){

    println("***************")
    println("Email creado")
    println("Para : $destinatario")
    println("Asunto : $asunto")
    println("Mensaje : $mensaje")
    println("***************")

}

fun enviarEmail(){
    println("Email enviado ...... ")
}
