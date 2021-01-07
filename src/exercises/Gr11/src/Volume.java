package exercises.Gr11.src;

/** Volume - Takes the input which is the length, width and height of a cube and gives out the volume of the cube.
  * 
  * @author Kalvin Kao
  * @version 0.1 Build April 10, 2012
  */

public class Volume{
  
  /** volumeOfCube take in three values (the length, width and height), 
    * and return the volume of that cube.
    * 
    * @param length    Length of the cube
    * @param width     Width of cube
    * @param height    Height of cube
    * @return          Volume of cube
    */
  public static double volumeOfCube(double length, double width, double height)
  {
    return length*width*height;
  }
}
