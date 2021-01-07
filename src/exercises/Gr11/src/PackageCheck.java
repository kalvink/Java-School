package exercises.Gr11.src;

/** Package Check
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 6, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class PackageCheck
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int weight;
    int length;
    int width;
    int height;
    int print;
    
    
    System.out.println("Enter package weight in kilograms: ");
    inData = stdin.readLine();
    weight = Integer.parseInt (inData);
    
    System.out.println("Enter package length in centimeters: ");
    inData = stdin.readLine();
    length = Integer.parseInt (inData);
    
    System.out.println("Enter package width in centimenters: ");
    inData = stdin.readLine();
    width = Integer.parseInt (inData);
    
    System.out.println("Enter package height in centimeters: ");
    inData = stdin.readLine();
    height = Integer.parseInt (inData);
    
    if (weight > 27 && length*width*height > 100000)
      System.out.println("Too heavy and too large.");
    else if (weight < 27 && length*width*height > 100000)
      System.out.println("Too large.");
    else
      System.out.println("Too heavy.");
    
  }
}