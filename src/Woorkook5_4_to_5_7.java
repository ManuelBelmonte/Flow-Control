import java.util.Scanner;

public class Woorkook5_4_to_5_7 {
    public static void main(String[] args) {
        //Workbook 5.4 creates a for loop that steps down.
        for(int i = 99; i>=0; i--){
            System.out.println(i+ " bootles of beer on the wall, 99 bottles of beer! take one down, pass it around,"+ (i -1)+" bottles of beer on the wall ");
        }


        //Workbook 5.5 considers user input to define the start, stop, and step.
        Scanner scan = new Scanner(System.in);
        //Workbook 5.5 considers user input to define the start, stop, and step.
        System.out.println("Hey I hear you like to count by threes\nJimmy: It depends oh, ok ...");
        System.out.print("1. Pick a number to count by: ");
        int count = scan.nextInt();
        System.out.print("2. Pick a number to start counting from: ");
        int start = scan.nextInt();
        System.out.print("3. Pick a number to count to: ");
        int countTo = scan.nextInt();

        for(int i = start; i<= countTo; i+=count){
            System.out.print(i+" ");
        }

        for(int i = 0;i<=20;i++){
            if(i%2==0){
                System.out.println(i+"- even");
            }else {
                System.out.println(i+"- odd");
            }
        }
        //FizzBuzz woorkbook 5.7
        for(int i = 0; i<=20; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" FizzBuzz");
            } else if (i%3==0) {
                System.out.println(i+" Fizz");
            } else if (i%5==0) {
                System.out.println(i+" Buzz");
            }
        }

    }
}
