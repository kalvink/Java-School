package exercises.Gr11.src;

import java.io.*;

public class Life{
  public static void main (String[] args) throws IOException
  {
    BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
    String inData;
    int l_cells=0;
    
    System.out.println( "How many live cells?" );
    inData = stdin.readLine();
    l_cells   = Integer.parseInt( inData );
    
    int array[] = new int[l_cells];
    System.out.println( "Enter the coordinates for the "+l_cells+" cells." );
    for (int b=0; b<l_cells; b++){
      inData = stdin.readLine();
      array[b] = Integer.parseInt(inData);
    }
    String ac = "X";
    String dc = "O";
    int day = 0;
    int neighbor = 0;
    int acc = 0;
    int dcc = 0;
    
    int b =20;
    int n=20;
    
    if (acc == acc || day == day-1) {
      if (neighbor == 2 || neighbor ==3) {
        acc=acc;
      } else {
        acc-=1;
      }
    } else if ( dcc == dcc|| day == day -1) {
      if (neighbor == 3) {
        acc++;
      } else {
        acc--;
      }
    }
    System.out.println();
    String A[] = new String[n];
    for (int i=0; i<n; i=i+1){
      A[i]    = "0000000000000000000";
    }
    for (int g=0; g<n; g++){
      System.out.println(A[g]+" ");
    }
    
  }
}