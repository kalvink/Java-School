package exercises.Gr11.src;

/** Object Height
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Feb 22, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class ObjectHeight
{
  public static void main (String[] args) throws IOException // be prepared to handle the IO Exception error
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double time;
    double height;
    
    System.out.println("Enter a time less than 4.5 seconds:");
    inData = stdin.readLine();
    time = Double.parseDouble (inData);
    height = 100-4.9*Math.pow(time,2);
    
    System.out.println("The height of the object is:" + height);
    
  }
}
