package apuntes

import kotlin.math.ceil

fun main() {

    println("=====================================================")
    println("=             FICHA DE DATOS OPCIONALES            =")
    println("=====================================================\n")

    // CASO 1: Faltan datos
    val nombre: String = "Breiner Navarro"
    val numDoc: String = "1083028128"
    val correoAlt: String? = null
    val apodoInst: String? = null

    val correoFinal = correoAlt ?: "No registrado"
    val apodoFinal: String? = apodoInst ?: nombre
    val longitudApodo = apodoFinal?.length ?: 0

    println("====================================")
    println("=   CASO 1: DATOS INCOMPLETOS      =")
    println("====================================")
    println("Nombre: $nombre")
    println("Número de documento: $numDoc")
    println("Correo alternativo: $correoFinal")
    println("Apodo: ${apodoFinal ?: "Sin apodo"}")
    println("Longitud del apodo: $longitudApodo")


    // CASO 2: Todos los datos completos
    val nombre2: String = "Laura Gómez"
    val numDoc2: String = "1023456789"
    val correoAlt2: String? = "laura.alterno@email.com"
    val apodoInst2: String? = "Lau"

    val correoFinal2 = correoAlt2 ?: "No registrado"
    val apodoFinal2: String? = apodoInst2 ?: nombre2
    val longitudApodo2 = apodoFinal2?.length ?: 0

    println("\n====================================")
    println("=     CASO 2: DATOS COMPLETOS      =")
    println("====================================")
    println("Nombre: $nombre2")
    println("Número de documento: $numDoc2")
    println("Correo alternativo: $correoFinal2")
    println("Apodo: ${apodoFinal2 ?: "Sin apodo"}")
    println("Longitud del apodo: $longitudApodo2")
}