package edu.pnw.cs.avatarsystem;

import java.util.Scanner;

public class Test {
  
  /**
   * Main method.
   * 
   * 
   * @param args command line arguments
   */
  public static void main(String[] args) {
    final Scanner input = new Scanner(System.in);
    int choice;
    Avatar myAvatar = null;
    
    System.out.println("Welcome to Avatar 1.0!");
    System.out.println("Please select your character.");
    System.out.println("  1 - Male");
    System.out.println("  2 - Female");
    choice = input.nextInt();
    
    if (choice == 1) {
      myAvatar = new MaleAvatar();
      System.out.println("You have selected the Male.");
    } else if (choice == 2) {
      myAvatar = new FemaleAvatar();
      System.out.println("You have selected the Female");
    } else {
      System.out.println("Invalid Input");
    }
    
    while (choice != 0) {
      System.out.println("Please select a cosmetic for your character.");
      System.out.println("  0 - Exit");
      System.out.println("  1 - Jacket");
      System.out.println("  2 - T-Shirt");
      System.out.println("  3 - Jeans");
      System.out.println("  4 - Shorts");
      System.out.println("  5 - Sunglasses");
      System.out.println("  6 - Leather Shoes");
      System.out.println("  7 - High Heels");
      
      choice = input.nextInt();
      
      switch (choice) {
        case 0:
          break;
        case 1:
          System.out.println("You have selected a Jacket for your character.");
          myAvatar = new Jacket(myAvatar);
          break;
        case 2:
          System.out.println("You have selected a T-Shirt for your character.");
          myAvatar = new TShirt(myAvatar);
          break;
        case 3:
          System.out.println("You have selected Jeans for your character.");
          myAvatar = new Jeans(myAvatar);
          break;
        case 4:
          System.out.println("You have selected Shorts for your character.");
          myAvatar = new Shorts(myAvatar);
          break;
        case 5:
          System.out.println("You have selected Sunglasses for your character.");
          myAvatar = new Sunglasses(myAvatar);
          break;
        case 6:
          System.out.println("You have selected Leather Shoes for your character.");
          myAvatar = new LeatherShoes(myAvatar);
          break;
        case 7:
          System.out.println("You have selected High Heels for your character.");
          myAvatar = new HighHeels(myAvatar);
          break;
        default:
          System.out.println("Invalid Input.");
          break;
      }
    }
    
    System.out.println("Your character has the following items:");
    System.out.println(myAvatar.getDescription());
    System.out.println();
    System.out.println("Thanks for using Avatar 1.0!");
    
  }
}
