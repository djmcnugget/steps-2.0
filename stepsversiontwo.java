import java.util.Scanner;

public class stepsversiontwo {

    public int steps(int numOfSteps) {
        if (numOfSteps == 1) {
            return 1;
        } else if (numOfSteps == 2) {
            return 2;
        } else if (numOfSteps == 3) {
            return 4;
        } else {
            return steps(numOfSteps - 1) + steps(numOfSteps - 2) + steps(numOfSteps - 3);
        }
    }

public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("How many steps does your staircase have?");
        int num = input.nextInt();

        stepsversiontwo staircase = new stepsversiontwo();
        int ways = staircase.steps(num);
        System.out.println("There are " + ways + " possible ways to climb this staircase.");
    }
}