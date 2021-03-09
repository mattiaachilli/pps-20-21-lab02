package lab

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test;

class ParityTest {

  import lab.Parity._;

  @Test def testParityDef(): Unit = {
    assertEquals("even", parity(2))
    assertEquals("odd", parity(1))
  }

  @Test def testParityVal(): Unit = {
    assertEquals("even", parityVal(2))
    assertEquals("odd", parityVal(1))
  }
}
