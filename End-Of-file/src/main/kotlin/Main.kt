fun main(args: Array<String>) {

    println("please enter the stings")
    var count = 1
    while (true){
        var input : String = readln()!!
        if (input.isEmpty()) break
        println("$count $input")
        count++
    }
}


