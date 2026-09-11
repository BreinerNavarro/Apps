package Basico

fun main() {

    //var x = 3
    //print("la variable es $x")
    // Vamos a crear un programa que simule un email

    /*
    println("Bienvenido a su bandeja de entrada")
    println("Iniciando el sistema.... ")
    print("Listo")
    */


    // Variables

    val nombreUsuario = "Juan"
    var nombreUsuario2 = "Pedro"

    nombreUsuario2 = "camilo"
    println("Usuario : $nombreUsuario")

    var emails = 5
    println("Usuario : $nombreUsuario, emails: $emails")


    var totalEmails : Int = 10
    var porcentaje = 45.5f
    var porcentaje2 : Float = 34.2f
    var porcentaje3 = 56.8
    var totalemails2 : Long = 130000000
    var enviado = true


    //Conversiones

    val numero = 68

    val texto = numero.toString()
    println(texto)
    val entero = "78".toInt()
    println(entero)

    // crear una variable val con el nombre de usuario
    // crear dos variables tipo var de emails recibidos y emails enviados
    // calcular el porcentaje de emails enviados
    // imprimir esto con concatenacion

    var (ejemplo, texto2, boleana, valor) = listOf("hola", "si", true, 67)

    val nombreUser  = "Camilo"
    var recibidos = 12
    var enviados = 8

    var result = (enviados * 100)/(recibidos + enviados)
    println("El porcentaje de emails enviados de $nombreUser es $result %")


    // operadores aritmeticos y modulo

    var totalEmails2 = recibidos + enviados
    var diferencia   = recibidos - enviados
    var enviadospor2 = enviados*2
    var divisionejemplo = recibidos.toFloat()/enviados
    println(divisionejemplo)
    var residuo = enviados%4
    println(residuo)


    // operaciones agrupadas

    var calculo1 = 5 + 20 * 3 // kotlin de la prioridad a la multiplicacion y a la division
    println(calculo1)

    var calculo2 = (5+20)*3
    println(calculo2)


    var contador = 10
    //contador = contador + 1
    contador += 1
    contador -= 1
    contador *=2
    contador /=2
    contador %=2
    print(contador)

    /*
    Una tienda vende un producto a $15.000. Un cliente compra una cantidad determinada de unidades.

    Desarrolla un programa en Kotlin que:

    Establecer la cantidad de productos que desea comprar el usuario.
    Calcule el valor total de la compra.
    Determine cuántos productos puede llevar en paquetes de 3 unidades.
    Determine cuántos productos sobran utilizando el operador módulo %.
    Muestre los resultados en pantalla.

    */

    val precio = 15000
    val cantidad = 5
    val valorTotal = precio * cantidad

    var paquetes = cantidad / 3
    var sobrantes = cantidad % 3

    println("Cantidad de productos : $cantidad")
    println("Valor total : $valorTotal")
    println("Paquetes completos de 3 : $paquetes")
    println("Prodcutos sobrantes : $sobrantes")

}