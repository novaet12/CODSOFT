package GUESSINGGAME;
import java.util.Scanner;
public class numbergame{ 
    public static void main(String[] args) {
       Functions function=new Functions();
       Scorerecord scorerecord=new Scorerecord();
       function.welcomePage();
       while (true) {
        scorerecord.restartScore();
        int randomNumber = Functions.generatenumber(1, 100);
        int maxAttempts = 10;
        boolean hasGuessedCorrectly = false;
        for (int i = 0; i < maxAttempts; i++) {
            scorerecord.increasedattempts();
            int guess = Functions.getUserGuess();
            String feedback = Functions.provideFeedback(guess, randomNumber);
            System.out.println(feedback);

            if (feedback.equals("Correct!")) {
                hasGuessedCorrectly = true;
                break;
            }
        }
        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You've guessed the number in " + scorerecord.getScore() + " attempts.");
        } else {
            System.out.println("Sorry! You've used all attempts. The number was " + randomNumber + ".");
        }

        Functions.playAgain();
        System.out.println("Thank you for playing!");
    }

    
    }
   
}
