fun main(args: Array<String>) {
    println("Please enter the number of times you will enter values")
    var times :Int = readln().toInt()

    for (i in 1 .. times){
        try {
            println("please enter the number")
            var number : Long = readln().toLong()
            println("$number can be fitted in : ")
            if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE){
                println("Byte")
            }
            if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE){
                println("Short")
            }
            if (number >= Int.MIN_VALUE && number <= Int.MAX_VALUE){
                println("Int")
            }
            if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE){
                println("Long")
            }
        }catch (e : Exception){
            println("can't be fitted anywhere")
        }
    }
}