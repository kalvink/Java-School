package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** String Ops
  * 
  * @author Kalvin Kao
  * @version 1.0 Build 9000 April 3, 2012.
  */

//Declaring the class
public class StringOps
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData, up, low;
    int length;
    
    System.out.println("Please enter a sentence: ");
    inData = stdin.readLine();
    
    up = inData.toUpperCase();
    low = inData.toLowerCase();
    length = inData.length();
    
    System.out.println(up);
    System.out.println(low);
    System.out.println(length);
    
  }
}