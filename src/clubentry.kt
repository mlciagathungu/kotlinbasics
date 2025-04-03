
fun main() {
    println("Welcome to the club entry system.")
    println("Enter your age")
    val age = readln().toIntOrNull() ?: 0

    when {
        age <= 18 -> {
            println("Sorry, your club entry request has been rejected !")
        }
        else -> {
            println("congrats, your club entry request has been granted. ")
            println("Are you a member or a VIP?")
            val isMember = readln().equals("yes", ignoreCase = true)
            print("Enter your member number:")
            val memberNumber = readln()
            println("Drinks discount applied to,member no $memberNumber!")
            val isVip = readln().equals("yes", ignoreCase = true)
            println("Welcome to the VIP lounge!")
            println("Enjoy your night ")
            println(age)
            println(isVip)
            println(isMember)
        }
    }
}
