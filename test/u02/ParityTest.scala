package u02
import org.junit.jupiter.api.Assertions._;
import org.junit.jupiter.api.Test;

class ParityTest {

  import Parity._;

  @Test def testParity(): Unit = {
    assertEquals("even", parity(2))
    assertEquals("odd", parity(1))
  }

  @Test def testParityVal(): Unit = {
    assertEquals("even", parityVal(2))
    assertEquals("odd", parityVal(1))
  }
}
