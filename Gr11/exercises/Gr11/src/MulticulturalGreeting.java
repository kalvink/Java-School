package exercises.Gr11.src;

/**
 * Displays a welcome message.
 */
public class MulticulturalGreeting {
  public static void main(String[] args) {
    System.out.print("Hello\t");
    System.out.print("Buenos Dias\n");
    System.out.print("Bonjour\t");
    System.out.println("\"How do you greet another?\"");
    System.out.format("%-10s %8s %8s", "Team", "Wins", "Losses\n");
    System.out.format("%-10s %8s %8s", "Jaguars", "10", "5\n");
    System.out.format("%-10s %8s %8s", "Cheetahs", "14", "1\n");
    System.out.format("%-10s %8s %8s", "Panthers", "8", "7\n");
    System.out.format("%-10s %8s %8s", "Penguins", "4", "11\n");
    System.out.format("The final game score: %-8s %8s", "10", "5\n");
    
  }
}