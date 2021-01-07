package exercises.Gr11.src;

import java.io.*;

/** PythagoreanTriple application that displays all 
  * pythagorean triples with values of A and B 
  * less than 100. 
  * A pythagorean triple is a set of three integers
  * that make the equation a2 + b2 = c2 true.
  * 
  * @author Kalvin Kao
  * @version 1.0 Build April 16, 2012
  */

public class PythagoreanTriple
{
  public static void PerfectSquare()
  {
    int c, a, b;
    for (a=1; a<=100; a++)
    { for (b=a; b<=100; b++)
      {c=(a*a)+(b*b);
      if(isTriple(c)==true)
        System.out.println(a+" + "+b+" = "+Math.sqrt(c));
                           }
  }
}
  
  public static boolean isTriple(int c)
  {
    return (int)Math.sqrt(c)==Math.sqrt(c);
  }
  
}

