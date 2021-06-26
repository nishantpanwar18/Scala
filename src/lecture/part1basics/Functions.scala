package lecture.part1basics

/**
 * Created by Nishant Panwar on 26-06-2021.
 */
object Functions extends App {

  def aFunction (a: String, b: Int) : String =
    {
      a + " " + b
    }
    println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(a: String, n : Int) : String = {
    if (n==1) a
    else
      a + aRepeatedFunction(a,n-1)
  }

  println(aRepeatedFunction("Hello",5))

  // WHEN YOU NEED LOOPS, USE RECURSION -- FUNCTIONAL PROGRAMING PARADIGM

  def aBigFunction(n: Int) : Int = {
      def aSmallFunction(a: Int, b: Int) : Int = a + b
    aSmallFunction(n, n-1)
  }



// 1. A greeting function (name, age) => Hi,my name is $name and I am $age years old."


  def greeting(name: String, age: Int): String = {

    s"Hi, my name is $name and I am $age years old."

  }
  println(greeting("Nishant",28))

//  2. Factorial function

  def factorial(n: Int): Int = {
    if (n <= 0)
      return 1
    else return n * factorial(n-1)

  }

  println(factorial(6))

// 3. A Fibonacci function => f(1) = 1 , f(2) = 1 , f(n) = f(n-1) + f(n-2)

  def fibonacci (n: Int) : Int = {
    if (n <=2) 1
    else
      fibonacci(n-1) + fibonacci(n-2)
  }
println(fibonacci(10))

//  4. A prime number

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil (t: Int): Boolean = {
      if (t <= 1) true
      else n % t !=0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37*17))
}
