package exercises.Gr11.src;

import java.io.*;

/** Numbers  - A program that prompts the user for 10 numbers and then
  * displays the sum of the 10 numbers.
  * 
  * @author Kalvin Kao
  * @version 0.1 Build April 30, 2012
  */

public class Numbers{
  
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
    
    System.out.println("Enter the first number: ");
    inData = stdin.readLine();
    n1 = Integer.parseInt (inData);
    
    System.out.println("Enter the second number: ");
    inData = stdin.readLine();
    n2 = Integer.parseInt (inData);
    
    System.out.println("Enter the third number: ");
    inData = stdin.readLine();
    n3 = Integer.parseInt (inData);
    
    System.out.println("Enter the fourth number: ");
    inData = stdin.readLine();
    n4 = Integer.parseInt (inData);
    
    System.out.println("Enter the fifth number: ");
    inData = stdin.readLine();
    n5 = Integer.parseInt (inData);
    
    System.out.println("Enter the sixth number: ");
    inData = stdin.readLine();
    n6 = Integer.parseInt (inData);
    
    System.out.println("Enter the seventh number: ");
    inData = stdin.readLine();
    n7 = Integer.parseInt (inData);
    
    System.out.println("Enter the eighth number: ");
    inData = stdin.readLine();
    n8 = Integer.parseInt (inData);
    
    System.out.println("Enter the ninth number: ");
    inData = stdin.readLine();
    n9 = Integer.parseInt (inData);
    
    System.out.println("Enter the tenth number: ");
    inData = stdin.readLine();
    n10 = Integer.parseInt (inData);
      
    System.out.print(sumOfNumbers(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10));
  }
  public static double sumOfNumbers(double n1, double n2, double n3, double n4, double n5,double n6,double n7,double n8,double n9,double n10)
  {
    return n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
  }
}
