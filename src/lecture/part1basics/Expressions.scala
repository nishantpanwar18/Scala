package lecture.part1basics

/**
 * Created by Nishant Panwar on 21-06-2021.
 */
object Expressions extends  App {

  val x = 1 + 2 // Expressions
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension )

  println(1 == x)
  // == != > >= < <=

  println(!(1==x))

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .... side effects
  println(aVariable)

  // Instructions (DO) vs. Expressions (Value)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 50 else 30 // if expression

  println(aConditionedValue)
  println(if(aCondition) 50 else 30)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10){
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN

  // Everything in Scala is an expression

  val aWeirdValue = (aVariable=3) // Unit === Void
  println(aWeirdValue)

  // Side effects: println() , whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y+5

    if(z<4) "Hello" else "Goodbye"
  }

  // 1. difference between "Hello, World" vs. println("Hello, World")
  //2.
  val someValue = {
    2<3
  }
  println(someValue)

  //3.
  val someOtherValue = {
    if (someValue) 239 else 567
    44
  }
  println(someOtherValue)
}
