package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Chaos - Prompts the user for a starting value and then performs 
  * this experiment.
  *Start with any real number x between 0 and 1. Generate a new number using the “ logistic equation:” 
  * x = 2*x(1 - x) 
  * Displays this new x and repeat the process 50 times.
  * 
  * @author Kalvin Kao
  * @version 1.0 Build 9000 Mar 28, 2012.
  */

//Declaring the class
public class Chaos
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double x;
    
    System.out.println("Please enter an integer between 0 and 1: ");
    inData = stdin.readLine();
    x = Double.parseDouble (inData);
    if (x>0 && x<1){
      x = 2*x*(1-x);
      System.out.println(x);
      
    }else
      System.out.println("The number isn't between 0 and 1.");
  }
}