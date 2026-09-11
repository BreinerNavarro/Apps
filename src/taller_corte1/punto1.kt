package taller_corte1

fun main() {

    println("=====================================================")
    println("=          REPARTO DE GASTOS ENTRE AMIGOS           =")
    println("=====================================================\n")

    // Pedimos informacion al usario
    print("¿Pa' dónde es el viaje?: ")
    val destino = readln()

    print("¿Cuánto cuesta el viaje?: $")
    val totalViaje = readln().toDoubleOrNull() ?: 0.0

    print("¿Con cuántos amigos vas?: ")
    val cantAmigos = readln().toIntOrNull() ?: 1

    print("¿De qué denominación son los billetes en efectivo? (ej: 10000): $")
    val denominacion = readln().toIntOrNull() ?: 10000

    // Diccionario para guardar la info de cada amigo
    val registroAbonos = mutableMapOf<Int, Double>()
    var totalAbonos = 0.0

    for (i in 1..cantAmigos) {
        print("¿Amigo $i, cuánto abonó?: ")
        val abono = readln().toDoubleOrNull() ?: 0.0
        registroAbonos[i] = abono
        totalAbonos += abono
    }

    // Cuota base sin tener en cuenta los abonos
    val cuotaBase = totalViaje / cantAmigos

    // Diccionario para guardar lo que le hace falta pagar a cada persona
    val saldosPendientes = mutableMapOf<Int, Double>()
    for ((i, abono) in registroAbonos) {
        saldosPendientes[i] = cuotaBase - abono
    }

    // Resumen General
    println("\n###################### RESUMEN DEL VIAJE ######################")
    println("Destino: $destino")
    println("Costo total del viaje: $$totalViaje")
    println("Total de adelantos recolectados: $$totalAbonos")
    println("Monto total pendiente por recaudar: $${totalViaje - totalAbonos}")
    println("Cuota base teórica por persona: $$cuotaBase")
    println("###############################################################")

    // Detalle individual y pago en efectivo
    println("\n### DETALLE POR PERSONA ###")
    for ((i, saldo) in saldosPendientes) {
        println("\nAmigo $i:")
        println("  • Abonó previamente: $${registroAbonos[i]}")
        println("  • Le corresponde pagar: $$saldo")

        if (saldo > 0) {
            evaluarEfectivo(saldo, denominacion)
        } else if (saldo < 0) {
            println("  • Pagó de más. Se le deben devolver: $${-saldo}")
        } else {
            println("  • ¡Cuota totalmente al día!")
        }
    }
}

fun evaluarEfectivo(monto: Double, denominacion: Int) {
    val residuo = monto % denominacion

    if (residuo == 0.0) {
        val billetes = (monto / denominacion).toInt()
        println("  • Pago exacto: $billetes billetes de $$denominacion.")
    } else {
        val billetesAbajo = (monto / denominacion).toInt()
        val billetesArriba = billetesAbajo + 1

        val falta = residuo
        val sobra = (billetesArriba * denominacion) - monto

        println("  • Pago en billetes de $$denominacion:")
        println("    - Entregando $billetesAbajo billetes ($${billetesAbajo * denominacion}): FALTAN $$falta")
        println("    - Entregando $billetesArriba billetes ($${billetesArriba * denominacion}): SOBRAN $$sobra")
    }
}