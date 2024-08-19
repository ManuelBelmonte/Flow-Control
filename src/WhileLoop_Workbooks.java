import java.util.Scanner;

public class WhileLoop_Workbooks {
    public static void main(String[] args) {
        //Workbook 5.8 keeps looping until the user guesses right.
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose a number between 1 and 5. Try to guess it: ");
        int guess = scan.nextInt();

        while (guess != 4) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }
        System.out.println("you get it!!!");


        //Workbook 5.9 prompts the user to try signing in.

    }

}
