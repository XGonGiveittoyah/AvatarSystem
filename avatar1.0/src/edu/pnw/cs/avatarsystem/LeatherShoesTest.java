package edu.pnw.cs.avatarsystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeatherShoesTest {

  @Test
  void testLeatherDescription_FirstOutput() {
    LeatherShoes j1 = new LeatherShoes(new MaleAvatar());
    String y = j1.getDescription();
    String x = "Leather Shoes";
    assertEquals(x, y);
  }
  
  @Test
  void testLeatherShoesDescription_SecondOutput() {
    LeatherShoes j1 = new LeatherShoes(new Jeans(new MaleAvatar()));
    String y = j1.getDescription();
    String x = "Jeans, Leather Shoes";
    assertEquals(x, y);
  }

}
