package lab

object Shape extends App {
  sealed trait Shape
  object Shape {
    case class Square(side: Double) extends Shape
    case class Rectangle(width: Double, height: Double) extends Shape
    case class Circle(radius: Double) extends Shape

    def perimeter(s: Shape): Double = s match {
      case Square(n) => n * 4
      case Rectangle(width, height) => (width + height) * 2
      case Circle(radius) => 2 * radius * Math.PI
    }
  }
}
