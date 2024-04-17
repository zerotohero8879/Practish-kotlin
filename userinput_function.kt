import java.util.Scanner

fun main() {
    var name1:String
    var age1:Int
    print("Entter the any name=")
    var scanner= Scanner(System.`in`)
    name1=scanner.nextLine()
    print("Enter the any number=")
    age1=scanner.nextInt()
    var obj=san()
    var ob=obj.hero(name1,age1)
    println(ob)

}

class san{
    var name:String="sanjeev"
    fun hero(name:String,age:Int): String {
        return name+age

    }
}
