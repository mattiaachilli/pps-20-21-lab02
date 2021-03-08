package u02

object Neg {
  def neg(predicate: String => Boolean): String => Boolean = (s) => !predicate(s)

  lazy val negVal: (String => Boolean) => (String => Boolean) = predicate => !predicate(_)

  def negGenerics[A](predicate: A => Boolean): A => Boolean = (p) => !predicate(p)
}
