/*
 * Dice.java
 */

public class Dice {
  public Dice () { }// end Dice()
  
  public int rollDice() {
    double random = Math.random();
    System.out.println( random );
    
    random *= 6;
    System.out.println(random);
    
    return (int) random;
  } // end rollDice()
  
} // end Dice 