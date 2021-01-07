package exercises.Gr11.src;

class CountArrayReverse
{
  
  public static void main ( String[] args )
  {
    int egArray [] = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };
      for ( int index= egArray.length-1; index>=0 ; index-- ) // int index = 9 works too
    {
      System.out.println(egArray [index]);
    }
  }
}

