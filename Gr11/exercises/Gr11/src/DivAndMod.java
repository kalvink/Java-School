package exercises.Gr11.src;

/** Div And Mod
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Feb 29, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class DivAndMod
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int firstint;
    int secondint;
    int firstdiv;
    int firstmod;
    int seconddiv;
    int secondmod;
    
    System.out.println("Enter an integer:");
    inData = stdin.readLine();
    firstint = Integer.parseInt (inData);
    System.out.println("Enter a second integer:");
    inData = stdin.readLine();
    secondint = Integer.parseInt (inData);
    
    firstdiv = firstint/secondint;
    firstmod = firstint%secondint;
    seconddiv = secondint/firstint;
    secondmod = secondint%firstint;
    
    System.out.print(firstint);
    System.out.print(" / " + secondint);
    System.out.println(" = " + firstdiv);
    System.out.print(firstint);
    System.out.print(" % " + secondint);
    System.out.println(" = " + firstmod);
    
    System.out.print("\n" + secondint);
    System.out.print(" / " + firstint);
    System.out.println(" = " + seconddiv);
    System.out.print(secondint);
    System.out.print(" % " + firstint);
    System.out.println(" = " + secondmod);
    
    
    
  }
}