package converter
import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    println("Enter a number and a measure: ")
    val inputValue = scanner.nextInt()
    var inputUnit = ""
    val unit = scanner.next()
    var resultValue = 0
    when (unit.toLowerCase()) {
    "km", "kilometer", "kilometers" -> {
        inputUnit = if (inputValue == 1) "kilometer" else "kilometers"
        resultValue = inputValue * 1000
        val resultUnit = if (resultValue == 1) "meter" else "meters"
        println("$inputValue $inputUnit is $resultValue $resultUnit")
    } else -> { println("Wrong input") }
    }
}