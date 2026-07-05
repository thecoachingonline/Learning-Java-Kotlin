fun main(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[1])
    // Outputs BMW 
    val cars2 = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    cars2[0] = "Opel"
    println(cars2[0])
    // Now outputs Opel instead of Volvo
    println(cars2.size)
    // Outputs 4
    val cars3 = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars3) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
    val cars4 = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars4) {
        println(x)
    }
}