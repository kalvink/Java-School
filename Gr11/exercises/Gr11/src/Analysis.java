package exercises.Gr11.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Analysis - Prompts the user for numbers in the range 1 through 50, terminated by a sentinel, and then performs 
  * the following analysis on the numbers: 
  * • Determine the average number 
  * • Determine the maximum number
  * • Determine the range (maximum – minimum)
  * • Determine the median (the number that occurs the most often)
  * • Displays a bar graph called a histogram that shows the numbers in each five-unit
  * range (1–5, 6–10, 11-15, etc.).
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 May 8, 2012.
  */

public class Analysis {
  
  /** Prompts the user for numbers in the range 1 through 50, 
    * terminated by a sentinel, and then performs the following
    * analysis on the numbers: 
    * • Determine the average number 
    * • Determine the maximum number
    * • Determine the range (maximum – minimum)
    * • Determine the median (the number that occurs the most often)
    * • Displays a bar graph called a histogram that shows the numbers in each five-unit
    * range (1–5, 6–10, 11-15, etc.).
    * 
    */
  
  public static void Analysis() throws IOException
  {
    BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
    String inData;
    int n=0;
    
    System.out.println( "How many values:" );
    inData = stdin.readLine();
    n    = Integer.parseInt( inData );
    
    int A[] = new int[n];
    System.out.println( "Enter "+n+" integer(s) that are between 1 and 50:" );
    for (int i=0; i<n; i=i+1){
      inData = stdin.readLine();
      A[i] = Integer.parseInt(inData);
    }
    System.out.println("The average of the "+n+" integers is "+avgOfValue(A,n)+".");
    System.out.println("The maximum of the integers is "+maxOfValue(A)+".");
    /** Take in an array of integers and the length of array and 
      * and return the average of the values in the array
      * 
      * @param A       Array of integers
      * @param n       Length of the array
      * @return        Average of the elements in the array
      */
    
  }
  public static int avgOfValue(int A[], int n){
    int avg=0;
    for (int i=0; i<n; i++){
      avg+=A[i];
    }
    return avg/n;
  }
  public static int maxOfValue(int A[]){
    {
      int   max;
      
      // initialize the current maximum
      max = A[0]; //-20
      // scan the array
      for ( int index=0; index < A.length; index++ ) // (index is 0 < 8 + index+1)
      {
        if ( A[ index ] > max )  // examine the current element index if -20 > -20
          max = A[ index ];        // if it is the largest so far, change max -20 = -
      }
      return (max);
    }
  }
}