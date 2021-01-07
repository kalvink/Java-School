package exercises.Gr11.src;

import java.io.* ;

class InputArray
{
  
  public static void main ( String[] args ) throws IOException
  {
    
    int[] array = new int[5];
    int   data;
    
    BufferedReader inData = 
      new BufferedReader ( new InputStreamReader( System.in ) );
    
    // input the data
    for ( int index=0 ; index<array.length; index++ )
    {
      System.out.println( "enter an integer: " );
      array[ index ]           = Integer.parseInt( inData.readLine() );
      
    }
    
    // write out the data
    for ( int index=0 ; index<array.length; index++  )
    {
      System.out.println( "array[ " + index + " ] = " + array[ index ] );
    }
    
  }
} 