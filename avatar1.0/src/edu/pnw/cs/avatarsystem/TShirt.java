package edu.pnw.cs.avatarsystem;

public class TShirt extends ClothingDecorator {
  private Avatar avatar;
  
  public TShirt(Avatar avatar) {
    this.avatar = avatar;
  }

  @Override
  public String getDescription() {
    if (avatar.getDescription() == null) {
      return "TShirt";
    } else {
      return avatar.getDescription() + ", TShirt";
    }
  }

}
