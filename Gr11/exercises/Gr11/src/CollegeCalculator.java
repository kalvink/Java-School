package exercises.Gr11.src;

/** College Calculator
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Feb 27, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class CollegeCalculator
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double rent;
    double tuition;
    double books;
    double scholarships;
    double total;
    
    System.out.println("Enter the cost of the rent:");
    inData = stdin.readLine();
    rent = Double.parseDouble (inData);
    
    System.out.println("Enter the cost of the tutition:");
    inData = stdin.readLine();
    tuition = Double.parseDouble (inData);
    
    System.out.println("Enter the cost of the books:");
    inData = stdin.readLine();
    books = Double.parseDouble (inData);
    
    System.out.println("Enter the cost of the scholarships:");
    inData = stdin.readLine();
    scholarships = Double.parseDouble (inData);
    
    total = rent + tuition + books - scholarships;
    
    System.out.println("The total costs of your school year is $" + total);
    
  }
}