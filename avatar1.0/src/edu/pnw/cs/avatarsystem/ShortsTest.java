package edu.pnw.cs.avatarsystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShortsTest {

  @Test
  void testShortsDescription_FirstOutput() {
    Shorts j1 = new Shorts(new MaleAvatar());
    String y = j1.getDescription();
    String x = "Shorts";
    assertEquals(x, y);
  }
  
  @Test
  void testShortsDescription_SecondOutput() {
    Shorts j1 = new Shorts(new Jeans(new MaleAvatar()));
    String y = j1.getDescription();
    String x = "Jeans, Shorts";
    assertEquals(x, y);
  }

}
