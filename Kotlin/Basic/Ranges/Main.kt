fun main(){
    for (chars in 'a'..'x') {
        println(chars)
    }
    for (nums in 5..15) {
        println(nums)
    }
    val nums2 = arrayOf(2, 4, 6, 8)
    if (2 in nums2) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    } 
    for (nums3 in 5..15) {
        if (nums3 == 10) {
            break
        }
        println(nums3)
    }
     for (nums4 in 5..15) {
         if (nums4 == 10) {
             continue
        }
        println(nums4)
    } 
}