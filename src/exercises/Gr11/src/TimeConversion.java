package exercises.Gr11.src;

/** Time Conversion
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Feb 29, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class TimeConversion
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int time;
    int hours;
    int min1; //minutes > 10
    int min2; //minutes < 10
    
    System.out.println("Enter the time in minutes:");
    inData = stdin.readLine();
    time = Integer.parseInt (inData);
    
    hours = time/60;
    time = time%60;
    min1 = time/10;
    time = time%10;
    min2 = time/1;
    
    System.out.print("The time is: " + hours);
    System.out.print(":");
    System.out.print(min1);
    System.out.println(min2);
    
    
  }
}