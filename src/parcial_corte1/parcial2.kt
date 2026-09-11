package apuntes

fun main(){

    println("=============================================")
    println("=         COMPRADOR PLANES STRIMING         =")
    println("=============================================\n")

    var antiguedad = 13
    var pendPago = false
    var planFamiliar = false
    var promanterior = true

    println("Antiguedad Usuario: $antiguedad")
    println("Usuario debe: $pendPago")
    println("Tiene plan Familiar: $planFamiliar")
    println("Ussuario ha tenido promo: $promanterior")

    var activarPromo = antiguedad > 12 && !pendPago && !promanterior && !planFamiliar

    println("El Usuario se le puede activar promo: $activarPromo")
}