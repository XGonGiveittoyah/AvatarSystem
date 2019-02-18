package edu.pnw.cs.avatarsystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TShirtTest {

  @Test
  void testTShirtDescription_FirstOutput() {
    TShirt j1 = new TShirt(new MaleAvatar());
    String y = j1.getDescription();
    String x = "TShirt";
    assertEquals(x, y);
  }
  
  @Test
  void testTShirtDescription_SecondOutput() {
    TShirt j1 = new TShirt(new Jeans(new MaleAvatar()));
    String y = j1.getDescription();
    String x = "Jeans, TShirt";
    assertEquals(x, y);
  }

}
