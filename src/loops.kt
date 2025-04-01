// A loop allow to repeat a number of set times or over a
//or a collection of data
//In kotlin for loop(used when we have no of iteration )
// , while loop(continues as long as condition is true)
// and foreach loop(used to loop over collection eg. arrays)

fun main(){
    //for loop
    //iterate over a range

    for (i in
        1..12) {
        println(i)
    }
//    adding a step
    for (i in  1..12 step 2) {
        println(i)
    }
    for (i in 12 downTo 1 ){
        println(i)
    }
    val fruits = listOf("Apple", "Banana","Mango")
    for (i in fruits ){
        converttoUpper(i)
        println(i)
    }
//    print with index position
    for ((index,fruit)in fruits.withIndex()){
    println("$index: $fruit")
    }
//    basic while loop
    var i=1
    while (i<=5){
        println(i)
        i++
    }
//    do while :: do executes without conditions
//    then utilizes the while block to look at the condition
    var j=0
    do {
        println(j)
        j++
    }while (j<=5)
}
fun converttoUpper(i: String ){
    println(i.uppercase())
}