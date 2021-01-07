package exercises.Gr11.src;

import java.io.*;

/** The Method Performance Task is a class that contains 
  * multiple methods which have several functions.
  * The methods are, areaofCircle, randomInteger, 
  * and randomCharacter.
  * 
  * @author Kalvin Kao
  * @version 0.1 Build April 24, 2012
  */

public class MethodPerformanceProblem{
  
  /** areaOfCircle take in two values (the length and width), 
    * and return the area of that square.
    * 
    * @param r     Radius of the circle
    * @return        Area of the circle
    */
  public static double areaOfCircle(double r)
  {
    return Math.PI*Math.pow(r,2);
  }
  
  /** randomInteger takes in two values as the range
    * of the random numbers. (between a and b)
    * 
    * @param a     number 1
    * @param b     number 2
    * @return      a random number between a and b.
    */
  public static int randomInteger(int a, int b)
  {
    return (int)(Math.random()*b + a ); //my failed formula
    //return (int)(a + (Math.random() * (b - a)));
    
  }
  /** randomCharacter selects and returns a 
    * lowercase letter in the alphabet.
    */
  public static void randomCharacter()
  {
    int x=(int)(Math.random()*26+0);
    String y="abcdefghijklmnopqrstuvwxyz";
    int s;
    System.out.print(y.charAt(x));

  }
}





