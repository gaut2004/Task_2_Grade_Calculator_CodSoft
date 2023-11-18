import java.util.Scanner;

public class task2_Student_Grade_Calculator {

    public static void main(String[] args) {
        // Input: Take marks obtained in each subject
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        System.out.println("___________________________________________________________");
        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
        }

        // Calculate Total Marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade Calculation
        char grade = calculateGrade(averagePercentage);
        System.out.println("_________________________________________________________");
        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90 && averagePercentage <= 100) {
            return 'O';
        } else if (averagePercentage >= 80 && averagePercentage < 90) {
            return 'A';
        } else if (averagePercentage >= 70 && averagePercentage < 80) {
            return 'B';
        } else if (averagePercentage >= 60 && averagePercentage < 70) {
            return 'C';
        } else if (averagePercentage >= 50 && averagePercentage < 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
