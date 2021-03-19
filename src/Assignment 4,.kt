import java.util.*

fun main() {
    text("Book","Girl","Pencil","Boy")
    cities()
    numbers()
    println(Arrays.toString(names("Sharon","Jane","Mary")))
}
fun text(a:String,b:String,c:String,d:String){
    var text= arrayOf("$a,$b,$c,$d")
    println(Arrays.toString(text))
}
fun cities() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { cities ->
        println(cities.capitalize())
    }
}
fun numbers() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var second = numbers[1]
    var fifth = numbers[4]
    var sum = (second + fifth)
    var sortedNumbers = numbers.sorted()
    println(sum)
    println(numbers[11])

    sortedNumbers.forEach { number ->
        println((number))
    }
}

   fun names(name1:String,name2:String,name3:String):Array<String>{
       var names=arrayOf("$name1,$name2,$name3")
       return names


   }









