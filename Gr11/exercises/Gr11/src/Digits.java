package exercises.Gr11.src;

/** Digits application that shows the hundreds-place digit, tens-place digit, and ones place digit of a three digit number.
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Feb 29, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Digits
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int number;
    int hundred;
    int ten;
    int one;
    
    System.out.println("Enter a three-digit number:");
    inData = stdin.readLine();
    number = Integer.parseInt (inData);
    hundred = number/100;
    number = number%100;
    ten = number/10;
    number = number%10;
    one = number/1;
    
    
    System.out.println("The hundreds-place digit is: " + hundred);
    System.out.println("The tens-place digit is: " + ten);
    System.out.println("The ones-place digit is: " + one);
  }
}