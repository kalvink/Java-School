package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Trigonometry
  * 
  * @author Kalvin Kao
  * @version 1.0 Build 9000 April 2, 2012.
  */

//Declaring the class
public class Trigonometry
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double angle, sin, cos, tan;
    
    System.out.println("Please enter an angle in degrees (between 0 and 180): ");
    inData = stdin.readLine();
    angle = Double.parseDouble (inData);
    
    tan=Math.tan(Math.toRadians(angle));
    cos=Math.cos(Math.toRadians(angle));
    sin=Math.sin(Math.toRadians(angle));
    
    System.out.println("The tangent of the angle is: "+tan);
    System.out.println("The cosine of the angle is: "+cos);
    System.out.println("The sine of the angle is: "+sin);
    
  }
}