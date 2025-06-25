import java.util.Scanner;

public class QuizScoreTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students took the quiz? ");
        int stdCount = input.nextInt();

        double totalScore = 0;

        for (int i = 1; i <= stdCount; i++) {
            System.out.print("What is the student's name? ");
            String name = input.next();

            System.out.print("What is the student's quiz grade? ");
            double grade = input.nextDouble();

            totalScore += grade;
        }

        double average = totalScore / stdCount;
        System.out.println("Class average score: " + average);

        // Ask the user if they want to review again
        System.out.print("Do you want to review again? Type 'yes' to repeat or 'no' to exit: ");
        String answer = input.next();

        // Repeat showing the average as long as the user types "yes"
        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Class average score: " + average);
            System.out.print("Do you want to review again? ");
            answer = input.next();
        }

        System.out.println("Thank you! Program ended.");
        input.close();
    }
}
