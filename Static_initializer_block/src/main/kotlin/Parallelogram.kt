class Parallelogram {

        class exception(message : String) : Exception(message)


    companion object{
        fun calc_area (height : Int , breadth : Int){
            if (height > 0 && breadth > 0) {
                var area = height * breadth
                println("The area is $area")
            }else{
                throw exception("java.lang.Exception: Breadth and height must be positive")
            }
        }
    }
}