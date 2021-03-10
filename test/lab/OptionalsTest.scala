package lab

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test;
import OptionalsLab.Option._


class OptionalsTest {
  
  @Test def testFilter(): Unit = {
    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))
  }
}
