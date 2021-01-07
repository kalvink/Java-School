package exercises.Gr11.src;

import java.io.*;

/** The Method Performance Problem 3z is a class that contains 
  * multiple methods which have several functions.
  * The methods are, 
  * printFrame: Takes in three numbers and returns the 
  * largest of three numbers.
  * 
  * : Takes in a string and returns the number of 
  * vowels in that string S (a,e,i,o, and u are vowels)
  * 
  * @author Kalvin Kao
  * @version 0.1 Build April 26, 2012
  */

public class MethodPerformanceProblem2{
  
  /** printFrame - 
    * 
    * @param A     Number 1
    * @param B     Number 2
    * @return      Largest number of the three numbers.
    */
  public static void printFrame(int height, int width) {
    int lastRow = 1 + 2*(width-1);
    for (int row = 1; row <= width; row ++) {
      for (int x = (lastRow - (1 + 2*(row - 1)) )/2; x != 0; x = x-1) { System.out.print(" ");}
      for (int i = 0; i != 1 + 2*(row - 1); i++) {System.out.print("*");}
      //int x = (lastRow - (1 + 2*(row - 1)) )/2;
      for (int x = (lastRow - (1 + 2*(row - 1)) )/2; x != 0; x = x-1) { System.out.print(" ");}
      System.out.print("\n");
    }
  }
  /** tableofSums - 
    * 
    * @param String S     A string.
    * @return      All the vowels in the string.
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





