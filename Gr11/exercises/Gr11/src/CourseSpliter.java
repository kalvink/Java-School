package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Course Spliter
  * User inputs a course code and the output is the Course Name, Grade, Type and Course Description.
  * 
  * @author Kalvin Kao
  * @version 1.0 Build 9000 April 3, 2012.
  */



public class CourseSpliter
{
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData, cname, grade, g, type, desc, t;
    
    System.out.println("Please enter a course code: ");
    System.out.println("The course code must be in this format 'ICS3U1 : Computer Science'");
    inData = stdin.readLine();
    
    g="0";
    t="0";
    
    type = inData.substring(4,5);
    desc = inData.substring(9);
    cname = inData.substring(0,3);
    grade = inData.substring(3,4);
    
    if(grade.equals("1"))
      g="9";
    else if (grade.equals("2"))
      g="10";
    else if (grade.equals("3"))
      g="11";
    else if (grade.equals("4"))
      g="12";
    
    if(type.equals("U"))
      t="University";
    else if (type.equals("C"))
      t="College";
    else if (type.equals("O"))
      t="Open";
    else if (type.equals("M"))
      t="Mixed";
    else if (type.equals("L"))
      t="ESL";
    else if (type.equals("D"))
      t="Academic";
    else if (type.equals("P"))
      t="Applied";
    else if (type.equals("E"))
      t="Workplace";
    
    System.out.println("Course Name: "+cname+"\nGrade: "+g+"\nType: "+t+"\nCourse Description: "+desc);
    
  }
}