package array2D;


/*
 * Task 6. 
 * Generates 2D array with zeroes and seven ones and displays the array in the console.
 * @author Kalvin Kao
 * ICS4U
 * September 10th 2012
 */

public class Task6 {
 public static void main(String[] args) {
  int[][] numArray = new int[6][6];
  int check = 0;

  do {
   check = 0;
   for (int i = 0; i < 6; i++) {
    for (int k = 0; k < 6; k++) {
     numArray[i][k] = (int) (Math.random() * ((1 - 0 + 1) + 0));
    }
   }
   // the numbers in array range from 0-1
   {
    for (int i = 0; i < 6; i++) {
     for (int k = 0; k < 6; k++) {
      if (numArray[i][k] == 1)
       check++;
     }
    }
   }

  } while (check != 7);

  for (int i = 0; i < 6; i++) {
   for (int k = 0; k < 6; k++) {
    System.out.print(numArray[i][k] + " ");
   }
   System.out.println(" ");
  }

 }
}