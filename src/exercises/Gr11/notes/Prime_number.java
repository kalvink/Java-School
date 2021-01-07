package exercises.Gr11.notes;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Prime_number {
  public static void main(String[] args) throws IOException {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    int number;
    String inData;
    
    System.out.println("Please enter a number:");
    inData = stdin.readLine();
    number = Integer.parseInt (inData);
    
    int num = number;
    int i;
    for (i=2; i < num ;i++ ){
      int n = num%i;
      if (n==0){
        System.out.println("not Prime!");
        break;
      }
    }
    if(i == num){
      System.out.println("Prime number!");
    }
  }
}