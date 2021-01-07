package exercises.Gr11.src;

/** Equivalent Fractions
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 7, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class EquivalentFractions
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int answer;
    int score=0;
    int difficulty;
    
    System.out.println("Select your difficulty.");
    System.out.print("Type 1 for beginner. \nType 2 for advanced.\n");
    inData = stdin.readLine();
    difficulty = Integer.parseInt (inData);
    if (difficulty == 2){
      System.out.println("\nAdvanced Equivalent Fractions Quiz\n");
      System.out.println("1. 21/3");
      System.out.println("2. 2/3");
      System.out.println("3. 4/3");
      System.out.println("4. 28/4");
      System.out.println("5. 8/12");
      System.out.println("6. 1 1/3");
      System.out.println("7. 5/1"); 
      System.out.println("8. 125/25\n");
      
      System.out.println("Which fraction number is equivalent to fraction #1?");
      inData = stdin.readLine();
      answer = Integer.parseInt (inData);
      if (answer == 4){
        System.out.println("Correct!\n");
        score = score + 1;
      }
      else
        System.out.println("Wrong!\n");
      
      System.out.println("Which fraction number is equivalent to fraction #2?");
      inData = stdin.readLine();
      answer = Integer.parseInt (inData);
      if (answer == 5){
        System.out.println("Correct!\n");
        score = score + 1;
      }
      else
        System.out.println("Wrong!\n");
      
      System.out.println("Which fraction number is equivalent to fraction #3?");
      inData = stdin.readLine();
      answer = Integer.parseInt (inData);
      if (answer == 6){
        System.out.println("Correct!\n");
        score = score + 1;
      }
      else
        System.out.println("Wrong!\n");
      
      System.out.println("Which fraction number is equivalent to fraction #7?");
      inData = stdin.readLine();
      answer = Integer.parseInt (inData);
      if (answer == 8){
        System.out.println("Correct!\n");
        score = score + 1;
      }
      else
        System.out.println("Wrong!\n");
    }
    
    else {
      System.out.println("\nBeginner Equivalent Fractions Quiz\n");
      System.out.println("1. 1/2");
      System.out.println("2. 8/6"); 
      System.out.println("3. 4/3"); 
      System.out.println("4. 6/4");  
      System.out.println("5. 10/2"); 
      System.out.println("6. 5/1");  
      System.out.println("7. 2/4"); 
      System.out.println("8. 3/2\n");
      
      System.out.println("Which fraction number is equivalent to fraction #1?");
      inData = stdin.readLine();
      answer = Integer.parseInt (inData);
      if (answer == 7){
        System.out.println("Correct!\n");
        score = score + 1;
      }
      else
        System.out.println("Wrong!\n");
      
      System.out.println("Which fraction number is equivalent to fraction #2?");
      inData = stdin.readLine();
      answer = Integer.parseInt (inData);
      if (answer == 3){
        System.out.println("Correct!\n");
        score = score + 1;
      }
      else
        System.out.println("Wrong!\n");
      
      System.out.println("Which fraction number is equivalent to fraction #4?");
      inData = stdin.readLine();
      answer = Integer.parseInt (inData);
      if (answer == 8){
        System.out.println("Correct!\n");
        score = score + 1;
      }
      else
        System.out.println("Wrong!\n");
      
      System.out.println("Which fraction number is equivalent to fraction #5?");
      inData = stdin.readLine();
      answer = Integer.parseInt (inData);
      if (answer == 6){
        System.out.println("Correct!\n");
        score = score + 1;
      }
      else
        System.out.println("Wrong!\n");
    }
    
    System.out.println("Your score is: " + score + " out of 4.");
    
  }
}