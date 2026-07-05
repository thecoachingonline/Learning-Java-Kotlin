fun myFunction(fname: String) {
  println(fname + " Doe")
}

fun main(){
    println("I just got executed!")
    myFunction("John")
    myFunction("Jane")
    myFunction("George")
}

fun myFunction2(fname: String, age: Int) {
  println(fname + " is " + age)
}

fun main2() {
  myFunction2("John", 35)
  myFunction2("Jane", 32)
  myFunction2("George", 15)
}

fun myFunction3(x: Int): Int {
  return (x + 5)
}

fun main3() {
  var result = myFunction3(3)
  println(result)
}

fun myFunction4(x: Int, y: Int): Int {
  return (x + y)
}

fun main4() {
  var result = myFunction4(3, 5)
  println(result)
}

fun myFunction5(x: Int, y: Int) = x + y

fun main5() {
  var result = myFunction5(3, 5)
  println(result)
}