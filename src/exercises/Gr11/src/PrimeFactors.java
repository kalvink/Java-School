package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Prime Factors - 
  * The Fundamental Theorem of Arithmetic states that every positive integer is the product of a set of
  * prime numbers. This set is called the prime factors. 
  * For example, the prime factors for 140 are 2, 2, 5,
  * and 7 (2*2*5*7 = 140).
  * 
  * Prompts the user for a positive integer 
  * and then displays that integer’s prime factors.
  * 
  * @author Kalvin Kao
  * @version 1.0 Build 9000 Mar 30, 2012.
  */

public class PrimeFactors
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double x;
    double count=2;
    double n;
    double temp;
    
    System.out.println("Please enter a positive integer: ");
    inData = stdin.readLine();
    x = Double.parseDouble (inData);
    temp = x/count;
    System.out.print(temp);
    
    do
    {
      count=count+1;
    }
    while (count<=x);
      
      if (temp%2==0){
      System.out.println(count);
      n = x/count;
      
      
      }
    }
  }