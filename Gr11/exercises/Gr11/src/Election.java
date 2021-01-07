package exercises.Gr11.src;

/** Election
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 4, 2012.
  */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Election
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData; // 1 = awbrey, 2 = martinez
    int ny1;
    int ny2;
    int nj1;
    int nj2;
    int ct1;
    int ct2;
    double total1;
    double total2;
    double total3;
    double percent1;
    double percent2;
    
    System.out.println("Enter the election results:");
    System.out.println("New York - Awbrey");
    inData = stdin.readLine();
    ny1 = Integer.parseInt (inData);
    
    System.out.println("New York - Martinez");
    inData = stdin.readLine();
    ny2 = Integer.parseInt (inData);
    
    System.out.println("New Jersey - Awbrey");
    inData = stdin.readLine();
    nj1 = Integer.parseInt (inData);
    
    System.out.println("New Jersey - Martinez");
    inData = stdin.readLine();
    nj2 = Integer.parseInt (inData);
    
    System.out.println("Connecticut - Awbrey");
    inData = stdin.readLine();
    ct1 = Integer.parseInt (inData);
    
    System.out.println("Connecticut - Martinez");
    inData = stdin.readLine();
    ct2 = Integer.parseInt (inData);
    
    total1 = ny1 + nj1 + ct1;
    total2 = ny2 + nj2 + ct2;
    total3 = total1 + total2;
    percent1 = (total1/total3)* 100;
    percent2 = (total2/total3)* 100;
    
    System.out.println("\nElection Results for New York:");
    System.out.println("Awbrey: " + ny1);
    System.out.println("Martinez: " + ny2);
    System.out.println("\nElection Results for New Jersey:");
    System.out.println("Awbrey: " + nj1);
    System.out.println("Martinez: " + nj2);
    System.out.println("\nElection Results for Connecticut:");
    System.out.println("Awbrey: " + ct1);
    System.out.println("Martinez: " + ct2);
    System.out.println("\nCandidate\t Votes Percentage:");
    System.out.print("Awbrey:\t" + total1);
    System.out.print("\t"+ percent1);
    System.out.println(" %");
    System.out.print("Martinez:\t" + total2);
    System.out.print("\t" + percent2);
    System.out.println(" %");
    System.out.println("\nTOTAL VOTES: " + total3);
    
    
  }
}