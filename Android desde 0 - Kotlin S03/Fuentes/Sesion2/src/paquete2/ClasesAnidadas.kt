package paquete2

class Anfitrion{
    var myVariable: String = "miString"

    fun myFuncion(){
        println("Anfitrion.myFuncion()")
    }
    inner class Invitado(){
        fun funcionInvitado(){
            println("Invitado.funcionInvitados($myVariable)")
            myFuncion()
        }
    }
}

fun main(args: Array<String>) {
    val anfitrion = Anfitrion()
    val invitado = anfitrion.Invitado()
    invitado.funcionInvitado()
}