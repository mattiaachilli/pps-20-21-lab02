package lab

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test;
import OptionalsLab.Option._
import OptionalsLab.Option


class OptionalsTest {

  val value = 5
  val option: Option[Int] = Some(5)
  val optionBooleanTrue: Option[Boolean] = Some(true)
  val optionBooleanFalse: Option[Boolean] = Some(false)
  val optionString: Option[String] = Some("Hello world")
  val emptyOptional: Option[Int] = None()

  @Test def testFilter(): Unit = {
    assertEquals(option, filter(option)(_ > value - 1))
    assertEquals(emptyOptional, filter(option)(_ > value + value))
    assertEquals(option, filter(option)(_ == value))
    assertEquals(emptyOptional, filter(option)(_ != value))
  }

  @Test def testMap(): Unit = {
    val mappedOptional = map(option)({
      case n if n == getOrElse(option, emptyOptional) => "Hello world"
      case _ => None()
    })

    assertEquals(optionString, mappedOptional)
    assertEquals(optionBooleanTrue, map(option)(_ > value - 1))
    assertEquals(optionBooleanFalse, map(option)(_ > value + value))
    assertEquals(emptyOptional, map(emptyOptional)(_ > 0))
  }

  @Test def testMap2(): Unit = {
    assertEquals(Some(value + value), map2(option)(option)(_ + _))
    assertEquals(Some(value * value), map2(option)(option)(_ * _))
    assertEquals(Some(value + " " + value), map2(option)(option)(_ + " " + _))
    assertEquals(emptyOptional, map2(option)(emptyOptional)(_ * _))
    assertEquals(emptyOptional, map2(emptyOptional)(emptyOptional)(_ + _))
  }
}
