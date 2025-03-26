open class Myparent{
    val father="He likes watching football"
    val mother="she likes shopping"
}
class Myboychild:Myparent(){
    fun  boy(){
        println(father)
    }

}
class MyGirlchild:Myparent(){
    fun girl(){
        println(mother)
    }


}

fun main(args: Array<String>) {
    val obj=Myboychild()
    obj.boy()
    val myobj2=MyGirlchild()
    myobj2.girl()
}