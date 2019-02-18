package edu.pnw.cs.avatarsystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JacketTest {

  @Test
  void testJacketDescription_FirstOutput() {
    Jacket j1 = new Jacket(new MaleAvatar());
    String y = j1.getDescription();
    String x = "Jacket";
    assertEquals(x, y);
  }
  
  @Test
  void testJacketDescription_SecondOutput() {
    Jacket j1 = new Jacket(new Jeans(new MaleAvatar()));
    String y = j1.getDescription();
    String x = "Jeans, Jacket";
    assertEquals(x, y);
  }

}
