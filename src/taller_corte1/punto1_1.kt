package taller_corte1
import kotlin.math.ceil

fun main() {
    // Datos de entrada
    val costoTotal = 850000.0
    val adelanto = 100000.0
    val numPersonas = 6
    val denominacionBillete = 10000.0

    // Reparto
    val saldoARepartir = costoTotal - adelanto
    val valorPorPersona = saldoARepartir / numPersonas

    // Cálculo de pago en efectivo con billetes
    val billetesNecesarios = ceil(valorPorPersona / denominacionBillete).toInt()
    val pagoEnEfectivo = billetesNecesarios * denominacionBillete
    val sobrante = pagoEnEfectivo - valorPorPersona

    // Resumen
    println("Costo total del viaje:       $${"%,.2f".format(costoTotal)}")
    println("Adelanto ya pagado:          $${"%,.2f".format(adelanto)}")
    println("Saldo a repartir:            $${"%,.2f".format(saldoARepartir)}")
    println("Número de personas:          $numPersonas")
    println("-------------------------------------------")
    println("Valor exacto por persona:    $${"%,.2f".format(valorPorPersona)}")
    println("Denominación de billete:     $${"%,.0f".format(denominacionBillete)}")
    println("Billetes")

}