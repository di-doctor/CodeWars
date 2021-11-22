import kotlin.math.pow
import kotlin.math.sqrt

class SumArray {
}

fun main() {
    /*   val arr = Array(10) { it }
       println(arr.sum())
     println(sum(arr))*/
    println(lenCurve(1000))
}

fun sum(array: Array<Int>, index: Int = 0): Int {
    if (index >= array.size) return 0
    return array[index] + sum(array, index + 1)
}

fun lenCurve(n: Int): Double {
    val listX = List(n + 1) { index: Int -> index.toDouble() / n }
    val listY = listX.map {
        it * it
    }
    /*println(listX.size)
    println(listY.size)*/
    var sum = 0.0
    for (index in 0..listX.size-2) {
        sum += sqrt((listX[index+1] - listX[index]).pow(2) + (listY[index+1] - listY[index]).pow(2))
    }

    return sum
}