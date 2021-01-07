package exercises.Gr11.src;

import java.io.* ;

class InputArray2
{

  public static void main ( String[] args ) throws IOException
  {
    BufferedReader inData = 
        new BufferedReader ( new InputStreamReader( System.in ) );
    int[] array;
 
    // determine the array size and construct the array
    System.out.println( "What length is the array?" );
    int size  = Integer.parseInt( inData.readLine() );

    array     = new int[ size ]; 

    // input the data
    for ( int index=0; index < array.length; index++)
    {
      System.out.println( "enter an integer: " );
      array[ index ] = Integer.parseInt( inData.readLine() );
    }
      
    // write out the data
    for ( int index=0; index < array.length; index++ )
    {
      System.out.println( "array[ " + index + " ] = " + array[ index ] );
    }

  }
}