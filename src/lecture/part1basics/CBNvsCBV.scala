package lecture.part1basics

/**
 * Created by Nishant Panwar on 01-07-2021.
 */
object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value " + x) // x replaced by evaluated nano time
    println("by value " + x) // x replaced by evaluated nano time
  }

  def calledByName(x: => Long) : Unit = {  // => is used to make function called by name
    println("by name " + x) // x replaced by System.nanotime()
    println("by name " + x) // x replaced by System.nanotime()

  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite() : Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  printFirst(infinite(), 34) -- crashed due to stack overflow error

    printFirst(34, infinite()) // infinite() is literally passed


  /* Call by value:
     -- value is computed before call
     -- Same value used everywhere

     Call by name:
     -- expression is passed literally
     -- expression is evaluated at every use with in
   */
}
