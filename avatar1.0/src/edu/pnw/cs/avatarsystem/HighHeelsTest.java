package edu.pnw.cs.avatarsystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HighHeelsTest {

  @Test
  void testHighHeelsDescription_FirstOutput() {
    HighHeels j1 = new HighHeels(new MaleAvatar());
    String y = j1.getDescription();
    String x = "High Heels";
    assertEquals(x, y);
  }
  
  @Test
  void testHighHeelsDescription_SecondOutput() {
    HighHeels j1 = new HighHeels(new Jeans(new MaleAvatar()));
    String y = j1.getDescription();
    String x = "Jeans, High Heels";
    assertEquals(x, y);
  }

}
