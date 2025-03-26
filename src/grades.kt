fun main(args: Array<String>) {
    print("Enter the score:")
    val num1=Integer.valueOf(readlnOrNull())

    if (num1 >=90 && num1 < 100) {
        println("Remarkable")
    }else if(num1>= 70 && num1 < 88){
        println("Excellent")
    }else if (num1>= 50 && num1 < 60){
        println("Passed")
    }else if (num1>=0 && num1 < 50){
        println("Failed")
    }else{
        println("invalid value")
    }


}