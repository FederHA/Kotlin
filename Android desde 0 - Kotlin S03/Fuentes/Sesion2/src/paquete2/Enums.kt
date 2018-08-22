package paquete2

import com.sun.crypto.provider.DESParameters

class Departamento(val nombre: String, val direccion: Direccion){

    companion object {
        val ESTE = 1
        val OESTE = 2
        val NORTE = 3
        val SUR = 4
    }
}
enum class Direccion{
    ESTE, OESTE, NORTE, SUR
}
fun main(args: Array<String>) {
    val departamento = Departamento("Piura", Direccion.NORTE)

    val departamento1 = Departamento("Tacna", Direccion.SUR)

}