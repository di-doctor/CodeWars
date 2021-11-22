import java.lang.Math.max

class MaxSubStr {
}

fun main() {
    "123Hel12".substring(0,2).also { println(it) }
    val list = listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    val result = maxSeq2(list)
    println(result.sum)
    println(result.list.joinToString(prefix = "{", postfix = "}"))
}

fun maxSeq2(arr: List<Int>): SumList {

    var max = 0
    var list = emptyList<Int>()
    arr.indices.forEach { outer ->
        (outer..arr.size).forEach { inner ->
            val subList = arr.subList(outer, inner)
            val sum  = subList.sum()
            if ( sum > max) {
                max =sum
                list = subList
            }
        }
    }
    return SumList(max,list)
}

fun maxSequence(arr: List<Int>): SumList {
    if (arr.isEmpty() || arr.all { it < 0 }) return SumList(0, emptyList())
    var maxSum = Int.MIN_VALUE
    val listResult = mutableListOf<Int>()
    var listFinish = emptyList<Int>()
    for (index in arr.indices) {
        listResult.clear()
        for (i in index until arr.size) {
            listResult.add(arr[i])
            val sum = listResult.sum()
            if (sum > maxSum) {
                maxSum = sum
                listFinish = listResult.toList()
            }
        }
    }
    return SumList(maxSum, listFinish)
}

data class SumList(val sum: Int, val list: List<Int>)