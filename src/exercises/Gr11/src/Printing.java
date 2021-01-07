package exercises.Gr11.src;

/** Printing
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 5, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Printing
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int copy;
    double price;
    double total;
    
    System.out.println("Enter the number of copies to be printed: ");
    inData = stdin.readLine();
    copy = Integer.parseInt (inData);
    
    if (copy >=0 && copy <=99)
      price = 0.30;
    else if (copy >=100 && copy <=499)
      price = 0.28;
    else if (copy >=500 && copy <=749)
      price = 0.27;
    else if (copy >=750 && copy <=1000)
      price = 0.26;
    else
      price = 0.25;
    
    total = copy * price;
    
    System.out.println("Price per copy is: $" + price);
    System.out.println("Total cost is: $" + total);
    
  }
}