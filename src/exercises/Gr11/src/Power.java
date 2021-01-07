package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Power
  * 
  * @author Kalvin Kao
  * @version 1.0 Build 9000 April 2, 2012.
  */

//Declaring the class
public class Power
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double x, y, a, b;
    
    System.out.println("Please enter the first number: ");
    inData = stdin.readLine();
    x = Double.parseDouble (inData);
    System.out.println("Please enter the second number: ");
    inData = stdin.readLine();  
    y = Double.parseDouble (inData);
    
    a=Math.pow(x,y);
    b=Math.pow(y,x);
    System.out.println(+x+" to the power of "+y+" is "+a);
    System.out.println(+y+" to the power of "+x+" is "+b);
  }
}