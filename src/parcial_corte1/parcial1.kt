package apuntes

fun main() {

    println("=============================================")
    println("=           CONTROL DE INVENTARIOS          =")
    println("=============================================\n")

    val unidadesPorCaja = 30
    val cantidadCajas = 10
    val reserva = 90

    val unidadesBodega = unidadesPorCaja * cantidadCajas
    val unidadesDisponibles = unidadesBodega - reserva

    print("¿Cuántas unidades desea pedir?: ")
    val unidadesPedido = readln().toIntOrNull() ?: 0

    val unidadesRestantes = unidadesDisponibles - unidadesPedido

    // Cajas necesarias
    val cajasNecesarias = (unidadesPedido + unidadesPorCaja - 1) / unidadesPorCaja

    // Cajas que quedan completamente llenas
    val cajasCompletas = unidadesPedido / unidadesPorCaja

    // Unidades que quedan por fuera de una caja
    val unidadesPorFuera = unidadesPedido % unidadesPorCaja

    // Por si las unidades lo superan el inventario
    val pedidoValido = unidadesPedido > 0 && unidadesPedido <= unidadesDisponibles

    println("\n======================================")
    println("=               RESUMEN              =")
    println("======================================")

    println("Inventario en bodega: $unidadesBodega")
    println("Unidades reservadas: $reserva")
    println("Unidades disponibles para venta: $unidadesDisponibles")
    println("Unidades pedidas: $unidadesPedido")
    println("Unidades restantes: $unidadesRestantes")
    println("Cajas completas: $cajasCompletas")
    println("Unidades por fuera de cajas completas: $unidadesPorFuera")
    println("Cajas necesarias para empacar todo: $cajasNecesarias")
    println("¿El pedido se puede realizar?: $pedidoValido")
}