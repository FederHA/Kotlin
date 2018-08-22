import paquete1.ClaseA
import paquete2.ClaseB
import paquete2.ClaseA as ClassA
import paquete1.PI
import paquete1.MyClass.Companion.myFuncionDeClase


fun main(args: Array<String>){
    /*val claseA = ClaseA()

    val claseB = ClaseB()
    val claseA2 = ClaseA()

    myFuncionDeClase()*/

    val empleado = Empleado("Feder", 21, "Av. Guillermo Dansey 701", "Desarrollador")
    empleado.correr()
    empleado.caminar()
    empleado.mostrarInformacion()
    println("--------------------------------")
    var visitante = Visitante("Carlin", 25, "Av Venezuela", "Desarrollador")
    visitante.correr()
    visitante.caminar()
    visitante.mostrarInformacion()
}

abstract class Persona(val nombre: String,
                       val edad: Int,
                       val direccion: String)

{
    abstract var Ocupacion: String

    abstract fun correr()

    abstract fun caminar()

    fun mostrarInformacion(){
        println("Nombre $nombre, Edad $edad, Direccion $direccion")
    }
}


class Empleado(nombre: String,
                edad: Int,
                direccion: String,
                override var Ocupacion: String)
    : Persona(nombre, edad, direccion ){


    override fun correr() {
        println("Empleado $nombre Corriendo")
    }

    override fun caminar() {
        println("Empleado $nombre Caminando")
    }

}

class Visitante(nombre: String,
               edad: Int,
               direccion: String,
               override var Ocupacion: String)
    : Persona(nombre, edad, direccion ){


    override fun correr() {
        println("Visitante $nombre Corriendo")
    }

    override fun caminar() {
        println("Visitante $nombre Caminando")
    }

}


