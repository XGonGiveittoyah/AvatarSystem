package edu.pnw.cs.avatarsystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JeansTest {

  @Test
  void testJeansDescription_FirstOutput() {
    Jeans j1 = new Jeans(new MaleAvatar());
    String y = j1.getDescription();
    String x = "Jeans";
    assertEquals(x, y);
  }
  
  @Test
  void testJeansDescription_SecondOutput() {
    Jeans j1 = new Jeans(new Jacket(new MaleAvatar()));
    String y = j1.getDescription();
    String x = "Jacket, Jeans";
    assertEquals(x, y);
  }

}
