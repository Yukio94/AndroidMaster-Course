package com.yukio.androidmaster.sintaxis

fun main() {
    ifBasico()
    ifAnidado()
    ifBoolean()
    IfmutipleY()
    IfmutipleOr()
}

fun ifBasico() {
    val name = "Yukio"
    if (name == "yukio") {
        /**
         * name.lowercase() Minusculas
         *  name.uppercase() Mayusculas
         */
        println("La variable name es $name")
    } else {
        println("Nombre no conocido")
    }
}

fun ifAnidado() {
    val animal = "dog"
    if (animal == "dog") {
        println("Es un perro")
    } else if (animal == "cat") {
        println("Es un gato")
    } else if (animal == "bird") {
        println("Es un pajaro")
    } else {
        println("Es otro animal")
    }
}

fun ifBoolean() {
    var soyFeliz = true
    var buttonPressed: Boolean = true
    buttonPressed = !buttonPressed //Fase
    /**
     * If con True if(soyFeliz)
     * If false if(!soyFeliz)
     */
    if (soyFeliz) {
        println("Soy feliz")
    } else {
        println("No soy feliz")
    }
    if (!buttonPressed) {
        println("Button pressed")
    } else {
        println("Button no pressed")
    }
}

fun ifInt() {
    var age = 29
    if (age > 18) {
        println("Beber cerveza")
    } else {
        println("Beber jugo")
    }
}

fun IfmutipleY() {
    var age = 29
    var parentPermission = true
    var imHappy = false

    //Metodo 1
    /**
     * if (age>18){
     * if(parentPermission){
     * println("Beber cerveza")
     * }else{
     * println("Beber refresco")
     * }
     * }else {
     * println("Beber jugo")
     * }
     */

    //Metodo 2
    if (age > 18 && parentPermission && imHappy) {
        println("Beber cerveza")
    } else {
        println("Beber jugo")
    }
}

fun IfmutipleOr() {
    val animal = "bird"
    val isHappy = true

    //metodo 1
    /**
     *  if (animal == "dog") {
     * println("Es un perro o un gato")
     * } else if (animal == "cat") {
     * println("Es un perro o un gato")
     * } else {
     * println("Es otro animal")
     * }
     */

    //metodo 2
    /**
     * if (animal == "dog" || animal == "cat") {
     * println("Es un perro o un gato")
     * } else {
     * println("Es otro animal")
     * }
     */

    //metodo 3
    if (animal == "dog" || (animal == "cat" && isHappy)) {
        println("Es un perro o un gato")
    } else {
        println("Es otro animal")
    }
}