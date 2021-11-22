fun main() {
    val array = intArrayOf(20, 37, 21)
    val ar = IntArray(10)

    deleteNth(array, 2).forEach {
        print(it)
    }

}

fun deleteNth(elements: IntArray, maxOcurrences: Int): IntArray {
    val mapIntToInt = mutableMapOf<Int, Int>()
    var valueCount = 0
    elements.groupBy { it }.forEach {
        if (it.value.size < maxOcurrences) {
            mapIntToInt[it.key] = it.value.size
        } else {
            mapIntToInt[it.key] = maxOcurrences
        }

        if (it.value.size > maxOcurrences) {
            valueCount += maxOcurrences
        } else {
            valueCount += it.value.size
        }
    }
    println(mapIntToInt)
    println(valueCount)
    val arr = IntArray(valueCount)
    var indexFinish = 0
    for (item in elements) {
        if (mapIntToInt[item]!! >= 1) {
            arr[indexFinish] = item
            indexFinish++
            mapIntToInt[item] = (mapIntToInt[item]?.minus(1))!!
        }
    }
    return arr
}