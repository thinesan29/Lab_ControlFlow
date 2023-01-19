import java.util.Scanner;
public class guessingGame {
    public static void main(String[] args) {
        System.out.println("Hello ! Guess the secret number in my game. Good Luck !");
        int secretNumber = 7;
        Scanner sc = new Scanner(System.in);

        int userGuess = sc.nextInt();

        if (secretNumber == userGuess) {
            System.out.println("Perfecto! You guessed correctly !");
        }
        else if (secretNumber < userGuess) {
            System.out.println( "Incorrect! Guess is too HIGH !");
        } else {
            System.out.println( "Incorrect! Guess is too LOW !");
        }


    }
}