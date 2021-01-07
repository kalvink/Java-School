package exercises.Gr11.src;

import java.io.*;
public class HiLo{
  
  public static void main (String[] args)  throws IOException
  {
    InputStreamReader inStream = new InputStreamReader( System.in ) ;
    BufferedReader stdin = new BufferedReader( inStream );
    
    String data;
    int length;
    int guess=0;
    int bet;
    int prediction;
    int number;
    
    System.out.println("RULES");
    System.out.println("Numbers between 1 and 6 is considered low");
    System.out.println("Number between 8 and 13 is considered high");
    System.out.println("Number 7 is neither high or low\n");
    System.out.println("You have 1000 points\n");
    
 for(int point=1000;point>=1;guess++)
 {System.out.println("\nPlease enther the amount you wish to bet");
    data=stdin.readLine();
    bet=Integer.parseInt(data);
    while(bet>point)
    {System.out.println("\nPlease enter appropriate amount:");
    data=stdin.readLine();
    bet=Integer.parseInt(data);}
    
    System.out.println("Your Prediction? (0=low, 1=high)");
    data=stdin.readLine();
    prediction=Integer.parseInt(data);
    
    number=(int)Math.ceil(Math.random()*13);//random number
    
    if(checkPrediction(number,prediction)==true)
    {System.out.println("You have won!");
      System.out.println("The number was "+number+".");
      point=point+bet*2;
      System.out.println("You now have "+point+" points"); }
    else
    { System.out.println("You have lost!");
      System.out.println("The number was "+number+".");
      point=point-bet;
      System.out.println("You now have "+point+" points");}
  }
 System.out.println("\n\nYou have guessed "+guess+" before running out of points");
  System.out.println("GAME OVER!");}
  /**checkPrediction will check the number player has guessed and
    * will check if it matches the random number.
    * @param number A number randomly generated.
    * @param prediction a number player has guessed.
    * @param height height of the pyramid
    * @return volume of pyramid
    */
  public static boolean checkPrediction(int number, int prediction)
  { boolean checker=number<7&&prediction==0||number>7&&prediction==1;
  return checker;}
}