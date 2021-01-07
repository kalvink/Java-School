package exercises.Gr11.src;

/** Change
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Feb 28, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Change
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int change;
    int quarter;
    int dime;
    int nickel;
    int penny;
    
    System.out.println("Enter the change in cents: ");
    inData = stdin.readLine();
    change = Integer.parseInt (inData);
    quarter = change/25;
    change = change%25;
    dime = change/10;
    change = change%10;
    nickel = change/5;
    change = change%5;
    penny = change/1;
    
    System.out.println("The minimum number of coins is \nQuarters:" + quarter);
    System.out.println("Dimes:" + dime);
    System.out.println("Nickels:" + nickel);
    System.out.println("Pennies:" + penny);
    
    
  }
}