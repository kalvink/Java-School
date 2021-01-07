package exercises.Gr11.src;

/** Displays Flowchart Symbols
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Feb 16, 2012.
  */

//Displays the class and output of flowchart symbols.
public class FlowchartSymbols {
  public static void main(String[] args) {
    
    System.out.println("        Flowchart Symbols\n");
    System.out.println("        Start or End Symbol:");
    System.out.format("%20s", "*********\n");
    System.out.format("%10s %10s", "*", "*\n");
    System.out.format("%9s %12s", "*", "*\n");
    System.out.format("%10s %10s", "*", "*\n");
    System.out.format("%20s", "*********\n");
    System.out.println("        Input/Output Symbol:");
    System.out.format("%20s", "*********\n");
    System.out.format("%10s %8s", "*", "*\n");
    System.out.format("%9s %8s", "*", "*\n");
    System.out.format("%17s", "*********\n");
  }
}