package taller_corte1

fun main(){

    println("=====================================================")
    println("=    CALCULADORA DE PROPINASCON ENTRADA USUARIO     =")
    println("=====================================================\n")

    // Valor del consumo
    print("Ingresa el valor del consumo: $")
    val consumo = readln().toDoubleOrNull() ?: 0.0

    // Cantidad de comensales
    print("Ingresa el número de comensales: ")
    val comensales = readln().toIntOrNull() ?: 1

    // Porcentaje de propina: 10 %
    val porcentajePropina = 0.10

    // Cálculos
    val propina = consumo * porcentajePropina
    val totalPagar = consumo + propina

    // Truco para evitar dividir entre cero
    val valorPorPersona = if (comensales > 0) {
        totalPagar / comensales
    } else {
        totalPagar
    }

    // Mostrar resultados
    println("\n======================================")
    println("=              RESUMEN               =")
    println("======================================")
    println("Consumo: $${"%.2f".format(consumo)}")
    println("Propina (10%): $${"%.2f".format(propina)}")
    println("Número de comensales: $comensales")
    println("Total a pagar: $${"%.2f".format(totalPagar)}")
    println("Valor por persona: $${"%.2f".format(valorPorPersona)}")

}