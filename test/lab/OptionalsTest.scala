package lab

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test;
import OptionalsLab.Option._
import OptionalsLab.Option


class OptionalsTest {

  val option: Option[Int] = Some(5)
  val optionBooleanTrue: Option[Boolean] = Some(true)
  val optionBooleanFalse: Option[Boolean] = Some(false)
  val optionString: Option[String] = Some("Hello world")
  val emptyOptional: Option[Int] = None()

  @Test def testFilter(): Unit = {
    assertEquals(option, filter(option)(_ > 2))
    assertEquals(emptyOptional, filter(option)(_ > 8))
    assertEquals(option, filter(option)(_ == getOrElse(option, emptyOptional)))
    assertEquals(emptyOptional, filter(option)(_ != getOrElse(option, emptyOptional)))
  }

  @Test def testMap(): Unit = {
    val mappedOptional = map(option)({
      case n if n == getOrElse(option, emptyOptional) => "Hello world"
    })

    assertEquals(optionBooleanTrue, map(option)(_ > 2))
    assertEquals(optionBooleanFalse, map(option)(_ > 8))
    assertEquals(optionString, mappedOptional)
  }
}
