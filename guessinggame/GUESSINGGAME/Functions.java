package GUESSINGGAME;
import java.util.Random;
import java.util.Scanner;
public class Functions {
  public static int maxAttempts = 10;
  private static final Random thenumber=new Random();
  public static void welcomePage() {
      System.out.println("                                                    ");
      System.out.println("           Welcome to the number game!           ");
      System.out.println("----------------------------------------------------");
      System.out.println("       The range of numbers you have to guess is from 1 to 100");
      System.out.println("                   You have " + maxAttempts + " attempts ");
      System.out.println("                 Good luck, and have fun!\n");
  }
public static int generatenumber(int min,int max){
  return thenumber.nextInt(max - min + 1) + min;
}
 public static int getUserGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }
   
    public static String provideFeedback(int guess, int number) {
      if (guess < number) {
          return "Too low!";
      } else if (guess > number) {
          return "Too high!";
      } else {
          return "Correct!";
      }
  }
  public static boolean playAgain() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Do you want to play again? (yes/no): ");
    return scanner.next().equalsIgnoreCase("yes");
}

}
