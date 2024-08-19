import java.util.Scanner;

public class PrintValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //este programa usare el print vs println
        System.out.println("Hi Jimmy! Choose a number to count");
        int countNumber = scan.nextInt();
        System.out.println("Great! Here's how it works");
        for(int i = 0; i <= countNumber; i++){
            System.out.print(i+" ");
        }
    }
}
