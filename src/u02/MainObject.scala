package u02

object MainObject extends App{
  println("Hello, Scala")

  //3.b
  //val neg: (String => Boolean) => (String => Boolean) = f => (s => !f(_))
  def neg(predicate: String => Boolean): String => Boolean = (s) => !predicate(s)

  val negVal: (String => Boolean) => (String => Boolean) = predicate => !predicate(_)

  val empty: String => Boolean = _ == ""  //val empty = (s: String) => s == ""
  val sizeMajorFive: String => Boolean = s => s.length > 5

  val notEmpty: String => Boolean = neg(empty)
  val notSizeFive: String => Boolean = neg(sizeMajorFive)

  println(notEmpty("ciao"))
  println(notSizeFive("ciaooooo"))

  //3.c
  def negGenerics[A](predicate: A => Boolean): A => Boolean = (p) => !predicate(p)

  val emptyInt: Int => Boolean = _== 0
  val notIntEmpty: Int => Boolean = negGenerics(emptyInt)

  print(notIntEmpty(0))
}
