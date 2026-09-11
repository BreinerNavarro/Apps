package taller_corte1

fun main() {

    println("=====================================================")
    println("=             FICHA DE DATOS OPCIONALES             =")
    println("=====================================================\n")

    // CASO 1: Faltan datos
    val nombre1: String = "Breiner Navarro"
    val correo1: String = "breiner@email.com"
    val telefono1: String? = null
    val apodo1: String? = null

    val telefonoFinal1 = telefono1 ?: "No registrado"
    val apodoFinal1: String? = apodo1 ?: nombre1
    val longitudApodo1 = apodoFinal1?.length ?: 0

    println("====================================")
    println("=   CASO 1: DATOS INCOMPLETOS      =")
    println("====================================")
    println("Nombre: $nombre1")
    println("Correo: $correo1")
    println("Teléfono: $telefonoFinal1")
    println("Apodo: ${apodoFinal1 ?: "Sin apodo"}")
    println("Longitud del apodo: $longitudApodo1")


    // CASO 2: Todos los datos completos
    val nombre2: String = "Laura Gómez"
    val correo2: String = "laura@email.com"
    val telefono2: String? = "3001234567"
    val apodo2: String? = "Lau"

    val telefonoFinal2 = telefono2 ?: "No registrado"
    val apodoFinal2: String? = apodo2 ?: nombre2
    val longitudApodo2 = apodoFinal2?.length ?: 0

    println("\n===================================")
    println("    CASO 2: DATOS COMPLETOS")
    println("===================================")
    println("Nombre: $nombre2")
    println("Correo: $correo2")
    println("Teléfono: $telefonoFinal2")
    println("Apodo: ${apodoFinal2 ?: "Sin apodo"}")
    println("Longitud del apodo: $longitudApodo2")
}