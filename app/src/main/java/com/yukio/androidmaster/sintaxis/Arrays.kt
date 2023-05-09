package com.yukio.androidmaster.sintaxis

fun main(){
    var weekDays= arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    //El indice empieza desde 0 y el size cuenta desde el 1
    println(weekDays.size)
    println(weekDays)//Apunta a una unidad de memoria
    if(weekDays.size>=8){
        println(weekDays[9])
    }else{
        println("No hay mas valores en el array")
    }
    //weekDays[0] = "Aguita"
    //println(weekDays[0])

    //Bucles para Arrays
    /**
     * Posicion
     */
    println("    ")
    println("/////////////////////////////")
    println("imprimir posicion")
    for(position in weekDays.indices){
        println("Posocion $position ")
    }
    /**
     * Imprimir posicion y valor
     */
    println("    ")
    println("/////////////////////////////")
    println("Metodo 1")
    for(position in weekDays.indices){
        print("Posocion $position ")
        println(weekDays[position])
    }
    println("    ")
    println("/////////////////////////////")
    println("Metodo 2")
    for ((position, value) in weekDays.withIndex()){
        println("La posicion $position, contiene $value")
    }

    /**
     * Imprimir valor
     */
    println("    ")
    println("/////////////////////////////")
    println("Imprimir valor")
    for (weekDays in weekDays){
        println("Hoy es $weekDays")
    }
}