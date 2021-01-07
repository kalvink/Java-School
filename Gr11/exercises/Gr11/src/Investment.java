package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Investment - An application that calculates how many years it will take for a $2,500 investment
to be worth at least $5,000 if compounded annually at 7.5%
  * 
  * 
  * @author Kalvin Kao
  * @version 1.0 Build 9000 Mar 30, 2012.
  */

public class Investment
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double initial=2500;
    double annual;  
    double years;
      annual=initial*0.075;
      years=5000/annual;
      System.out.println("It will take "+years+" years.");
      
  }
}
      
