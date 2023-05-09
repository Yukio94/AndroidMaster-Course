package com.yukio.androidmaster.sintaxis
/*
 when tiene las funciones como el switch, if anidado, case,
 y otras condicionales de otros lenguajes como java o c++
 */
fun main() {
    getMont1(month = 0)
    getMont2(month = 12)
    getTimester(month = 5)
    getSemester1(month = 1)
    result(10)
    result("gato")
    result(true)
    println("Uso de return y when")
    println("Metodo 1")
    println(getSemesterM1(month = 1))
    println("Metodo 2")
    println(getSemesterM2(month = 5))
    println("Metodo 3")
    println(getSemesterM3(month = 9))
    println("Metodo 4")
    println(getSemesterM4(month = 15))
}

fun getMont1(month: Int) {
    if (month == 1) {
        println("Enero")
    } else if (month == 2) {
        println("Febrero")
    } else if (month == 3) {
        println("Marzo")
    } else if (month == 4) {
        println("Abril")
    } else if (month == 5) {
        println("Mayo")
    } else if (month == 6) {
        println("Junio")
    } else if (month == 7) {
        println("Julio")
    } else if (month == 8) {
        println("Agosto")
    } else if (month == 9) {
        println("Septiembre")
    } else if (month == 10) {
        println("Octubre")
    } else if (month == 11) {
        println("Noviembre")
    } else if (month == 12) {
        println("Diciembre")
    } else {
        println("No es un mes")
    }
}

fun getMont2(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> {
            //Agregar mas codigo
            println("Noviembre")
            println("aniversario")
        }

        12 -> println("Diciembre")
        else -> println("No es un mes")
    }
}

fun getTimester(month: Int) {
    when (month) {
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimetstre")
        7, 8, 9 -> println("Tercer Trimetstre")
        10, 11, 12 -> println("Cuarto Trimetstre")
        else -> println("Trimestre no valido")
    }
}

fun getSemester1(month: Int) {
    when (month) {
        in 1..6 -> println("Primer Semestre")
        in 7..12 -> println("Segundo Semestre")
        !in 1..12 -> println("Semestre no valido")
        //! Negar algo
    }
}

fun result(value: Any) {//Any almacena cualquier cosa
    when (value) {
        is Int -> {
            value + value
            println(value)
        }
        is String -> println(value)
        is Boolean -> if (value) println("Hola") else println("Adios")
    }
}

fun getSemesterM1(month: Int): String {
    //Metodo 1
    when (month) {
        in 1..6 -> return "Primer Semestre"
        in 7..12 -> return "Segundo Semestre"
        !in 1..12 -> return "Semestre no valido"
        else -> return "Error"
        //! Negar algo
    }
}

fun getSemesterM2(month: Int): String {
    //Metodo 2
    return when (month) {
        in 1..6 -> "Primer Semestre"
        in 7..12 -> "Segundo Semestre"
        !in 1..12 -> "Semestre no valido"
        else -> "Error"
    }
}

fun getSemesterM3(month: Int): String {
    //Metodo 3
    val result = when (month) {
        in 1..6 -> "Primer Semestre"
        in 7..12 -> "Segundo Semestre"
        !in 1..12 -> "Semestre no valido"
        else -> "Error"
    }
    return result
}

fun getSemesterM4(month: Int) = when (month) {
    //Metodo 3
    in 1..6 -> "Primer Semestre"
    in 7..12 -> "Segundo Semestre"
    !in 1..12 -> "Semestre no valido"
    else -> "Error"
}