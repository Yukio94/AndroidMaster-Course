package com.yukio.androidmaster.sintaxis

/**
 * Funciones
 */

//Variables de la clase
val age4: Int = 45

fun main() {
    //variablesNumericas()
    //variablesAlfanumericas()
    // variablesBooleanas()
    showMyName(name= "Yukio")
    showMyAge(currentAge = 40)//Envio de valor
    //showMyAge() //Usar valor por defecto
    add(25, 76)
    val mySubtract = subtract(10, 5)
    println(mySubtract)
    println(subtractCool(12,10))

}

fun variablesNumericas() {
    /**
     * Variables Numericas
     */
    //variables de funcion
    //Int -2,147,483,647 a 2,147,483,647
    val age: Int = 30
    val age2 = 30
    var age3: Int = 30
    println(age3)
    age3 = 29
    println(age3)

    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example: Long = 30

    //Float soporta hasta 6 decimales
    val floatExample: Float = 30.5f

    //Double soporta hasta 14 decimales
    val doubleExample: Double = 3241.3123123

    print(doubleExample)

    /**
     * Operaciones
     */
    println("Operaciones:")
    println("Sumar")
    println(age + age3)

    println("Restar")
    println(age - age3)

    println("Multiplicar")
    println(age * age3)

    println("Dividir")
    println(age / age3)

    println("Modulo")
    println(age % age3)

    /**
     * Operaciones con diferentes variables
     */

    println("Operaciones con diferentes variables")

    println("Sumar Int+ Long")
    println(age + example)

    println("Sumar Int+ Float")
    println(age + floatExample)

    var exampleSuma: Float = age + floatExample
    println(exampleSuma)

    var examplesuma2: Int = age2 + floatExample.toInt()
    println(examplesuma2)
}

fun variablesAlfanumericas() {
    /**
     * Variables Alfanumericas
     */

    //Char 1 caracter
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val stringExample: String = "YUKIO practica"
    val stringExample2 = "YUKIO"
    val stringExample3 = "4"
    val stringExample4 = "23"

    println(stringExample)

    //Concatenar
    println(stringExample3 + stringExample4)

    //Convertir
    println(stringExample3.toInt() + stringExample4.toInt())

    var strinconctenada = "Hola"
    println(strinconctenada)
    strinconctenada = "Hola me llamo $stringExample2 y tengo $age4 años"
    println(strinconctenada)

    val example123: String = age4.toString()
    println(example123)
}

fun variablesBooleanas() {
    /**
     * Variables Booleanas
     */

    //Boolean
    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3 = false
    println(booleanExample1)
}
fun showMyName(name:String){
    println("Me llamo $name")
}

fun showMyAge(currentAge: Int = 30) { //colocar valor por defecto en caso de error
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber - secondNumber
    println("Adios :(")
}

//Simplificar código
fun subtractCool(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber