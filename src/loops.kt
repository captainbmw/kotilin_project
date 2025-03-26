fun main(args: Array<String>) {
    var num=10
    while (num>=5){
        println(num)
        num-=2
    }
    val student= arrayOf("James","Nico","Daniel","Dan","Dennis")
    student.sort()
    for (i in student){
        println(i)
    }
    val nambari= arrayOf(1,23,4,56,6,7,3,2,78,54,77,8,9,10,15,16,45,-67,0)
    nambari.sort()
    for (j in nambari){
        println(j)
    }
}