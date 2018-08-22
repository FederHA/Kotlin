package paquete2

data class  Persona(val nombre: String, val direccion: String, val edad: Int)

fun main(args: Array<String>) {
    val persona1 = Persona("Feder", "Av: Arquipa", 21)

    println(persona1)

    val persona2 = persona1.copy(nombre = "Maria")

    println(persona2 === persona1)
}