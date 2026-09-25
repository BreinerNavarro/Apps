package clases

fun main(){
    println("\n=== EJERCICIO ===")
    println("Crea una función 'evaluarPassword' que use when para:")
    println("1. Si longitud >= 8: 'Fuerte'")
    println("2. Si longitud >= 6: 'Media'")
    println("3. Si no: 'Débil'")

    evaluarPassword("DimeMiNombre")
}

fun evaluarPassword(password: String){
    when{
        password.length >= 8 -> {
            println("La contraseña es Fuerte")
        }
        password.length >= 6 -> {
            println("La contraseña es Media")
        }
        else -> {
            println("La contraseña es debil")
        }
    }
}