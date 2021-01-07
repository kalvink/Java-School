package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** DiceRoll
  * 
  * @author Kalvin Kao
  * @version 1.0 Build 9000 April 2, 2012.
  */

//Declaring the class
public class DiceRoll
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int dice1, dice2, total;
    
    dice1 =(int)(Math.random()* 6 + 1);
    dice2 =(int)(Math.random()* 6 + 1);
    total = dice1+dice2;
    
    System.out.println("Dice 1: "+dice1);
    System.out.println("Dice 2: "+dice2);
    System.out.println("The total sum of the dices: "+total);
    
    
  }
}