package exercises.Gr11.src;

/** Math Tutor
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 7, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class MathTutor
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int num1 = (int) (Math.random()*10+1);
    int num2 = (int) (Math.random()*10+1);
    int op = (int) (Math.random()*4+1);
    int sum = num1 + num2;
    int diff = num1 - num2;
    int multiply = num1*num2;
    int divide = num1/num2;
    int answer;
    
    if (op == 1)
    { 
      System.out.println("What is " + num1 + " + " + num2 + " ? ");
      inData = stdin.readLine();
      answer = Integer.parseInt (inData);
      if (sum == answer)
        System.out.println("Correct!");
      else
        System.out.println("Wrong!");
    }
    else if (op == 2)
    {
      System.out.println("What is " + num1 + " - " + num2 + " ? ");
    inData = stdin.readLine();
    answer = Integer.parseInt (inData);
    if (diff == answer)
      System.out.println("Correct!");
    else
      System.out.println("Wrong!");
    }
        else if (op == 3)
    {
      System.out.println("What is " + num1 + " * " + num2 + " ? ");
    inData = stdin.readLine();
    answer = Integer.parseInt (inData);
    if (multiply == answer)
      System.out.println("Correct!");
    else
      System.out.println("Wrong!");
    }
            else if (op == 4)
    {
      System.out.println("What is " + num1 + " / " + num2 + " ? ");
    inData = stdin.readLine();
    answer = Integer.parseInt (inData);
    if (divide == answer)
      System.out.println("Correct!");
    else
      System.out.println("Wrong!");
    }
        
  }
}