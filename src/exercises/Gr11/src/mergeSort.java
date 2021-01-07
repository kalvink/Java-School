package exercises.Gr11.src;

import java.io.*;

public class mergeSort{
  public static void main (String[] args) throws IOException
  {
    BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
    String inData;
    int a=0;
    
    System.out.println( "How many values:" );
    inData = stdin.readLine();
    a    = Integer.parseInt( inData );
    
    int array[] = new int[a];
    System.out.println( "Enter "+a+" integer(s):" );
    for (int b=0; b<a; b++){
      inData = stdin.readLine();
      array[b] = Integer.parseInt(inData);
    }
    
    int i;
    
    System.out.println("\nValues before the sort:");
    for(i = 0; i < array.length; i++)
      System.out.print( array[i]+"  ");
    System.out.println("\n");
    
    mergeSort_srt(array,0, array.length-1);
    System.out.println("Values after the sort:");
    for(i = 0; i <array.length; i++)
      System.out.print(array[i]+"  ");
    System.out.println();
  }
  
  public static void mergeSort_srt(int array[],int lo, int n){
    int low = lo;
    int high = n;
    if (low >= high) {
      return;
    }
    
    int middle = (low + high) / 2;
    mergeSort_srt(array, low, middle);
    mergeSort_srt(array, middle + 1, high);
    int end_low = middle;
    int start_high = middle + 1;
    while ((lo <= end_low) && (start_high <= high)) {
      if (array[low] < array[start_high]) {
        low++;
      } else {
        int Temp = array[start_high];
        for (int k = start_high- 1; k >= low; k--) {
          array[k+1] = array[k] ;
        }
        array[low] = Temp;
        low++;
        end_low++;
        start_high++;
      }
    }
  }  
} 