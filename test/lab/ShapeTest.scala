package lab

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test;
import Shape.Shape._

class ShapeTest {

  val square: Square = Square(5)
  val rectangle: Rectangle = Rectangle(6, 4)
  val circle: Circle = Circle(5)

  @Test def testPerimeter(): Unit = {
    assertEquals(20, perimeter(square))
    assertEquals(20, perimeter(rectangle))
    assertEquals(2 * 5 * Math.PI, perimeter(circle))
  }

  @Test def testArea(): Unit = {
    assertEquals(25, area(square))
    assertEquals(24, area(rectangle))
    assertEquals(Math.PI * Math.pow(5, 2), area(circle))
  }
}
