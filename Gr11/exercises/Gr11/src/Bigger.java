package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Bigger
  * 
  * @author Kalvin Kao
  * @version 1.0 Build 9000 April 2, 2012.
  */

//Declaring the class
public class Bigger
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int x, y;
    
    System.out.println("Please enter the first number: ");
    inData = stdin.readLine();
    x = Integer.parseInt (inData);
    System.out.println("Please enter the second number: ");
    inData = stdin.readLine();  
    y = Integer.parseInt (inData);
    
    if (x==y)
    System.out.println("The number "+x+" is equal to the number "+y+".");
    else if (x>y)
      System.out.println("The number "+x+" is bigger than the number "+y+".");
    else
      System.out.println("The number "+y+" is bigger than the number "+x+".");
  }
}