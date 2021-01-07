package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Char Remover
  * 
  * 
  * @author Kalvin Kao
  * @version 1.0 Build 9000 April 4, 2012.
  */



public class CharRemover
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String string, ns, m="0";
    string="I’m a JaVa PrOgRaMmEr";
    string.replaceFirst(m," ");
    System.out.println(string);
    
  }
}