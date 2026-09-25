package clases

fun main(){
    println("\n=== EJERCICIO ===")
    println("Crea una lista mutable de asuntos de email y:")
    println("1. Agrega 3 asuntos diferentes")
    println("2. Modifica el segundo asunto")
    println("3. Elimina el primer asunto")
    println("4. Muestra la lista final y su tamaño\n")

    val asuntosEmails = mutableListOf< String>()
    println("Nueva lista: ${asuntosEmails.joinToString()}, Tamaño: ${asuntosEmails.size}")

    asuntosEmails.addAll(listOf("asunto1", "asunto2", "asunto3"))
    println("Lista de asuntos: ${asuntosEmails.joinToString()}, Tamaño: ${asuntosEmails.size}")

    asuntosEmails[1] = "Modificado"
    println("Lista de asuntos: ${asuntosEmails.joinToString()}, Tamaño: ${asuntosEmails.size}")

    asuntosEmails.removeAt(0)
    println("Lista de asuntos: ${asuntosEmails.joinToString()}, Tamaño: ${asuntosEmails.size}")

}