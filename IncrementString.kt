fun main() {
    println(increment("009"))
}
fun increment(str: String): String{
    val listNumber = str.takeLastWhile { it.isDigit() } //00123
    val listChar = str.dropLast(listNumber.length)  //hello
    println(listNumber)
    println(listChar)
    return listChar + ((listNumber.toIntOrNull() ?: 0) + 1).toString().padStart(listNumber.length,'0')
}