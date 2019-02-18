package edu.pnw.cs.avatarsystem;

public class Jeans extends ClothingDecorator {
  private Avatar avatar;
  
  public Jeans(Avatar avatar) {
    this.avatar = avatar;
  }

  @Override
  public String getDescription() {
    if (avatar.getDescription() == null) {
      return "Jeans";
    } else {
      return avatar.getDescription() + ", Jeans";
    }
  }

}
