package exercises.Gr11.src;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/** Metric Conversion - This class contains methods that convert to Metric Units
  * 
  * @author Kalvin Kao
  * @version 0.1 Build April 11, 2012
  */

public class MetricConversion{
  
  
  public static void main (String[] args) throws IOException
  {
    InputStreamReader inStream = 
      new InputStreamReader( System.in ) ;
    BufferedReader stdin = 
      new BufferedReader( inStream );
    
    String inData;
    double n, cm;
    
    System.out.println("Enter a number: ");
    inData = stdin.readLine();
    n = Integer.parseInt (inData);
    
    System.out.println("\nConvert: ");
    System.out.println("1. Inches to Centimeters          5. Centimeters to Inches");
    System.out.println("2. Feet to Centimeters            6. Centimeters to Feet");
    System.out.println("3. Yards to Meters                7. Meters to Yards");
    System.out.println("4. Miles to Kilometers            8. Kilometers to Miles");
    
    System.out.println("\nEnter your choice: ");
    inData = stdin.readLine();
    
    if (inData.compareTo("1")==0){
      System.out.println(n+" inches equals "+inchesToCM(n)+" centimeters.");
    }
    else if(inData.compareTo("2")==0){
      System.out.println(n+" feet equals "+feetToCM(n)+" centimeters.");
    }
    else if(inData.compareTo("3")==0){
      System.out.println(n+" yards equals "+yardsToM(n)+" meters.");
    }
    else if(inData.compareTo("4")==0){
      System.out.println(n+" miles equals "+milesToKM(n)+" kilometers.");
    }
    else if(inData.compareTo("5")==0){
      System.out.println(n+" centimeters equals "+cmToINCHES(n)+" inches.");
    }
    else if(inData.compareTo("6")==0){
      System.out.println(n+" centimeters equals "+cmToFT(n)+" feet.");
    }
    else if(inData.compareTo("7")==0){
      System.out.println(n+" meters equals "+metersToYRDS(n)+" yards.");
    }
    else if(inData.compareTo("8")==0){
      System.out.println(n+" kilometers equals "+kmToMILES(n)+" miles.");
    }
    
    
    /** Given a length in inches, returns its equivalence in cm  
      * 
      * @param inches Length in inches
      * @return lenth Equlivalence in cm
      */
  }
  public static double inchesToCM(double inches)
  {
    return inches*2.54;
  }
  
  /** Given a length in feet, returns its equivalence in cm 
    * 
    * @param feet Length in feet
    * @return lenth Equlivalence in cm
    */
  
  public static double feetToCM(double feet)
  {
    return feet*30;
  }
  /** Given a length in feet, returns its equivalence in cm 
    * 
    * @param feet Length in feet
    * @return length equivalence in cm
    */
  public static double yardsToM(double yards)
  {
    return yards*0.91;
  }
  
  /** Given a length in miles, returns its equivalence in km 
    * 
    * @param miles Length in feet
    * @return Length equlivalence in km
    */
  public static double milesToKM(double miles)
  {
    return miles*1.6;
  }
  
    /** Given a length in miles, returns its equivalence in km 
    * 
    * @param miles Length in feet
    * @return Length equivalence in km
    */
  public static double cmToINCHES(double cm)
  {
    return cm/2.54;
  }
    /** Given a length in cm, returns its equivalence in inches 
    * 
    * @param cm length in inches
    * @return Length equivalence in km
    */
  public static double cmToFT(double cm)
  {
    return cm/30;
  }
    /** Given a length in miles, returns its equivalence in km 
    * 
    * @param miles Length in feet
    * @return Length equlivalence in km
    */
  public static double metersToYRDS(double meters)
  {
    return meters/0.91;
  }
    /** Given a length in miles, returns its equivalence in km 
    * 
    * @param miles Length in feet
    * @return Length equlivalence in km
    */
  public static double kmToMILES(double km)
  {
    return km/1.6;
  }
}

