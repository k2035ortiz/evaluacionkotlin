
fun main (){
    val numeros = arrayOf (1, 2, 3, 4, 5, 6)




    println(sumarPares(numeros)) // Debería imprimir 12 (2 + 4 + 6)
}

fun sumarPares(numeros: Array<Int>): Int {
    var suma = 0
    for (numero in numeros) {
        if (numero % 2 == 0) {
            suma += numero
        }
    }
    return suma
}

