package exercises.Gr11.src;

import java.io.*;

public class CourseGrades{
  public static void main (String[] args)throws IOException 
  {
    int testgrades[] = new int[60];
    testgrades=getGrades(testgrades);
  }
  public static int[] getGrades(int testgrades[]) throws IOException
  {
    BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));
    String inData;
    int n = 0;
    
    for (int i=1; i<=2; i++)
    {
      for (int x=1; x<=5; x++)
   
      {
        System.out.println( "Enter test grade "+x+" for student #"+i);
        inData = stdin.readLine();
        testgrades[n] = Integer.parseInt(inData);
        n++;
      }
    }
    return testgrades;
  }
  
}