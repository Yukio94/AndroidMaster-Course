package com.yukio.androidmaster.sintaxis

fun main() {
    numeros()
    texto()
    semana()
    println("Tomorrow is rainy")
    matematicas()
    fun main() {
        println(birthdayGreeting("Yukio", 28))
        println(birthdayGreeting("Karla", 26))
    }
}
fun texto(){
    println("Hello, Android ")
    println("Hello, Yukio ")
    println("Today is sunny!")
}
fun numeros(){
    println("1")
    println("2")
    println("3")
}
fun semana() {
    println("Monday")
    println("Tuesday")
    println("Wednesday")
    println("Thursday")
    println("Friday")
}
fun matematicas() {
    val cartTotal = 0
    //cartTotal = 20
    println("Total: $cartTotal")
}
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}