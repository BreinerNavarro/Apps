package clases

fun main(){
    // tipo de arreglo para elemtos fijos su valor no cambia
    val emails = arrayOf("juan@gmail","pedro@live","maria@hotmail","lina@outlook")
    val cantidad = arrayOf(2,4,10,6)

    println("El primer Correo es: ${emails[0]}")
    println("El segundo Correo es: ${emails[1]}")
    println("El tercer Correo es: ${emails[2]}")
    println("El cuarto Correo es: ${emails[3]}")
    //println("El quinto Correo es: ${emails[4]}")

    println(emails.contentToString()) // Imprimir el arreglo

    emails[0] = "carlos@yahoo"
    emails.set(2,"camila@facebook")

    println(emails.joinToString()) // Imprimir el arreglo
    println(emails.size)

    // listas mutables
    val nuevosEmails = mutableListOf<String>()
    println("Nueva lista: ${nuevosEmails.joinToString()}, Tamaño: ${nuevosEmails.size}")

    nuevosEmails.addAll(emails)

    println("Nueva lista: ${nuevosEmails.joinToString()}, Tamaño: ${nuevosEmails.size}")

    nuevosEmails.removeAt(0)

    println("Nueva lista: ${nuevosEmails.joinToString()}, Tamaño: ${nuevosEmails.size}")

    val emails2 = listOf<String>("juan@gmail","pedro@live","maria@hotmail","lina@outlook","juanita@outlook")
    val nuevosemails2 = emails2.subList(0,3)
    println(nuevosemails2.joinToString())

    println(emails2.last())
    println(emails2.first())
    println(emails2.lastIndex)
}