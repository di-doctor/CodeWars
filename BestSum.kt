class BestSum {
}

//ls = [50, 55, 57, 58, 60]

fun main() {
    val listKm = listOf(50,34,56)
    print(chooseBestSum(163, 3, listKm))
    }


fun chooseBestSum(t: Int, k: Int, ls: List<Int>): Int {
    if (ls.size < k) return -1
    val sizeList: Int = ls.size
    val listOfCombination = allCombination(sizeList, k)
    val combiRealKm = mutableListOf<Int>()
    for (item in listOfCombination) {
        var sum = 0
        for (i in item) {
            print("${ls[i]} ")
            sum += ls[i]
        }
        print(" --$sum")
        println()
        combiRealKm.add(sum)
    }
    var maxDistance = 0
    for (i in combiRealKm){
       if (i in ((maxDistance + 1)..t)) maxDistance = i
    }
    return maxDistance

}

fun allCombination(n: Int, k: Int): List<List<Int>> {
    val listCombi = MutableList(k + 2) { 0 }
    val listOfListCombination = mutableListOf<List<Int>>()
    for (i in 0 until k) {
        listCombi[i] = i
    }
    listCombi[k] = n
    //println(newList)
    while (true) {
        listOfListCombination.add(listCombi.take(k))
        //printCombination(listCombi, 0, stop = k)
        var j = 0
        while (listCombi[j] + 1 == listCombi[j + 1]) {
            listCombi[j] = j
            j += 1
        }
        if (j < k) listCombi[j]++
        else break
    }
    return listOfListCombination
}

fun printCombination(list: List<Int>, start: Int, stop: Int) {
    list.take(stop).joinToString().let { println(it) }
}

fun factorial(n: Int): Int {
    if (n < 2) return 1
    return n * factorial(n - 1)
}

fun countCombination(totalN: Int, localK: Int): Int {
    return factorial(totalN) / (factorial(localK) * factorial(totalN - localK))
}