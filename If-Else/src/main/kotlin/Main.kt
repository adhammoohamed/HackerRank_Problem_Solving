fun main(args: Array<String>) {
/*
* Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.
=============

Sample Input 0
3
Sample Output 0
Weird
* ================
Sample Input 1
24
Sample Output 1
Not Weird
* ====================
  */
    println("please Enter the number")
    var number : Int = readln()!!.toInt()

    if ((number % 2) != 0) {
        println("Wierd")
    }else if ((number % 2) == 0 && (number in 2..5)){
        println("Not wierd")
    }else if ((number % 2) == 0 && (number in 6..20)){
        println("Wierd")
    }else {
        println("Not wierd")
    }
}