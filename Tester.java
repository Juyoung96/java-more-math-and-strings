/*
 * Project: Tester.java
 * Description: Tests Circle.java, Dice.java, Polygon.java
 * Name: Juyoung Lee
 * Date: Oct 8, 2015
 */

public class Tester {
  public static void main ( String[] args) {
    
    Circle c = new Circle();
    System.out.println( c.calcArea(3) ); // static method can be clacArea(3);
    
    Dice d = new Dice();
    d.rollDice();
    
    Polygon p = new Polygon(40);
    System.out.println(p.toString());
    
  }// end main method
  
} // end Tester 