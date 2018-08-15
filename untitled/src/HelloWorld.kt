fun main(args: Array<String>)
{
   /* println("Hello World!!")


    var edad = 20

    val PI = 3.1415

    var myLong: Long = 1000_000L

    var myLongI  = 1000_000L

    var myChar: Char = '6'

    if(myChar in '0'..'5'){
        println(myChar)
    }

    var myInt2 = myLong.toInt()
    var char = '8'
    val charInt = char.toInt()

    println("Int = $charInt")


    val arrayFloat = arrayOf(12.45F, 12.46F, 12.67F)

    val aa  = arrayOf(112, 'F', 12.5f, 35L, 12, 866, true)

    aa.forEach {item ->
        println(item)
    }
    /****/
    val double = doubleArrayOf(12.5, 45.6)

    val double2 = DoubleArray(5)
    double2[0] = 12.5

    aa.forEachIndexed{ index, item ->
        println("$index = $item")
    }

    val nombre: String? = null
    val tamanio = nombre?.length ?: 0

    println("tamanio $tamanio")*/

    // Condicionales

   /* val edad = 18
    var esAdulto = when {
        edad in 1..7 -> false
        else -> true
    }

    var miRango: IntRange = 1 until 20 // 1..2
    for(x in miRango.reversed() step 2)
    {
        println(x)
    }
    */
    var miRango: IntRange = 1 until 20 // 1..2
    // break@<Etiqueta>
    primerFor@for(x in 1..10){
        println("x = $x")
        segundoFor@for(y in 1..2)
        {
            println("y = $y")
            if (x == 5)
                continue@primerFor
        }
    }
    var t = 10-10
    val h = if(t != 0) print("Es diferente a 0") else fail()
}

fun myFuncion(param: String, param2: Int): Int{
    return 1
}
fun fail(): Nothing
{
    throw Exception("Es Cero")
}


