fun main(){
    if (20 > 18) {
        println("20 is greater than 18")
    }
    val x = 20
    val y = 18
    if (x > y) {
        println("x is greater than y")
    }
    val time = 20
    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }   // Outputs "Good evening."
    
    val time2 = 22
    if (time2 < 10) {
        println("Good morning.")
    } else if (time2 < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }   // Outputs "Good evening."
    
    val time3 = 20
    val greeting = if (time3 < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)
    
    val time4 = 20
    val greeting2 = if (time4 < 18) "Good day." else "Good evening."
    println(greeting2)
  
}