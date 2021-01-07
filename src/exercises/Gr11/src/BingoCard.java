package exercises.Gr11.src;

/** Displays the traditional BINGO card which consists of five columns and five unique numbers.
  *
  * @author Kalvin Kao
  * 
  * @version 1.0 Build 9000 Feb 15, 2012.
  */

//Displays the class and output of a BINGO card.
public class BingoCard {
  public static void main(String[] args) {
    System.out.format("%10s %10s %10s %10s %10s", "B", "I", "N", "G", "O\n"); 
    System.out.format("%10s %10s %10s %10s %10s", "2", "20", "42", "60", "64\n");
    System.out.format("%10s %10s %10s %10s %10s", "14", "25", "32", "55", "70\n");
    System.out.format("%10s %10s %10s %10s %10s", "5", "18", "FREE", "53", "67\n");
    System.out.format("%10s %10s %10s %10s %10s", "12", "16", "31", "46", "75\n");
    System.out.format("%10s %10s %10s %10s %10s", "10", "22", "39", "59", "71\n");
  }
}