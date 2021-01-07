package exercises.Gr11.src;

/** Order
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 2, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Order
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int burger;
    int frie;
    int soda;
    double total;
    double tax;
    double ftotal;
    
    System.out.println("Enter the number of burgers:");
    inData = stdin.readLine();
    burger = Integer.parseInt (inData);
    
    System.out.println("Enter the number of fries:");
    inData = stdin.readLine();
    frie = Integer.parseInt (inData);
    
    System.out.println("Enter the number of sodas:");
    inData = stdin.readLine();
    soda = Integer.parseInt (inData);
    
    total = (burger*1.69) + (frie*1.09) + (soda*0.99);
    tax = total*0.065;
    ftotal = total + tax;
    
    System.out.println("Total before tax: $" + total);
    System.out.println("Tax: $" + tax);
    System.out.println("Final total: $" + ftotal);
    
    
    
    
    
  }
}