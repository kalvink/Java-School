package exercises.Gr11.src;

/** Car Recall
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 7, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class CarRecall
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int model;
    
    System.out.println("Enter the car's model number: ");
    inData = stdin.readLine();
    model = Integer.parseInt (inData);
    
    if (model == 119 || model == 179 || model >=189 && model <=195 || model == 221 || model == 780)
      System.out.println("Your car is defective. It must be repaired.");
    else
      System.out.println("Your car is not defective.");
    
  }
}