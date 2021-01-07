package exercises.Gr11.src;

/** Spending
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 2, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Spending
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double food;
    double cloth;
    double enter;
    double rent;
    double total;
    double pfood;
    double pcloth;
    double penter;
    double prent;
    
    System.out.println("Enter the amount spent last month on the following items:");
    System.out.println("Food: ");
    inData = stdin.readLine();
    food = Integer.parseInt (inData);
    
    System.out.println("Clothing: ");
    inData = stdin.readLine();
    cloth = Integer.parseInt (inData);
    
    System.out.println("Entertainment: ");
    inData = stdin.readLine();
    enter = Integer.parseInt (inData);
    
    System.out.println("Rent: ");
    inData = stdin.readLine();
    rent = Integer.parseInt (inData);
    
    total = food + cloth + enter + rent;
    pfood = (food/total)*100;
    pcloth = (cloth/total)*100;
    penter = (enter/total)*100;
    prent = (rent/total)*100;
    
    System.out.println("Category\t\t % Budget");
    System.out.print("Food\t\t " + pfood);
    System.out.println(" %");
    System.out.print("Clothing\t\t " + pcloth);
    System.out.println(" %");
    System.out.print("Entertainment\t " + penter);
    System.out.println(" %");
    System.out.print("Rent\t\t " + prent);
    System.out.println(" %");
    
    
  }
}