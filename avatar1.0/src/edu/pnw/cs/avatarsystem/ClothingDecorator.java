package edu.pnw.cs.avatarsystem;

public abstract class ClothingDecorator implements Avatar {
  Avatar avatar;
  
  public abstract String getDescription();
}
