package exercises.Gr11.src;

import java.io.*;

/** The Method Performance Problem 3z is a class that contains 
  * multiple methods which have several functions.
  * The methods are, 
  * 
  * printFrame: Prints a frame of characters 
  * according to the parameters. Limited to half a frame only
  * because the other half broke while shipping.
  * 
  * tableofSums - Prompts the user for a positive integer
  * then returns a table of all the sums of the form i/n + j/n.
  * 
  * @author Kalvin Kao
  * @version 1.0 Build April 27, 2012
  */

public class MethodPerformanceProblem3{
  
  /** printFrame - Prints a frame of characters according to the parameters
    * Limited to half a frame because it broke while shipping.
    * 
    * @height    the height of the frame
    * @width     the width of the frame
    * @return    a frame with the parameters given.
    */
  public static void printFrame(int height, int width) {
    int lastRow = 1 + 2*(width);
    for (int row = 1; row <= height; row ++) {
      for (int i = 0; i != 1 + 2*(row - 1); i++) {System.out.print("#");}
      System.out.print("\n");
    }
  }
  /** tableofSums - Prompts the user for a positive integer
    * then returns a table of all the sums of the form i/n + j/n
    * 
    * @return  table of the sums of the form i/n + j/n
    */
  public static void tableofSums() throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream ); 
    System.out.println("Enter a positive integer"); 
    String inData = stdin.readLine();
    int n = Integer.parseInt (inData);
    for (int i = 1; i <=n; i++){ 
      for (int j = 1; j <= n; j++) 
        System.out.print((double)i/n + (double)j/n+" "); 
      System.out.println(); 
    }
  }
}





