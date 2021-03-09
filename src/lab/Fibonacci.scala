package lab

import scala.annotation.tailrec


object Fibonacci extends App {
  def fib(n: Int): Int = n match {
    case n if n <= 1 && n >= 0 => n
    case n if n > 0 => fib(n - 1) + fib(n - 2)
  }

  def fibTail(n: Int): Int = {
    @tailrec
    def _fib(n: Int, first: Int, second: Int): Int = n match {
      case 0 => first
      case 1 => second
      case n if n > 0 => _fib(n-1, second, first + second)
    }
    _fib(n, 0, 1)
  }
}
