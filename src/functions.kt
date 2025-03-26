fun myfunction(){
    println("this is my function")
}
fun main(args: Array<String>) {
    myfunction()
    addtwonum()
}
fun addtwonum(){
    print("Enter 1st No:")
    val num1=Integer.valueOf(readlnOrNull())
    print("Enter 2nd No:")
    val num2=Integer.valueOf(readlnOrNull())
    println("The sum of $num1 & $num2 is ${num1+num2}")


}
fun studreg(fname:String,lname:String,age:Int){
    println("student first name is: $fname,Last name:$lname,age:$age")
}