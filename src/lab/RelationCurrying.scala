package lab

object RelationCurrying extends App {
  def nonCurried(x: Int, y: Int, z: Int): Boolean = (x <= y && y <= z)

  def curried(x: Int)(y: Int)(z: Int): Boolean = nonCurried(x, y, z)

  lazy val nonCurriedVal = (x: Int, y: Int, z: Int) => nonCurried(x, y, z)

  lazy val curriedVal: Int => Int => Int => Boolean = x => y => z => nonCurried(x, y, z)
}
