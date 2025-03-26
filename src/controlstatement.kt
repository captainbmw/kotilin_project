fun main(args: Array<String>) {
    print("Enter number:")
    val num=Integer.valueOf(readlnOrNull())
    if (num%2==0){
        println("$num is even No.")

    }
    else{
        println("$num is odd No.")
    }
    print("Enter age")
    val age=Integer.valueOf(readlnOrNull())
    if (age>=18){
        println("$age you can vote")
    }
    else{
        println("$age you are not qualified")
    }

}