package u02
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.{BeforeEach, Test};

class NegTest {

  import Neg._;

  val empty: String => Boolean = _ == ""
  val notEmpty: String => Boolean = neg(empty)

  val notEmptyVal: String => Boolean = negVal(empty)

  val emptyInt: Int => Boolean = _== 0
  val notIntEmptyGenerics: Int => Boolean = negGenerics(emptyInt)

  @Test def testNegDef(): Unit = {
    assertTrue(notEmpty("ciao"))
    assertFalse(notEmpty(""))
  }

  @Test def testNegVal(): Unit = {
    assertTrue(notEmptyVal("ciao"))
    assertFalse(notEmptyVal(""))
  }

  @Test def testNegGenerics(): Unit = {
    assertTrue(notIntEmptyGenerics(1))
    assertFalse(notIntEmptyGenerics(0))
  }
}
