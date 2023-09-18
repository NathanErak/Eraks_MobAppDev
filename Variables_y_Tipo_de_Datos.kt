/*const val PI = 3.14159f
fun main() {
	val numeroDecimal = 3.14159 //Double por Defecto
    println(numeroDecimal)
    val numeroDecimalFloat: Float = numeroDecimal.toFloat() // Usando toFloat()
    println(PI) // Imprimir el Double original
    println(numeroDecimalFloat) // Imprimir el Float convertido
}*/
import kotlin.math.pow
const val PI = 3.14159f
fun main(){
    val radius = 3f
    val area = circleArea(radius)
    println("El área del círculo es: $area") // $ es un string template
}
fun circleArea(radius:Float): Float{
    return PI*radius.pow(2)
}