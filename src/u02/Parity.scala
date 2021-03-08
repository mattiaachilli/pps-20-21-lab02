package u02

object Parity extends App {

  def parity(value: Int): String = value match {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  lazy val parityVal: Int => String = {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }
}
