class HighLight {
}

fun main() {



    val strFinish = highlight(code = "FFFR345[F2]LL{dfg}")
println(strFinish)

}

fun highlight(code: String): String {
    var str = ""
    """(F+|R+|\d+|L+|\(.+\)|\[.+\]|\{.+\})""".toRegex().findAll(code).forEach {
        var strMatched = it.value
        when (strMatched.first()) {
            'F' -> str += "<span style=\"color: pink\">$strMatched</span>"
            'R' -> str += "<span style=\"color: green\">$strMatched</span>"
            'L' -> str += "<span style=\"color: red\">$strMatched</span>"
            in '0'..'9' -> str += "<span style=\"color: orange\">$strMatched</span>"
            '('-> str+=strMatched.drop(1).dropLast(1)
            '['-> str+=strMatched.drop(1).dropLast(1)
            '{'-> str+=strMatched.drop(1).dropLast(1)
        }
    }
    return str
}