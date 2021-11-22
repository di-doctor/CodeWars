data class Person(val name: String, val age: Int)
class Ref<T>(var value: T)

fun main() {
    var count = 0
    var flag: Boolean = false

    repeat(10_000_000) {
        if (isPrime(it)) {
            print("$it ")
            count++
            flag = true
        }
        if (count % 27 == 0 && flag) {
            println()
            flag = false
        }
    }
}

fun factorial1(value: Int): Int {
    if (value < 2) return 1
    return value * factorial1(value - 1)
}

fun isPrime(n: Int): Boolean {
    if (n < 2) return false // Необходимо, так как 1 -- не простое число
    for (m in 2 ..kotlin.math.sqrt(n.toDouble()).toInt()) {
        if (n % m == 0) return false
    }
    return true
}



