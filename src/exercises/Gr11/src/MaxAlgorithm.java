package exercises.Gr11.src;

 class MaxAlgorithm
{
  
  public static void main ( String[] args ) 
  {
    
    int[] array =  { -20, 19, 1, 5, -1, 27, 19, 500 } ;
    int   max;
    
    // initialize the current maximum
    max = array[0]; //-20
    // scan the array
    for ( int index=0; index < array.length; index++ ) // (index is 0 < 8 + index+1)
    {
      if ( array[ index ] > max )  // examine the current element index if -20 > -20
        max = array[ index ];        // if it is the largest so far, change max -20 = -
    }
    System.out.println("The maximum of this array is: " + max );
  }
}