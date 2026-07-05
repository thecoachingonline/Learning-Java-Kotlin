fun main(){
    var greeting: String = "Hello"
    println(greeting)
    
    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)
    
    var txt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + txt2.length)
    
    var txt3 = "Hello World"
    println(txt3.uppercase())   // Outputs "HELLO WORLD"
    println(txt3.lowercase())   // Outputs "hello world"
    
    var txt4 = "Hello World"
    var txt5 = "Hello World"
    println(txt4.compareTo(txt5))  // Outputs 0 (they are equal)
    
    var txt6 = "Please locate where 'locate' occurs!"
    println(txt6.indexOf("locate"))  // Outputs 7
    
    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)
    
    var firstName2 = "Johny "
    var lastName2 = "Doe"
    println(firstName2.plus(lastName2))
    
    var firstName3 = "John"
    var lastName3 = "Doe"
    println("My name is $firstName3 $lastName3")
}