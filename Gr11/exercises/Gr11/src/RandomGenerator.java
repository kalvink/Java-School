package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Random Generator
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Mar 23, 2012.
  */



class RandomGenerator
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    int seed;
    int a=1246;
    int c=200;
    int m=50;
    int total;
    int random;
    
    seed=(int)(Math.random()* 13 + 1);
    total=((a*seed)+c)%m;
    random=(int)(Math.random()* 6+1);
    
    System.out.println("Seed = "+seed+", a = "+a+", c = "+c+", m = "+m);
    System.out.println("\n<"+a+"*"+seed+" + "+c+"> % "+m+"="+total);
    if (random==1)
    {
      seed=seed+10;
      random=(int)(Math.random()* 6+1);
    }
    System.out.println("\n<"+a+"*"+seed+" + "+c+"> % "+m+"="+total);
    
    if (random==2)
    {
      seed=seed-10;
      random=(int)(Math.random()* 6+1);
    }
    System.out.println("\n<"+a+"*"+seed+" + "+c+"> % "+m+"="+total);
    
    if (random==3)
    {
      seed=seed+20;
      random=(int)(Math.random()* 6+1);
    }
    System.out.println("\n<"+a+"*"+seed+" + "+c+"> % "+m+"="+total);
    
    if (random==4)
    {
      seed=seed+40;
      random=(int)(Math.random()* 6+1);
    }
    System.out.println("\n<"+a+"*"+seed+" + "+c+"> % "+m+"="+total);
    
    if (random==5)
    {
      seed=seed-20;
      random=(int)(Math.random()* 6+1);
    }
    System.out.println("\n<"+a+"*"+seed+" + "+c+"> % "+m+"="+total);
    
    if (random==6)
    {
      seed=seed+30;
      random=(int)(Math.random()* 6+1);
    }
    System.out.println("\n<"+a+"*"+seed+" + "+c+"> % "+m+"="+total);
    
  }
}