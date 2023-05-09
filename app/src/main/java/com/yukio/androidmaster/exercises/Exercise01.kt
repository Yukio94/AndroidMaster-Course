package com.yukio.androidmaster.exercises
/**
 * La cantidad exacta de notificaciones cuando haya menos de 100
99+ como cantidad de notificaciones cuando haya 100 o más

Completa la función printNotificationSummary() para que el programa imprima estas líneas:

 - You have 51 notifications.
 - Your phone is blowing up! You have 99+ notifications.
 */
fun main() {
    val morningNotification = 200 //51
    val eveningNotification = 80//135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}
fun printNotificationSummary(numberOfMessages: Int) {
// Fill in the code.
    if (numberOfMessages>99){
        println("Your phone is blowing up! You have 99+ notifications.")
    }else{
        println("You have $numberOfMessages notifications.")
    }
}