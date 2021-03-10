package lab

object Shape extends App {
  sealed trait Shape
  object Shape {
    case class Square(edge: Double) extends Shape
    case class Rectangle(width: Double, height: Double) extends Shape
    case class Circle(radius: Double) extends Shape

    def perimeter(s: Shape): Double = s match {
      case Square(edge) => edge * 4
      case Rectangle(width, height) => (width + height) * 2
      case Circle(radius) => 2 * radius * Math.PI
    }

    def area(s: Shape): Double = s match {
      case Square(edge) => Math.pow(edge, 2)
      case Rectangle(width, height) => width * height
      case Circle(radius) => Math.PI * Math.pow(radius, 2)
    }
  }
}
