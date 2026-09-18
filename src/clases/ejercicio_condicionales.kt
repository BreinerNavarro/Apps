package clases

fun clasificarEmail(email : String): String {

    return if (email.contains("admin")){
        "Es usuario Administrador"
    }else if (email.contains("support")){
        "Es usuario Soporte"
    } else {
        "Es usuario Normal"
    }
}

fun main() {
    println("\n=== EJERCICIO ===")
    println("Crea una función llamada 'clasificarEmail' que:")
    println("1. Reciba un email como parámetro")
    println("2. Use if/else if para clasificar:")
    println("   - Si contiene 'admin': ' es usuario Administrador'")
    println("   - Si contiene 'support': 'es usuario de Soporte'")
    println("   - Si no: 'es Usuario normal'")
    println("3. Devuelva la clasificación")
    println("4. Imprimir la clasificación\n")

    print("Ingrese su email: ")
    val email = readLine()?.trim() ?: "Anonymous"

    print(clasificarEmail(email))
}