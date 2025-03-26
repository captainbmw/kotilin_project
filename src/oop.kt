class Myclass{
//    data member
    var name ="My name is bmw"


//    member function
    fun display(){
        println(name)
    }
}

fun main(args: Array<String>) {
    var obj=Myclass()
    obj.display()
//creating object for cars
    val myobj2=Car()
    myobj2.model="BMW"
    myobj2.make="BMW company"
    myobj2.yearotman=2022

    println("My favourite car mode is ${myobj2.model} and make ${myobj2.make} manufactured in the year ${myobj2.yearotman}")

}


class Car{
    var model=""
    var make=""
    var yearotman=0
}