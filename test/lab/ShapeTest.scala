package lab

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test;

class ShapeTest {

  import lab.Shape._;

  val square: Shape.Square = Shape.Square(5)
  val rectangle: Shape.Rectangle = Shape.Rectangle(6, 4)
  val circle: Shape.Circle = Shape.Circle(5)

  @Test def testPerimeter(): Unit = {
    assertEquals(20, Shape.perimeter(square))
    assertEquals(20, Shape.perimeter(rectangle))
    assertEquals(2 * 5 * Math.PI, Shape.perimeter(circle))
  }
}
