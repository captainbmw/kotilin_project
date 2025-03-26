fun main(args: Array<String>) {
    print("Enter 1st number:")
    val num1 = Integer.valueOf(readlnOrNull())
    print("Enter 2nd number:")
    val num2 = Integer.valueOf(readlnOrNull())
    print("Enter 3rd number:")
    val num3 = Integer.valueOf(readlnOrNull())
    if (num1 > num2 && num1 > num3) {
        println("$num1 is greater than $num2 and $num3")

    } else if (num2 > num1 && num2 > num3){
        println("$num2 is > than $num1 and $num3")
    }else if (num3>num1 && num3>num2){
        println("$num3 is > than $num1 and $num2")
    }
    else{
        println("All values are the same!!!" )
    }

}