package exercises.Gr11.src;

/** Energy
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Feb 28, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Energy
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double mass;
    double speed;
    double energy;
    double bulbs;
    
    System.out.println("Enter the mass in kilograms:");
    inData = stdin.readLine();
    mass = Double.parseDouble (inData);
    speed = 3.0*Math.pow(10,8);
    energy = mass*Math.pow(speed,2);
    
    System.out.println("The energy produced in Joules is = " + energy);
    bulbs = energy/360000;
    System.out.println("The number of 100-watt light bulbs powered = " + bulbs);
  }
}