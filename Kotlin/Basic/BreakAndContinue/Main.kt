fun main(){
    var i = 0
    while (i < 10) {
        println(i)
        i++
            if (i == 4) {
                break
            }
    }
    var x = 0
    while (x < 10) {
        if (x == 4) {
            x++
                continue
        }
        println(x)
        x++
    }
}