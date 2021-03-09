package lab

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test;

class FibonacciTest {

  import lab.Fibonacci._;

  @Test def testFirstNumbersFibonacci(): Unit = {
    assertEquals(0, fib(0))
    assertEquals(1, fib(1))
    assertEquals(1, fib(2))
  }

  @Test def testAdvanceFibonacci(): Unit = {
    assertEquals(3, fib(4))
    assertEquals(13, fib(7))
    assertEquals(55, fib(10))
  }

  @Test def testFibonacciTail(): Unit = {
    assertEquals(3, fibTail(4))
    assertEquals(13, fibTail(7))
    assertEquals(55, fibTail(10))
  }
}
