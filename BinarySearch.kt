
fun main() {

    val arr = Array(100000000) { it }
   // println(arr.joinToString ())
    val a = -12
    val value = binarySearch(arr, a)

    println(if(value >0) "Число $a найдено за $value попыток " else "Число не найдено" )

}

fun binarySearch(array: Array<Int>, value: Int): Int {
    var result = 0
    var low = 0
    var high = array.size -1
    var middle: Int
    while (low <= high) {
        result++
        middle = low +(high - low) / 2
        if (value < array[middle]) {
            high = middle - 1
        } else if (value > array[middle]) {
            low = middle + 1
        } else return result
    }
    return -1
}