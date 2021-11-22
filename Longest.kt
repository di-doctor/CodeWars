class Longest {
}

fun main() {
println(longest("xyaabbbccccdefww","xxxxyyyyabklmopq"))
}
fun longest(s1: String, s2: String): String {
    val listOfChar = (s1+s2).toSortedSet()

    return listOfChar.joinToString(separator = "+++", "{","}")
}