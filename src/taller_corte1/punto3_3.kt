package taller_corte1

fun main() {
    //declarar variables obligatorias y no obligatorias

    val nombre: String = "Camila Torres"        // obligatorio → NO nullable
    val correo: String = "camila@correo.com"    // obligatorio → NO nullable
    val telefono: String? = null                // opcional → nullable
    val nickname: String? = null                // opcional → nullable
    // si el telefono es null
    val telefonoMostrar = telefono ?: "No registrado"
    // nombre por defecto en el apodo
    val apodoFinal = nickname ?: nombre


    val longitudApodo = apodoFinal?.length ?: 0
    // resumen
    println("===== FICHA DE REGISTRO =====")
    println("Nombre:    $nombre")
    println("Correo:    $correo")
    println("Teléfono:  $telefonoMostrar")
    println("Apodo:     $apodoFinal")
    println("Longitud del apodo: $longitudApodo")
    println("==============================")

}