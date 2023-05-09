package com.yukio.androidmaster.sintaxis

fun main() {
    //mutablelist()
    condicionales()

}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(readOnly.size)
    println(readOnly) //Alternativa println(readOnly.toString())
    println(readOnly[1])
    println(readOnly.last())
    println(readOnly.first())

    /**
     * filtrar
     *
     * it significa cada uno de los valores
     */
    val example = readOnly.filter { it.contains(other = "a") }
    println(example)

    /**
     * Cambiar nombre a it
     */
    readOnly.forEach { weekDay ->
        println(weekDay)
    }
}

fun mutablelist() {
    var weekdays: MutableList<String> =
    //mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    mutableListOf()
    /**
     * println(weekdays)
     * weekdays.add("historyday")
     * println(weekdays)
     * *weekdays.add(index = 0, element = "Bearday")
     * println(weekdays)
     */

    /**
     * Validar lista vacia
     */
    //Metodo 1
    /**
     * if(weekdays.isEmpty()){
     *  println("Vacio")
     *   }else{
     *   weekdays.forEach { println(it) }
     *   }
     */

    //Metodo 2
    if (weekdays.isNotEmpty()) {
        weekdays.forEach { println(it) }
    } else {
        println("Vacio")
    }
}
fun condicionales(){
    //metodo 1
    println("////////////////////")
    println("Metodo 1")
    var weekdays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    for(item in weekdays){
        println(item)
    }
    //metodo 2
    println("  ")
    println("////////////////////")
    println("Metodo 2")
    weekdays.forEach{
        println(it)

    }
}