package edu.pnw.cs.avatarsystem;

public class LeatherShoes extends ClothingDecorator {
  private Avatar avatar;
  
  public LeatherShoes(Avatar avatar) {
    this.avatar = avatar;
  }

  @Override
  public String getDescription() {
    if (avatar.getDescription() == null) {
      return "Leather Shoes";
    } else {
      return avatar.getDescription() + ", Leather Shoes";
    }
  }

}
