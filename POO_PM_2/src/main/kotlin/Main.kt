import Clases.*
import java.security.interfaces.DSAPublicKey

/*fun main() {
    //val travel = Travel
    val viajeMonterrey = National("Monterrey")
    viajeMonterrey.quotePrice(2)
    val viajeBajaMonterrey = NationalLowSeason("Monterrey")
}

    fun main() {
        val scaryMovie = Movie("Scary Movie", "Comedia", 83.80)
        println(scaryMovie)
        //println(scaryMovie.gender)
        scaryMovie.createdAt = "2000"
        println(scaryMovie.component2())
        val (name1,gender1,duration1) = scaryMovie
        println("Nuevas Variables $name1 $gender1 $duration1")
        val (_,gender2,duration2) = scaryMovie
        println("Nuevas Variables $gender2 $duration2")

        /*copiar una data class*/
        val scaryMovie2 = scaryMovie.copy(name = "Scary Movie 2", duration = 83.8)
        println("Scary Movie 2 $scaryMovie2")
    }*/

/*Companion Objects
        * Permite crear objetos, variables o métodos en una clase paara utilizarlos sin necesidad de hacer una
        * instancia*/
/*fun main() {
    val vehiculoInstance = Vehiculo.create()
    var saludo = { println("Hola UPIICSA") }()

    /*Funciones literales
* Tipo de función que no es declarada
* Expresiones Lambda: val <nombre de la función>: ={->}
    val suma = {a: Int, b: Int -> a + b}
    println(suma(1,2))
    val presentarse: (String,Int) -> String = {name,age -> "Me llamo $name y tengo $age años"}
    println(presentarse("Javier", 17))

    val saverGrade: (Double,Double) -> String = {expected: Double, saved: Double ->
        val percentage = saved /expected

        when {
            percentage > 1 -> "Ahorrador Pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "aprendiz saver"
        }
    }
    println(saverGrade(150.0,100.0))*/

/* Expresiones anónimas*/
    val saverGrade2 = fun(expected:Double, saved:Double): String{
        val percentage = saved /expected
        return when{
            percentage > 1 -> "Ahorrador Pro"
            percentage == 1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "aprendiz saver"
        }
    }
    println(saverGrade2(100.0,80.0))
}*/
/*fun main() {
    //Funciones de orden superior
    fun calculadora(a: Int, b:Int, operacion: (Int, Int) -> Int):Int{
        return operacion(a,b)
    }
    fun suma(a:Int, b:Int) = a + b
    fun resta(a:Int, b:Int) = a - b
    fun multiplicacion(a:Int, b:Int) = a * b

    val suma = calculadora(5,6,::suma)
    val resta = calculadora(5,6,::resta)
    val multiplicacion = calculadora(5,6,::multiplicacion)
    println(suma)
    println(resta)
    println(multiplicacion)
}*/

fun getDiscount(price:Double, coupon:String): Double {
    var priceWithDiscount = price
    val iva = price * 0.16
    when (coupon) {
        "NOIVA" -> {
            priceWithDiscount = price
        }
        "HALFIVA" -> {
            priceWithDiscount = price + iva/2
        }
        "MINUS100" -> {
            priceWithDiscount += iva - 100
        }
        "PROMO2020" -> {
            if (price in 0.0..1000.0) {
                priceWithDiscount += price * 0.12
            }
            else if (price in 1000.0..2000.0) {
                priceWithDiscount += price * 0.04
            }
            else if (price in 2000.0..4000.0) {
                priceWithDiscount = (price * 0.16)/2
            }
            else if (price > 4000.0) {
                priceWithDiscount = price/3
            }
        }
        else -> {
            priceWithDiscount += price * 0.16
        }
    }
    return priceWithDiscount
}
fun printFinalPrice(total:(Double) -> Double){
    val precio = 6000.0
    val finalPrice = total(precio)
    print("El precio final es: $finalPrice")
}
fun main() {
    val coupon = ""
    val calculo = { precio: Double -> getDiscount(precio, coupon)}

    printFinalPrice(calculo)
}