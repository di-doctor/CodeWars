

fun main() {
println(highAndLow("1 2 3 -6 5"))
}
fun highAndLow(numbers: String): String {
    val list  = numbers.split(" ").map { it.toInt() }

    return "${list.maxOrNull()} ${list.minOrNull()}"
}