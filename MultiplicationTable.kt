fun main() {
    val str = stat("01|15|59, 1|47|16, 01|17|20")
    println(str)
    val pi = 3.14159265358979323
    val formatted = String.format("%.2f", pi)
    println(formatted)

println( "%02d|%02d|%02d".format(10,4,4))

}

fun stat(s: String): String {
    if (s.isEmpty()) return "Empty"
    val listTimeLong = s.split(",").map {
        it.timeToLong()
    }.sorted()
    val range = listTimeLong.last() - listTimeLong.first()
    val average = listTimeLong.average().toLong()
    val mediana = if (listTimeLong.size % 2 != 0) {
        listTimeLong[(listTimeLong.size-1)/2]
    }else{
        (listTimeLong[listTimeLong.size/2]+listTimeLong[listTimeLong.size/2-1])/2
    }
    return "Range: ${range.longToString()} Average: ${average.longToString()} Median: ${mediana.longToString()}"
}

fun String.timeToLong(): Long {
    val time = this.split("|").map {
        it.trim().toLong()
    }.let { 3600 * it[0] + 60 * it[1] + it[2] }
    return time
}
fun Long.longToString(): String{ //"01|32|34"
    var time = this
    val hours = time / 3600
    time %= 3600
    val minutes = time / 60
    time %= 60
    val seconds = time
    return hours.toString().padStart(2,'0') +"|"+
            minutes.toString().padStart(2,'0') +"|"+
            seconds.toString().padStart(2,'0')

}