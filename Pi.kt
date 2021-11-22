class Pi {
}

fun main() {
    //println(iterPi2String(0.01))
    println(Math.floorMod(1234567,13))
}

fun iterPi2String(epsilon: Double): String {
    var leibnizPI: Double = 1.0
    var countIteration = 1
    val mathPIDevideFour: Double = Math.PI / 4


    while (kotlin.math.abs((leibnizPI - mathPIDevideFour) * 4) > epsilon) {
        val negative = if (countIteration % 2 == 0) 1 else -1
        leibnizPI += (negative * (1 / ((countIteration * 2.0) + 1.0)))
        countIteration++
    }
//    return "[$countIteration, ${String.format("%.10f", 4*leibnizPI)}]"
    return String.format("[%d, %.10f]", countIteration, leibnizPI * 4)

}