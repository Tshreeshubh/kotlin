fun main() {
    val name = "Sam"     // can't change later
    var age = 20         // can change later

    println("Name: $name")
    println("Age: $age")

    age = 21
    println("New Age: $age")

//conversion
    val numString = "100"
    val numInt = numString.toInt()      // String to Int
    val numDouble = numInt.toDouble()   // Int to Double

    println("String: $numString")
    println("Int: $numInt")
    println("Double: $numDouble")


}
