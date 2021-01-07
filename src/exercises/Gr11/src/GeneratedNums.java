package exercises.Gr11.src;

import java.io.*;

/** Generated Nums - generates the number to store in an array element by summing 
  * its index and the individual digits of the index. For example, the element with 
  * index 17 should store 25 (17 + 1 + 7 = 25) and the element with index 2 should 
  * store 4 (2 + 0 + 2 = 4).
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 May 2, 2012.
  */

class GeneratedNums
{
  
  /** This method will generate a number to store in an array
    * by summing its index and the individual digits of the index.
    * 
    * @return        Generated number
    */
  
  public static void generatedNums()
  {
    System.out.println("Index\tGenerated Nums");
    int index;
    int A[] = new int [102];
    for (index = 0; index<=101; index++)
    {
      A[index] =((index/10)+(index%10))+(index);
      System.out.println(index+"\t"+A[index]);
    }
  }
}