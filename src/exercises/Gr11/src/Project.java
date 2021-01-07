package exercises.Gr11.src;

/** Project
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 2, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Project
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double design;
    double code;
    double debug;
    double test;
    double total;
    double pdesign;
    double pcode;
    double pdebug;
    double ptest;
    
    System.out.println("Enter the number of minutes spent on each of the following project tasks:");
    System.out.println("Designing: ");
    inData = stdin.readLine();
    design = Integer.parseInt (inData);
    
    System.out.println("Coding: ");
    inData = stdin.readLine();
    code = Integer.parseInt (inData);
    
    System.out.println("Debugging: ");
    inData = stdin.readLine();
    debug = Integer.parseInt (inData);
    
    System.out.println("Testing: ");
    inData = stdin.readLine();
    test = Integer.parseInt (inData);
    
    total = design + code + debug + test;
    pdesign = (design/total)*100;
    pcode = (code/total)*100;
    pdebug = (debug/total)*100;
    ptest = (test/total)*100;
    
    System.out.println("Task\t % Time");
    System.out.print("Designing\t " + pdesign);
    System.out.println(" %");
    System.out.print("Coding\t " + pcode);
    System.out.println(" %");
    System.out.print("Debugging\t " + pdebug);
    System.out.println(" %");
    System.out.print("Testing\t " + ptest);
    System.out.println(" %");
    
    
  }
}