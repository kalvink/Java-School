package exercises.Gr11.src;

/** Sleep
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 1, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Sleep
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int year;
    int month;
    int day;
    int year2;
    int month2;
    int day2;
    int alivedays;
    int slepthours;
    
    System.out.println("Enter your birthdate:");
    System.out.println("Year:");
    inData = stdin.readLine();
    year = Integer.parseInt (inData);
    
    System.out.println("Month:");
    inData = stdin.readLine();
    month = Integer.parseInt (inData);
    
    System.out.println("Day:");
    inData = stdin.readLine();
    day = Integer.parseInt (inData);
    
    System.out.println("Enter today's date:");
    System.out.println("Year:");
    inData = stdin.readLine();
    year2 = Integer.parseInt (inData);
    
    System.out.println("Month:");
    inData = stdin.readLine();
    month2 = Integer.parseInt (inData);
    
    System.out.println("Day:");
    inData = stdin.readLine();
    day2 = Integer.parseInt (inData);
    
    alivedays = (year2-year)*365 + (month2-month)*30 + (day2-day);
    slepthours = (year2-year)*365*8 + (month2-month)*30*8 + (day2-day)*8;
    
    System.out.print("You have been alive for " + alivedays);
    System.out.println(" days.");
    System.out.print("You have slept " + slepthours);
    System.out.println(" hours.");
    
    
  }
}