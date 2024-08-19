import java.util.Scanner;

public class Workbook5_10 {
    public static void main(String[] args) {

        int dice1 = diceRoll();
        int dice2 = diceRoll();


        System.out.println("Dice 1: "+dice1);
        System.out.println("Dice 2: "+dice2+"\n");

        while (!(dice2 == dice1)){
            dice1 = diceRoll();
            dice2 = diceRoll();
            System.out.println("Dice 1: "+dice1);
            System.out.println("Dice 2: "+dice2+"\n");
        }

    }

    public static int diceRoll (){
        double computerChoice = Math.random()*6;
        return (int) computerChoice;
    }
}
