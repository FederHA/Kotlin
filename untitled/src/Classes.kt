fun main(args: Array<String>)
{
    var persona = Persona("Juan", "Av. Arquipa 330", 25)
    var persona2 = Persona("Maria", "Av: 28 de Julio 234")
    persona.abc()
    persona = persona2
    persona.abc()
    myFuncion("Valor param1", "Valor param2", 10)

    myFuncion(param1 = "param111", param3 = 100)

    myFuncion(param2 = "Valor Param2")
}
fun myFuncion(param1: String = "", param2: String? = null, param3: Int = 25){
    println("$param1 $param2 $param3")
}
open class Persona(var nombre: String, var direccion: String, var edad: Int?)
{
    init {
        println("Iniciando Persona")
    }
    constructor(nom: String, dir: String): this(nom, dir, null)

    fun abc(){
        println(" $nombre ")
    }
}

open class ClaseBase(val nombre: String){
    open fun abc(){

    }
}
open class ClaseHija(name: String): ClaseBase(name){
    override fun abc(){
        super.abc()
    }
}

