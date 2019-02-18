package edu.pnw.cs.avatarsystem;

public class Jacket extends ClothingDecorator {
  private Avatar avatar;
  
  public Jacket(Avatar avatar) {
    this.avatar = avatar;
  }
  
  @Override
  public String getDescription() {
    if (avatar.getDescription() == null) {
      return "Jacket";
    } else {
      return avatar.getDescription() + ", Jacket";
    }
  }

}
