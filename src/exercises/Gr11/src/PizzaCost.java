package exercises.Gr11.src;

/** Pizza Cost
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Feb 27, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class PizzaCost
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double laborCost;
    double rentCost;
    double diameter;
    double material;
    
    System.out.println("Enter the diameter of the pizza in inches:");
    inData = stdin.readLine();
    diameter = Double.parseDouble (inData);
    laborCost = 0.75;
    rentCost = 1;
    material = 0.05*Math.pow(diameter,2) + laborCost + rentCost;
    
    System.out.println("The cost making the pizza is: $" + material);
    
  }
}