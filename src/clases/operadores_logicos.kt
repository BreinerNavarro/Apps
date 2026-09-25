package clases

fun main(){
    val email = "juanadminco@gmail.com" // validar si es admin, support u otros

    when{ // Funcion when significa cuando se cumpla algo haga algo
        email.contains(other="admin") -> {
            println("Es un usuario administrador")
        }
        email.contains(other="support") -> {
            println("Es un usuario Soporte")
        }
        else -> {
            println("Es un usuario normal")
        }
    }

    // Retornamos un valor
    val tipousuario = when{
        email.contains(other="admin") -> "Administrador"
        email.contains(other="support") -> "Support"
        else -> "Usuario normal"
    }

    println("El email $email es $tipousuario")

    // Pasar Argumento

    val proveedor = "gmail"

    when(proveedor){
        "gmail" -> println("Google gmail")
        "cafam" -> println("Microsoft Outlook")
        else -> println("Es otro proveedor")
    }
}