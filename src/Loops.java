public class Loops {
    public static void main(String[] args) {
        /* Task Description

        The task is to create a program which uses a number,
        int n = 150;
        The program will then display all the numbers up to that input number using three types of loops:
        `for` loop, `while` loop, and `do-while` loop.
        During this process, the program should skip any number that is a multiple of 10 using the `continue` statement.
        Additionally, the program should stop if the numbers being displayed go beyond 100 using the `break` statement.*/
   int n = 150;

        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {

                continue;

            }

            if (i > 100) {

                break;
            }
            System.out.println(i);

        }
    }
}
