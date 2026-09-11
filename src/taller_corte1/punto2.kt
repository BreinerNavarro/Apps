package taller_corte1

fun main() {

    println("=====================================================")
    println("=           VALIDADOR DE ACCESO A EVENTOS           =")
    println("=====================================================\n")

    // Datos de la persona
    print("Ingresa tu nombre: ")
    val nombre = readln()

    print("Ingresa tu edad: ")
    val edad = readln().toIntOrNull() ?: 0

    print("¿Compraste la entrada? Responde (S/N): ")
    val tieneEntrada = readln().trim().lowercase() in listOf("s", "si", "sí")

    print("¿Estás en la lista VIP? Responde (S/N): ")
    val esVip = readln().trim().lowercase() in listOf("s", "si", "sí")

    print("¿Estás reportado como problemático? Responde (S/N): ")
    val esProblematico = readln().trim().lowercase() in listOf("s", "si", "sí")

    // Condiciones de ingreso
    val esMayorDeEdad = edad >= 18

    // Lógica principal
    val puedeIngresar = esMayorDeEdad && (tieneEntrada || esVip) && !(tieneEntrada && esProblematico)

    // Explicación
    val explicacion = when {
        !esMayorDeEdad ->
            "Ingreso negado: debes ser mayor de edad."

        tieneEntrada && esProblematico ->
            "Ingreso negado: tienes entrada, pero estás reportado como problemático."

        !tieneEntrada && !esVip ->
            "Ingreso negado: no tienes entrada ni estás en la lista VIP."

        tieneEntrada ->
            "Ingreso permitido: eres mayor de edad y tienes entrada."

        else ->
            "Ingreso permitido: eres mayor de edad y estás en la lista VIP."
    }

    // Resultado
    println("\n=============== RESULTADO ===============")
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Compró entrada: ${if (tieneEntrada) "Sí" else "No"}")
    println("Está en lista VIP: ${if (esVip) "Sí" else "No"}")
    println("Está reportado como problemático: ${if (esProblematico) "Sí" else "No"}")
    println("Puede ingresar: ${if (puedeIngresar) "Sí" else "No"}")
    println("Explicación: $explicacion")
}