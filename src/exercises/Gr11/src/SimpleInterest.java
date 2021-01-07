package exercises.Gr11.src;

/** Simple Interest
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 2, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class SimpleInterest
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double gallon;
    double quart;
    double pint;
    double cup;
    double tablespoon;
    
    System.out.println("Enter the number of gallons:");
    inData = stdin.readLine();
    gallon = Integer.parseInt (inData);
    
    quart = gallon*4;
    pint = quart*2;
    cup = pint*2;
    tablespoon = cup*16;
    
    System.out.print("In " + gallon);
    System.out.println(" gallons there are:");
    System.out.print(quart);
    System.out.println(" quarts");
    System.out.print(pint);
    System.out.println(" pints");
    System.out.print(cup);
    System.out.println(" cups");
    System.out.print(tablespoon);
    System.out.println(" tablespoons");
    
    
    
    
  }
}