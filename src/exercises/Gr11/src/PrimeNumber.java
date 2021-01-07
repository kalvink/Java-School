package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Prime Numbers
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 19, 2012.
  */
class PrimeNumber
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int number;
    boolean isPrime=true;
    
    System.out.println("Please enter a number:");
    inData = stdin.readLine();
    number = Integer.parseInt (inData);
    
    if (number !=2 && (number <2 || number %2==0)){
      isPrime=false;
  }
  else{
      for (int i=3; i<Math.sqrt(number); i=i+2) {
      if(number%i==0){
        isPrime=false;
      }
    }
  }
  if (isPrime==true){
    System.out.println(number+" is a prime number.");
  }
  else {
    System.out.println(number+" is not a prime number");
  }
  
}
}