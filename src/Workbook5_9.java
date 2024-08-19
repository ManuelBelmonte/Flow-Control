import java.util.Scanner;

public class Workbook5_9 {
    public static void main(String[] args) {
        String username = "Mamba";
        String password = "Goku";

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Javagram, sign in below");
        System.out.print("Username: ");
        username=scan.nextLine();
        System.out.print("Password: ");
        password=scan.nextLine();

        while(!username.equals("Mamba")&& !password.equals("Goku")){
            System.out.println("Incorrect please try again");
            System.out.print("Username: ");
            username=scan.nextLine();
            System.out.print("Password: ");
            password=scan.nextLine();
        }
        System.out.println("welcome!");

    }
}
