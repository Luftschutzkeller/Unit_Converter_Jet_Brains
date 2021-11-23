package converter
import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    println("Enter a number and a measure of length: ")
    val inputValue = scanner.nextDouble()
    var inputUnit = ""
    val unit = scanner.next()
    var resultValue = 0.0
    var resultUnit = if (resultValue == 1.0) "meter" else "meters"

    when (unit.toLowerCase()) {
        "m", "meter", "meters" -> {
            inputUnit = if (inputValue == 1.0) "meter" else "meters"
            resultValue = inputValue
            println("$inputValue $inputUnit is $resultValue $resultUnit")

        }
        "km", "kilometer", "kilometers" -> {
            inputUnit = if (inputValue == 1.0) "kilometer" else "kilometers"
            resultValue = inputValue * 1000
            resultUnit = if(resultValue == 1.0) "meter" else "meters"
            println("$inputValue $inputUnit is $resultValue $resultUnit")
        }
        "cm", "centimeter", "centimeters" -> {
            inputUnit = if (inputValue == 1.0) "centimeter" else "centimeters"
            resultValue = inputValue / 100
            resultUnit = if(resultValue == 1.0) "meter" else "meters"
            println("$inputValue $inputUnit is $resultValue $resultUnit")
        }
        "mm", "millimeter", "millimeters" -> {
            inputUnit = if (inputValue == 1.0) "millimeter" else "millimeters"
            resultValue = inputValue / 1000
            resultUnit = if(resultValue == 1.0) "meter" else "meters"
            println("$inputValue $inputUnit is $resultValue $resultUnit")
        }
        "mi", "mile", "miles" -> {
            inputUnit = if (inputValue == 1.0) "mile" else "miles"
            resultValue = inputValue * 1609.35
            println("$inputValue $inputUnit is $resultValue $resultUnit")
        }
        "yd", "yard", "yards" -> {
            inputUnit = if (inputValue == 1.0) "yard" else "yards"
            resultValue = inputValue * 0.9144
            println("$inputValue $inputUnit is $resultValue $resultUnit")
        }
        "ft", "foot", "feet" -> {
            inputUnit = if (inputValue == 1.0) "foot" else "feet"
            resultValue = inputValue * 0.3048
            println("$inputValue $inputUnit is $resultValue $resultUnit")
        }
        "in", "inch", "inches" -> {
            inputUnit = if (inputValue == 1.0) "inch" else "inches"
            resultValue = inputValue * 0.0254
            println("$inputValue $inputUnit is $resultValue $resultUnit")
        }
        else -> {
            println("Wrong input. Unknown unit $unit")
        }
    }

}