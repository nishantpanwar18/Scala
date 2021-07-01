package lecture.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

/**
 * Created by Nishant Panwar on 26-06-2021.
 */
object Recursion extends App {

  def factorial (n: Int) : Int = {

    if (n <=1) 1
    else
      n * factorial(n-1)
  }

  def anotherFactorial(n: Int): BigInt = {
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x<=1) accumulator
      else factorialHelper(x-1, x * accumulator) // Tail Recursion = use recursive call as the LAST expression
    }
    factorialHelper(n, 1)
  }
println(anotherFactorial(5000))
/*
  anotherFactorial(10) = factorialHelper(10,1)
  = factorialHelper(9, 10 * 1)
  = factorialHelper(8, 9 * 10 * 1)
  = factorialHelper(7, 8 * 9 * 10 * 1)
  = factorialHelper(6, 7 * 8 * 9 * 10 * 1)
  = ...
  = factorialHelper(2, 3 * 4 * ..... * 10 * 1)
  = factorialHelper(1, 1 * 2 * 3 * .... * 10 * 1)
  = 1 * 2 * 3 * .... * 10 * 1

 */

//  WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION
//    1. Concatenate a string n times
@tailrec
  def concatenateTailRec(aString: String, n : Int, accumulator: String): String = {
    if (n<=0)
        accumulator
    else
      concatenateTailRec(aString, n - 1 , aString + accumulator)
}
  println(concatenateTailRec("Hello", 3, ""))

  // 2. isPrime function using tail recursive


  def isPrime(n: Int): Boolean= {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else
        if (t <= 1 ) true
        else isPrimeTailrec(t -1 , n % t !=0 && isStillPrime)

    }
    isPrimeTailrec(n / 2, true)

  }
  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci (n: Int ) : Int = {
    def fiboTailrec (i: Int , last: Int, nextToLast: Int ): Int =
      if (i >= n)
        last
      else
          fiboTailrec(i + 1, last + nextToLast , last )

    if (n <= 2) 1
    else
      fiboTailrec(2,1,1)

  }

  println(fibonacci(8))

}

