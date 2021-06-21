package lecture.part1basics

/**
 * Created by Nishant Panwar on 20-06-2021.
 */
object ValueVariableTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  // COMPILER can infer types

  val aString : String = "Hello"
  val anotherString = "Bye"

  val aBoolean = true
  val aChar : Char= 'N'
  val aInt: Int = 18
  val aShort : Short = 12345
  val aLong : Long = 323254355365465L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // variables
  var aVariable : Int = 4

  aVariable = 12 // Side Effects : Expressions returning Units e.g. println(), whiles, reassigning vars

  // Expressions vs. Instructions
  // Instructions are executed(think Java), Expressions are evaluated (Scala)
  // In Scala, we think in terms of expressions.
  // NEVER use while loops in Scala code, ITS A CRIME !!




}
