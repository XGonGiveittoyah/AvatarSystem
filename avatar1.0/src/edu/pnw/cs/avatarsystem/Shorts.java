package edu.pnw.cs.avatarsystem;

public class Shorts extends ClothingDecorator {
  private Avatar avatar;
  
  public Shorts(Avatar avatar) {
    this.avatar = avatar;
  }

  @Override
  public String getDescription() {
    if (avatar.getDescription() == null) {
      return "Shorts";
    } else {
      return avatar.getDescription() + ", Shorts";
    }
  }

}
