package edu.pnw.cs.avatarsystem;

public class HighHeels extends ClothingDecorator {
  private Avatar avatar;
  
  public HighHeels(Avatar avatar) {
    this.avatar = avatar;
  }

  @Override
  public String getDescription() {
    if (avatar.getDescription() == null) {
      return "High Heels";
    } else {
      return avatar.getDescription() + ", High Heels";
    }
  }

}
