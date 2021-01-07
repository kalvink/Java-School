package exercises.Gr11.src;

import java.io.*;
/** Coins
  * 
  * @author Kalvin Kao
  * @version 0.1 Build April 13, 2012
  */

public class AddCoins{
  public static void main(String[] args) throws IOException{
    BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
    String inputData;
    int quarters , dimes, nickels, pennies;
    System.out.println("Enter your total coins: ");
    
    System.out.println("Quarters: "); 
    inputData = stdin.readLine();
    quarters    = Integer.parseInt( inputData );
    
    System.out.println("Dimes: "); 
    inputData = stdin.readLine();
    dimes    = Integer.parseInt( inputData );
    
    System.out.println("Nickels: "); 
    inputData = stdin.readLine();
    nickels   = Integer.parseInt( inputData );
    
    System.out.println("Pennies: "); 
    inputData = stdin.readLine();
    pennies    = Integer.parseInt( inputData );
    
    System.out.println("Total: $"+getDollarAmount(pennies, nickels, dimes, quarters));
  }
  /** Prompts the user for the number of pennies, nickels, dimes,
    * and quarters
    * 
    * @param pennies amount of pennies
    * @param nickels amount of nickels
    * @param  dimes amount of dimes
    * @param quarters amount of quarters
    * @return dollar 
    */
  
  public static double getDollarAmount(int pennies, int nickels, int dimes, int quarters){
    return quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies*0.01; 
  }
  
}
