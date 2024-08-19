public class Exercise1 {
    public static void main(String[] args) {
        /*1. Task Description
        the task is to develop a grading application over three subjects math, physics, and chemistry.
    Print message base on following conditions:
    2. Steps
    Define three variables
    int maths = 75;
    int physics = 99;
    int chemistry = 80;
    Calculate average score of the student and store it in a integer variable average. Use if - else if - else block to grade.
    3. Expected Output
    Grade A*/
        int maths = 75;
        int physics = 99;
        int chemestry = 80;

        int sum = (maths+physics+chemestry)/3;
        System.out.println(sum);

        if(sum < 35){
            System.out.println("Youy failed");
        } else if (sum <60) {
            System.out.println("Grade C");
        } else if (sum <70) {
            System.out.println("Grade B");
        }else{
            System.out.println("Grade A");
        }


    }
}
