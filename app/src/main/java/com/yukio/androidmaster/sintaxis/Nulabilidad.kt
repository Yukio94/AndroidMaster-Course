package com.yukio.androidmaster.sintaxis
fun main(){
    nulabilidad()
}
fun nulabilidad(){
    var name1:String ="Yukio" //tipo +? es un valor nulable
    var name2:String? = "Andrea"
    var name3:String? = null

    /**
     * imprime la posicion del texto empesado de 0
     */
    //Metodo1
    println(name1.get(0))
    //Metodo 2
    println(name1[4])
    /**
     * Validar Nulabilidad
     */
    //Metodo 1
    /**
     * Los signos !! despues de la variable indican que el valor no es nulo.
     * Si el valor es nulo marcara error
     */
   println(name2!![4])
    //Metodo 2
    /**
     * El signo ? despues de la variable valida que el valor no sea nulo.
     * Si el valor es nulo no realizara la accion indicada
     * ?: condicional en caso de que el valor sea nulo
     */
    println(name3?.get(0)?:"Es nulo")
}