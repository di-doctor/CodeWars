import java.lang.Math.abs

fun main() {
    val a1 = arrayOf(
        "hoqq",
        "bbllkw",
        "oox",
        "ejjuyyy",
        "plmiis",
        "xxxzgpsssa",
        "xxwwkktt",
        "znnnnfqknaz",
        "qqquuhii",
        "dvvvwz"
    )
    val a2 = arrayOf("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
    val a3 = emptyArray<String>()
    //mxdiflg(a1, a2) --> 13
    println(mxdiflg(a2, a1))
}

fun mxdiflg(a1: Array<String>, a2: Array<String>): Int {
    if (a1.isEmpty() || a2.isEmpty()) return -1
    var maxDiff = 0
    for (item1 in a1) {
        for (item2 in a2) {
            var diff = kotlin.math.abs(item1.length - item2.length)
            if (diff > maxDiff) {
                maxDiff = diff
            }
        }
    }
    return maxDiff
}