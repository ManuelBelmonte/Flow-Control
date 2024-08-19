import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hi bart, what do you want me to write");
        String whattoWrite = scan.nextLine();
        for(int i = 1; i<=10; i++){
            System.out.println(i +". "+whattoWrite);
        }
    }
}
