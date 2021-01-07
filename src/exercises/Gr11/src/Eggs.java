package exercises.Gr11.src;

/** Eggs
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 6, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Eggs
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double eggs;
    double mod;
    double price;
    double price2;
    double total;
    
    System.out.println("Enter the number of eggs purchased: ");
    inData = stdin.readLine();
    eggs = Integer.parseInt (inData);
    mod = eggs % 12;
    eggs = eggs/12;
    
    if (eggs >=0 && eggs <48)
      price = 0.50;
    else if (eggs >=48 && eggs <72)
      price = 0.45;
    else if (eggs >=72 && eggs <132)
      price = 0.40;
    else
      price = 0.35;

    price2 = (price/12);
    total = (price2*mod)+price;
    
    System.out.println("The bill is equal to: $" + total);
    
  }
}