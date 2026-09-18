package clases

/*
println("\n=== EJERCICIO ===")
println("Crea una función llamada 'leerDatosCompletos' que:")
println("1. No reciba parámetros")
println("2. Use readLine() para pedir nombre y email")
println("3. Devuelva un mensaje con los datos")
println("Luego úsala en main()")

*/

fun leerDatosCompletos(): String? {
    println("Ingrese su nombre: ")
    val name = readLine()?.trim() ?: "Anonymous"

    println("Ingrese su email")
    val correo = readLine()?.trim() ?: "Anonymous"

    return "Usuario: $name - Correo: $correo"
}

fun main() {
    print(leerDatosCompletos())
}