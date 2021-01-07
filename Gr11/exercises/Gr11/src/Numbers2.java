package exercises.Gr11.src;

import java.io.*;

/** Numbers 2 - A program that prompts the user for 10 numbers and then
  * displays the sum of the 10 numbers.
  * 
  * @author Kalvin Kao
  * @version 0.1 Build April 30, 2012
  */

public class Numbers2{
  
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int n=0;
    
    System.out.println( "How many values:" );
    inData = stdin.readLine();
    n    = Integer.parseInt( inData );
    
    int A[] = new int[n];
    System.out.println( "Enter "+n+" integer(s): " );
    for (int i=0; i<n; i=i+1){
      inData = stdin.readLine();
      A[i] = Integer.parseInt(inData);
    }
    System.out.println("The sum of the "+n+" integers is "+sumOfValue(A,n)+".");
    System.out.println("The average of the "+n+" integers is "+avgOfValue(A,n)+".");
    System.out.println("The minimum of the "+n+" integers is "+minOfValue(A,n)+".");
    /** Take in an array of integers and the length of array and 
      * and return the sum of the values in the array
      * 
      * @param A       Array of integers
      * @param n       Length of the array
      * @return        Sum of the elements in the array
      */
  }
  public static int sumOfValue(int A[], int n){
    int sum=0;
    for (int i=0; i<n; i++){
      sum+=A[i];
    }
    return sum;
  }
  /** Take in an array of integers and the length of array and 
    * and return the average of the values in the array
    * 
    * @param A       Array of integers
    * @param n       Length of the array
    * @return        Average of the elements in the array
    */
  public static int avgOfValue(int A[], int n){
    int avg=0;
    for (int i=0; i<n; i++){
      avg+=A[i];
    }
    return avg/n;
  }
  /** Take in an array of integers and the length of array and 
    * and return the sum of the values in the array
    * 
    * @param A       Array of integers
    * @param n       Length of the array
    * @return        Sum of the elements in the array
    */
  public static int minOfValue(int A[], int n){
    int min=0;
    for (int i=0; i<n; i++){
      min+=A[i];
    }
    return 0;
  }
}
