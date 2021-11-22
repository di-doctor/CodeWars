import java.util.Collections.swap

fun main() {
    println(maxRot(38458215 ))
}

fun maxRot(n: Long): Long {
    val stringValue = n.toString().toMutableList()
    println(stringValue)
    val countChar = stringValue.size
    val listValue = mutableListOf<Long>()

    repeat(countChar) {
        var first =it
        repeat(countChar - it-1) {
            swap(stringValue, first, first + 1)
            first++

        }
        var finishStr = ""
        for (char in stringValue){
            finishStr += char
        }
        listValue.add(finishStr.toLong())
    }
    println(listValue)
    return listValue.maxOrNull() ?: -1
}
