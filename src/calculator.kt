fun main(args: Array<String>) {
    print("Enter 1st number:")
    val num1=Integer.valueOf(readlnOrNull())
    print("Enter 2nd number:")

    val num2=Integer.valueOf(readlnOrNull())
    print("Please enter operation:")
    val operator = readlnOrNull()

    when(operator){
        "+" -> println("The result is $num1 + $num2 =${num1+num2}")
        "-" -> println("The result is $num1 - $num2 = ${num1 - num2}")
        "*" -> println("The result is $num1 * $num2 = ${num1 * num2}")
        "/" -> println("The result is $num1 / $num2 = ${num1 / num2}")
    }

}
