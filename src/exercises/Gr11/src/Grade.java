package exercises.Gr11.src;

/** Grade
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 7, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Grade
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    String grade;
    int percent;
    
    System.out.println("Enter the percentage: ");
    inData = stdin.readLine();
    percent = Integer.parseInt (inData);
    
    if (percent >=90 && percent <=100)
      grade = ("A");
    else if (percent >=80 && percent <=89)
      grade = ("B");
    else if (percent >=70 && percent <=79)
      grade = ("C");
    else if (percent >=60 && percent <=69)
      grade = ("D");
    else
      grade = ("F");
    
    System.out.println("The corresponding letter grade is: " + grade);
    
  }
}