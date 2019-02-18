package edu.pnw.cs.avatarsystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SunglassesTest {

  @Test
  void testSunglassesDescription_FirstOutput() {
    Sunglasses j1 = new Sunglasses(new MaleAvatar());
    String y = j1.getDescription();
    String x = "Sunglasses";
    assertEquals(x, y);
  }
  
  @Test
  void testSunglassesDescription_SecondOutput() {
    Sunglasses j1 = new Sunglasses(new Jeans(new MaleAvatar()));
    String y = j1.getDescription();
    String x = "Jeans, Sunglasses";
    assertEquals(x, y);
  }

}
