package lab

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class RelationCurryingTest {

  import lab.RelationCurrying._;

  @Test def testRelationCurryingNonCarried(): Unit = {
    assertTrue(nonCurried(1, 2, 3))
    assertTrue(nonCurried(3, 4, 5))
    assertTrue(nonCurried(6, 7, 8))
    assertFalse(nonCurried(3, 2, 1))
    assertFalse(nonCurried(5, 4, 3))
    assertFalse(nonCurried(6, 5, 4))
  }

  @Test def testRelationCurryingCarried(): Unit = {
    assertTrue(curried(1)(2)(3))
    assertTrue(curried(3)(4)(5))
    assertTrue(curried(6)(7)(8))
    assertFalse(curried(3)(2)(1))
    assertFalse(curried(5)(4)(3))
    assertFalse(curried(6)(5)(4))
  }

  @Test def testRelationNonCurriedVal(): Unit = {
    assertTrue(nonCurriedVal(1, 2, 3))
    assertTrue(nonCurriedVal(3, 4, 5))
    assertTrue(nonCurriedVal(6, 7, 8))
    assertFalse(nonCurriedVal(3, 2, 1))
    assertFalse(nonCurriedVal(5, 4, 3))
    assertFalse(nonCurriedVal(6, 5, 4))
  }

  @Test def testRelationCurriedVal(): Unit = {
    assertTrue(curriedVal(1)(2)(3))
    assertTrue(curriedVal(3)(4)(5))
    assertTrue(curriedVal(6)(7)(8))
    assertFalse(curriedVal(3)(2)(1))
    assertFalse(curriedVal(5)(4)(3))
    assertFalse(curriedVal(6)(5)(4))
  }

  @Test def tesPartiallyCurried(): Unit = {
    val partiallyApplied = curriedVal(1)(2)
    assertTrue(partiallyApplied(3))
    assertFalse(partiallyApplied(0))
  }

  @Test def testComposeGenerics(): Unit = {
    val f: String => Boolean = {
      case "even" => true
      case "odd"  => false
    }
    val g: Int => String = {
      case n if n % 2 == 0 => "even"
      case _ => "odd"
    }
    val isEven = compose(f, g)
    assertTrue(isEven(4))
    assertFalse(isEven(5))
  }
}
