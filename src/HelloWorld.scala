/**
 * Created by calvinliu on 7/4/2016.
 */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  // Higher-order function
  def sumInt(a : Int, b : Int) : Int =
    if (a > b) 0
    else a + sumInt(a + 1, b)

  def sum(f: Int => Int, a : Int, b : Int) : Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  // Anonymous Function
  (x: Int) => x * x * x
  (x: Int, y: Int) => x + y

  // Summation
  def sumInts2(a: Int, b:Int) = sum(x => x, a, b)
  def sumCubes(a: Int, b:Int) = sum(x => x * x * x, a, b)

  // Tail Recursive
//  def sum(f: Int => Int)(a: Int, b: Int): Int = {
//    def loop(a: Int, acc: Int): Int = {
//      if (a > b) acc
//      else loop(acc, f(a))
//    }
//    loop(0, b)
//  }

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)
  }

  product(x => x * x)(3, 4)
  def fact(n: Int) = product(x => x)(1, n)
  fact(5)

  def mapReduce(f : Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
}
