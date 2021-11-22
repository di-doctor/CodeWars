import kotlin.math.round

class testString {
}

fun main() {
    val str = "16"
    println(potatoes(99,100,98))
}

fun potatoes(p0:Int, w0:Int, p1:Int):Int {
    val p0d = p0.toDouble()/100.0
    val p1d = p1.toDouble()/100.0


    return round((w0 - p0d * w0) / (1.0 - p1d)).toInt()
}
