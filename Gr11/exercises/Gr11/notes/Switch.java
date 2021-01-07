package exercises.Gr11.notes;

import java.io.*;

public class Switch{
  public static void main(String args[]) throws Exception{
  int ch;
  System.out.println("Enter 1 for Sunday.");
  System.out.println("Enter 2 for Monday.");
  System.out.println("Enter 3 for Tuesday.");
  System.out.println("Enter 4 for Wednesday.");
  System.out.println("Enter 5 for Thrusday.");
  System.out.println("Enter 6 for Friday.");
  System.out.println("Enter 7 for Saturday.");
  System.out.print("your choice is : ");
  BufferedReader in = 
new BufferedReader(new InputStreamReader(System.in));
  try{
  ch=Integer.parseInt(in.readLine());
  switch(ch){    
  case 1:  System.out.println("Sunday");
  break;
  case 2:  System.out.println("Monday");
  break;
  case 3:  System.out.println("Tuesday");
  break;
  case 4:  System.out.println("Wednesday");
  break;
  case 5:  System.out.println("Thursday");
  break;
  case 6:  System.out.println("Friday");
  break;
  case 7:  System.out.println("Saturday");
  break;
  default: System.out.println("Invalid entry!");
   break;
  }
  }
  catch(NumberFormatException ex){
  System.out.println(ex.getMessage() + " is not a numeric value.");
  System.exit(0);
  }
  }
}