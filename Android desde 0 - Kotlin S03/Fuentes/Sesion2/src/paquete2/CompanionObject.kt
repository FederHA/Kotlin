package paquete2

class MiClaseNormal{
    val variableObjeto = 200

    fun funcionDeObjecto(){

    }

    companion object {
        val variableDeClase = 500

        fun funcionDeClase(){

        }
    }
}

object MySingleton{
    init {
        println("Instancia Creada")
    }

    fun myFuncion(){

    }
}

fun main(args: Array<String>) {
    MySingleton.myFuncion()
    MySingleton.myFuncion()
    MySingleton.myFuncion()
    MySingleton.myFuncion()

}