package lab

object RelationCurrying {
  def nonCurried(x: Int, y: Int, z: Int): Boolean = x <= y && y <= z

  def curried(x: Int)(y: Int)(z: Int): Boolean = nonCurried(x, y, z)

  val nonCurriedVal = (x: Int, y: Int, z: Int) => nonCurried(x, y, z)

  val curriedVal: Int => Int => Int => Boolean = x => y => z => nonCurried(x, y, z)

  def compose[A, B, C](f: B => C, g: A => B): A => C = x => f(g(x))
}
