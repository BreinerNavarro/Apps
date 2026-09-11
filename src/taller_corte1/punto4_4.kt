package taller_corte1

fun main() {

    println("=====================================================")
    println("=    CALCULADORA DE PROPINAS CON ENTRADA USUARIO    =")
    println("=====================================================\n")

    print("Valor del consumo: $")
    val consumo = readln().toDoubleOrNull() ?: 0.0

    print("Número de comensales: ")
    val comensales = readln().toIntOrNull() ?: 1

    val porcentajePropina = 0.10

    val propina = consumo * porcentajePropina
    val totalPagar = consumo + propina
    val valorPorPersona = totalPagar / comensales

    println("\n===== RESUMEN =====")
    println("Consumo: $$consumo")
    println("Propina: $$propina")
    println("Total a pagar: $$totalPagar")
    println("Valor por persona: $$valorPorPersona")

}