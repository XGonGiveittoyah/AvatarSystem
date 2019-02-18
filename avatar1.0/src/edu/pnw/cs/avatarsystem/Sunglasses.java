package edu.pnw.cs.avatarsystem;

public class Sunglasses extends ClothingDecorator {
  private Avatar avatar;
  
  public Sunglasses(Avatar avatar) {
    this.avatar = avatar;
  }

  @Override
  public String getDescription() {
    if (avatar.getDescription() == null) {
      return "Sunglasses";
    } else {
      return avatar.getDescription() + ", Sunglasses";
    }
  }

}
