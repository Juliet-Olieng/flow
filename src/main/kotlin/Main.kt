fun main(args: Array<String>) {
    numbers()
    println( name(arrayOf("Juliet","kait","wendy","kennedy")))
    ages(12)
    ages(46)
    number()
}
//1.Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun numbers(){
    for (numbers in 1..100){
if (numbers %2 !=0) {
    println(numbers)
}
        }

}
//2.Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun name(names:Array<String>):Int{
    var count=0
    for (name in names)
        if (name.length>5){
        count++
        }
    return count
}


//3.You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun ages(age:Int){
    if (age<6){
        println("milk")
    }
    else if(age in 7..14){
        println("fanta orange")
    }
    else{
        println("coca cola")
    }
}
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun number(){
    for (number in 1..100)
    when {
        number%3==0 && number%5==0->println("Fizzbuzz")
        number %3==0 ->println("fizz")
        number%5==0 ->println("buzz")
        else->println(number)
    }

    }

