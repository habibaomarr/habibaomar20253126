

package habibasheet5;
   import java.util.Scanner;
public class HABIBASHEET5Q1 {

    public static int generateSecret() {
        return (int) (Math.random() * 50) + 1;
    }

    public static String checkGuess(int guess, int secret) {
        if (guess == secret) {
            return "Correct";
        } else if (guess < secret) {
            return "Higher";
        } else {
            return "Lower";
        }
    }

    public static void main(String[] args) {
        int secret = generateSecret();
        int[] guesses = new int[5]; 
        Scanner scanner = new Scanner(System.in);
        boolean guessedCorrectly = false;
        int attemptsUsed = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Guess: ");
            int guess = scanner.nextInt();
            
            guesses[i] = guess;
            attemptsUsed = i + 1;

            String result = checkGuess(guess, secret);

            if (result.equals("Correct")) {
                System.out.println("Correct in " + attemptsUsed + " attempts");
                guessedCorrectly = true;
                break;
            } else {
                System.out.println(result);
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Out of attempts! The secret number was: " + secret);
        }

        scanner.close();
    }
}
