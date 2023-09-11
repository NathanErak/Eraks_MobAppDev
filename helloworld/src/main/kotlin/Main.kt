//const val PI = 3.1416
const val a: Int = 7
const val b: Int = 7
const val c: Int = 5

fun main(){
    if (a == b && a == c)
        println("El triangulo es equilatero")
    else if (a == b || b == c || a == c)
        println("El triangulo es isoceles")
    else
        println("El triangulo es escaleno")

    //val decimal = 1.325F
    //val perimetro =2*PI*decimal

    //println(perimetro)
}