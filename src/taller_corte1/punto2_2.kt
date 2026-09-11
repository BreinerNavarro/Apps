package taller_corte1

fun main() {

    println("=====================================================")
    println("=           VALIDADOR DE ACCESO A EVENTOS           =")
    println("=====================================================\n")

    print("Ingresa tu nombre: ")
    val nombre = readln()

    print("Ingresa tu Edad: ")
    val edad = readln().toInt()

    print("¿Tiene entrada? (true/false): ")
    val tieneEntrada = readln().toBoolean()

    print("¿Es VIP? (true/false): ")
    val esVip = readln().toBoolean()

    print("¿Es problemático? (true/false): ")
    val esProblematico = readln().toBoolean()

    val esMayorDeEdad = edad >= 18

    val puedeIngresar = esMayorDeEdad && (tieneEntrada || esVip) && !esProblematico

    println("\n===== RESULTADO =====")
    println("Don $nombre ")
    println("Mayor de edad: $esMayorDeEdad")
    println("Tiene entrada: $tieneEntrada")
    println("Es VIP: $esVip")
    println("Es problemático: $esProblematico")
    println("¿Puede ingresar?: $puedeIngresar")

}