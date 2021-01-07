package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** My Methods - This is a class with multiple methods.
  * 
  * @author Kalvin Kao
  * @version 0.1 Build April 11, 2012
  */

public class MyMethod{
  
  //Displays roof of the house
  public static void addRoof()
  {
    System.out.println("        /\\        ");
    System.out.println("       /  \\       ");
    System.out.println("      /    \\      ");
    System.out.println("     /______\\     ");   
  }
  //Displays base of the house
  public static void addBase()
  {
    System.out.println("    |        |       ");
    System.out.println("    |        |       ");
    System.out.println("    |        |       ");
    System.out.println("    |________|       ");
  }
  //Displays walk of the house
  public static void addWalk()
  {
    System.out.println("        **       ");
    System.out.println("        ***********      ");
  }
  //Displays all of the parts of the house together
  public static void addHouse(){
    MyMethod.addRoof();
    MyMethod.addBase();
    MyMethod.addWalk();
    
  }
}