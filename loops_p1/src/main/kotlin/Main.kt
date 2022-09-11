fun main(args: Array<String>) {
    println("Please Enter a number between 2 and 20")
    var num : Int = readln()!!.toInt()

    for (i in 1..10){
        println("$num x $i = ${num * i}")
    }
}