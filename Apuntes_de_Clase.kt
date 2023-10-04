/*Existen varias formas de expresar una operación aritmética
 Una función es una serie de instucciones en un módulo para lograr un objetivo específico
fun main() {
val a=10
val b=5
    println(a+b)
}
  fun nombre([Argumentos: tipo de dato]): [Tipo de dato retornado]{
 * ...
 * [código a ejecutar]
 * return [variable con el tipo de dato]
 * }
 *
 * Cabe destacar que en los ejercicios anteriores y en los que haremos después, el código que ejecutabamos venía dentro de la
 * llamada main
 * const val PI=3.416f
 * constval PHI = 1.518f
 * import Kotlin.math.pow
 * ...
 * fun circleArea(radius:Float): Float
 * 	return PI*radius.pow(2){
 * }
 * Pow es una función que vive en la clase float y eleva un numero a una cierta potencia. Ahora vamos a sacar el área de un círculo e
 * imprimirlo en pantalla
 * */
import kotlin.math.pow
const val PI = 3.1416f
const val PHI = 1.618f
fun main(){
    val radius = 4f
    val area = circleArea(radius)
    println("el área del círculo es: $area") // $ es un string template
    printName("Daniel Coutiño")
    printAge(15)
    println(getPi())
    printPhi()
}
fun circleArea(radius:Float): Float{
    return PI*radius.pow(2)
}
fun printName(name: String){
    println("Mi nombre es $name")
}
fun printAge(age: Int){
    println("Tengo $age años")
}
// Unit
// Ahora utilizaremos una función que no requiere ningún parámetro de entrada
fun getPi(): Float{
    return PI
}
fun printPhi(){
    println("El número áureo vale $PHI")
}
// e implementamos en el Main
// Finalmente vamos a declarar una función que no reciba ningún parámetro y que no devuelva ningún valor
// Funciones locales
// Es una función dentro de otra
// Es una función únicamente al alcance de la función que la contiene, se declara como una función normal, mantiene limpio el código
// al ayudar mejor a establecer las jerarquías y conexiones entre funciones, agrega reusabilidad al código
//
// funciones locales
fun login(user: String, password: String) : Boolean {
    fun validate(input: String): Boolean
    if (input.isEmpty()) {
        return false
    }
    return true
    val userValidate = validate(user)

}
/*fun countName(name: String): Int{
    var count =0
    for(currentName in nombres){
        if(name in currentName){
            count++
        }
    }
}

var x =20
while (x > 0){
    println(x)
    x--
}
do{
    //codigo a ejecutar
} while (condición)
*/
//Estructuras de datos

fun main(){
    val numeros = listOf("one", "two", "three", "four", "five", "six")
    println(numeros)

    println("Numero de elementos: ${numeros.size}")
    println("Segundo elemento: ${numeros.get(1)}")
    println("Cuarto elemento: ${numeros[3]}")
    println("Ultimo elemento: ${numeros.get(numeros.size - 1)}")
    println("Index del elemento \"four\":${numeros.indexOf("four")}")


    val list = mutableListOf(1, 2, 3 ,4)
    list.add(5)
    list.removeAt(1)
    list[0] = 0

    println(list)

    val numSet: Set<Int> = setOf(0,1,2,3,4,5)
    val reverseNumSet: Set<Int> = setOf(5,4,3,2,1,0)

    var names: Set<String> = mutableSetOf("Nombre 1", "Nombre 2")

    val namesToAges: Map<String, Int> = mapOf("user_one" to 20, "user_two" to 23) //mutableMapOf()
    for ((key, vaalue) in namesToAges) {
        println("$key tiene $value años")
    }
    fun elegirPais(country:String){
        when(country){
            "Mexico" ->{
                val idioma ="Español"
                val divisa ="Peso"
                actualizarPerfil(pais)
                println("Bienvenido")
            }
        }
        class Phone {
            //Una clase es un modelo abstracto de un objeto, y su representación más básica en kotlin es la siguiente:
        }
        val=20
        println("a es igual a 20? ${a.equals(20)}")
    }

}