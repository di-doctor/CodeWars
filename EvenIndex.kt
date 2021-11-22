import kotlin.concurrent.fixedRateTimer

fun main() {
    val arr = arrayOf(1,2,3,4,5,4,3,2,1)
    println(arr.groupBy { it  })
    println(
        findEvenIndex2(arr.toIntArray())
    )
}

fun findEvenIndex(arr: IntArray): Int {
    var evenIndex = -1

    for (index in arr.indices) {
        var sumLeft = 0
        var sumRight = 0
        for (i in (index + 1) until arr.size)
            sumRight += arr[i]
        for (i in 0 until index)
            sumLeft += arr[i]
        if (sumRight == sumLeft) {
            evenIndex = index
            break
        }
    }
    return evenIndex
}

fun findEvenIndex2(arr: IntArray): Int{
    for (index in arr.indices){
        if (arr.sliceArray(0 .. index).sum() == arr.sliceArray(index until  arr.size).sum())
            return index
    }
    return -1
}