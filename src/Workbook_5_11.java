
import java.util.Scanner;

public class Workbook_5_11 {
    public static void main(String[] args) {
        System.out.println("Lets play rolling Java. Type anything to start");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        System.out.print("Great game rules: \n- If you roll a 6, the game stops\n- If you roll a 4 nothing happens" +
                "\n-Otherwise you get 1 point\n You must collect 3 points. Enter anything to roll");
        int count = 0;

        while(true){
            scan.nextLine();
            int diceroll = rollDice();
            System.out.print("You roll a "+ diceroll);
            //si diceroll es igual a 6 el juego termina
            if(diceroll ==6){
                System.out.println("\nEnd of the game");
                break;
            } else if (diceroll == 4) {
                System.out.print(" .Zero point. Keep rolling");
            }else{
                System.out.print(" .You got 1 point");
                count++;
            }
        }

        if(count >= 3){
            System.out.println("Wow that's lucky, You win");
        }else {
            System.out.println("Though luck, you lose :(");
        }

    }


    public static int rollDice(){
        double roll = Math.random() * 6;
        roll+=1;
        return  (int)roll;

    }
}
