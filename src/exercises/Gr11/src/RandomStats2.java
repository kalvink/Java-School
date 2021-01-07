package exercises.Gr11.src;

import java.io.*;
import java.util.Random;
/** Random Stats - generates 500 random numbers between 0 and 9 and then displays 
  * the number of occurrences of each number.
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 May 4, 2012.
  */

class RandomStats2
{
  
  /** Generates 500 random numbers between 0 and 9 and then displays 
    * the number of occurrences of each number.
    * 
    * @return        500 random numbers between 0 and 9 with the displayed number of occurences for each number.
    */
  
  public static void random()
  {
    int randomN;
    int maxvalue=500;
    int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
    System.out.println("Numbers\tOccurrences");
    
    Random random = new Random();
    
    for(int count = 0; count <= maxvalue; count++)
      
    {
      randomN = random.nextInt(9);
    }
    
    System.out.println("0\t"+zero);
    System.out.println("1\t"+one);
    System.out.println("2\t"+two);
    System.out.println("3\t"+three);
    System.out.println("4\t"+four);
    System.out.println("5\t"+five);
    System.out.println("6\t"+six);
    System.out.println("7\t"+seven);
    System.out.println("8\t"+eight);
    System.out.println("9\t"+nine);
  }
  
}