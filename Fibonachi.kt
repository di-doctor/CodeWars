class Fibonachi {
}

fun main() {
    val value = 100
    val arr = Array<Long>(value+1) { -1 }
    println(arr.contentToString())
   println(fibo(value, arr))

}

fun fibo(n: Int, array: Array<Long>): Long {
    if (array[n] != -1L) return array[n]
    if (n == 1) return 1
    if (n == 0) return 0
    val result: Long = fibo(n - 1, array) + fibo(n - 2, array)
    array[n] = result
    return result
}