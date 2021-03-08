package u02

object MainObject extends App{
  println("Hello, Scala")


  /* 3.a */
  def parity(value: Int): String = value match {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  val parityVal: Int => String = {
    case n if n % 2 == 0 => "even"
    case _ => "odd"
  }

  println(parity(5))
  println(parity(4))
  println(parityVal(5))
  println(parityVal(4))

  //3.b
  def neg(predicate: String => Boolean): String => Boolean = (s) => !predicate(s)

  val empty: String => Boolean = _ == ""
  val sizeMajorFive: String => Boolean = s => s.length > 5

  val notEmpty: String => Boolean = neg(empty)
  val notSizeFive: String => Boolean = neg(sizeMajorFive)

  println(notEmpty("ciao"))
  println(notSizeFive("ciaooooo"))

  //3.c


}
