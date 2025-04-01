



//Switches based on a correct match to the condition

var day = 4

fun main() {
    // basic when statement
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6, 7 -> println("Weekend")
    }

//when expression
    val daytype = when (day) {
        in 1..5 -> "Weekday"
        6, 7 -> "Weekend"
        else -> "Invalid"

    }
    println(daytype)
//    when like an if .. else
    val x = 6
    when{
        x<0-> println("Negative")
        x>0 -> println("Positive")
        x==0 -> println("Zero")
        else-> println("Nan")
    }
}