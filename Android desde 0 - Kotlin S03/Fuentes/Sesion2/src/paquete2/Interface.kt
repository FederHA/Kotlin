package paquete2

import kotlin.concurrent.thread

/*
interface Drinkable{
    fun drink()

    fun funcion(){
        println("Drinkable.funcion")
    }
}

class Animal: Drinkable{
    override fun drink(){
        println("Drinking...")
    }

    override fun funcion() {
        println("Animal.funcion")
        super.funcion()
    }
}
*/
interface  onClickListener{
    fun onClick()
}

class Boton{

    fun setOnClickListener(onClickListener: onClickListener){
        thread(start = true){
            onClickListener.onClick()
        }
    }
}

class MiPantall: onClickListener{

    val miBoton = Boton()

    init {
        miBoton.setOnClickListener(this)
    }

    override fun onClick() {
        println("onClick")
    }
}

fun main(args: Array<String>) {
    /*val animal = Animal();
    animal.drink()
    animal.funcion()*/

    val boton = Boton()
    boton.setOnClickListener(object: onClickListener{
         override fun onClick() {
            println("onClick")
        }
    })

}