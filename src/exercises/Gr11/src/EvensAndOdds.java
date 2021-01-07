package exercises.Gr11.src;

import java.io.*;
import java.util.Random;

/** Evens And Odds - generates 25 random integers between 0 
  * and 99 and then displays all the evens on one line and 
  * all the odds on the next line.
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 May 2, 2012.
  */
class EvensAndOdds
{
  public static void main (String[] args)
  {
    String even = "";
    String odd = "";
    int randomN;
    int count;
    
    int maxvalue = 25; //the amount of random numbers to be generated
    
    Random random = new Random();
    
    for(count = 0; count < maxvalue; count++)
    {
      randomN = random.nextInt(100);

      if(randomN % 2 == 0)
        even += randomN + " ";
      else
        odd += randomN + " ";
    }
    //Displays the odd and even numbers
    System.out.println("Odd:\n " + odd);
    System.out.println("Even:\n " + even);
  }
}