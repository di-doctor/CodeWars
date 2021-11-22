fun main() {
    val wordsSequanse = "The quick brown fox jumps over the lazy dog".split(" ").asSequence()
    val lengthsList = wordsSequanse.filter { println("filter: $it")
        it.length > 3 }
        .map { println("length: ${it.length}")
            it.length }
        .take(4)
    println(lengthsList.toList())
}

fun persistence(num: Int): Int {
    var countMulti = 0
    var multiplyValue = num
    while (multiplyValue >= 10) {
        val list = openValueTolist(multiplyValue)
        multiplyValue = 1
        for (item in list)
            multiplyValue *= item
        countMulti++
    }
    return countMulti
}

fun openValueTolist(num: Int): List<Int> {
    var value = num
    val list: MutableList<Int> = mutableListOf()

    while (value > 0) {
        list.add(value % 10)
        value /= 10
    }

    return list
}