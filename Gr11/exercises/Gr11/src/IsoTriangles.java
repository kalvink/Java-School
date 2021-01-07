package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Iso Triangles - IsoTriangle application that prompts the user for the size of an isosceles triangle and then
  displays the triangle with that many lines.
  * 
  * @author Kalvin Kao
  * @version 1.00 April 13, 2012
  */

public class IsoTriangles{
  public static void main(String[] args) throws IOException{
    BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
    int g=0;
    int size;
    System.out.println("Enter the size: ");
    size = Integer.parseInt(stdin.readLine());
    drawTriangle(size);
      
  }
  /** Outputs an isosceles triangle of the given size.
    * 
    * @param size  Size of the isoceles triangle.
    * @return triangle Isoceles triangle made up of a given size.
    */
  
  public static void drawTriangle(int size) {
    int lastRow = 1 + 2*(size-1);

    for (int row = 1; row <= size; row ++) {
      for (int x = (lastRow - (1 + 2*(row - 1)) )/2; x != 0; x = x-1) { System.out.print(" ");}
      for (int i = 0; i != 1 + 2*(row - 1); i++) {System.out.print("*");}
      //int x = (lastRow - (1 + 2*(row - 1)) )/2;
      for (int x = (lastRow - (1 + 2*(row - 1)) )/2; x != 0; x = x-1) { System.out.print(" ");}
      System.out.print("\n");
    }
  }
}