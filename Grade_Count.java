package Practice;
import java.util.*;

public class Grade_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        double[] grades = new double[numberOfSubjects];

        // Input grades for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter the grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // Calculate the average grade
        double averageGrade = calculateAverage(grades);

        // Determine the letter grade
        char letterGrade = calculateLetterGrade(averageGrade);

        // Calculate GPA (assuming a 4.0 scale)
        double gpa = calculateGPA(letterGrade);

        // Display the results
        System.out.printf("Average Grade: %.2f%n", averageGrade);
        System.out.println("Letter Grade: " + letterGrade);
        System.out.printf("GPA: %.2f%n", gpa);
    }

    private static double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    private static char calculateLetterGrade(double averageGrade) {
        if (averageGrade >= 90) {
            return 'A';
        } else if (averageGrade >= 80) {
            return 'B';
        } else if (averageGrade >= 70) {
            return 'C';
        } else if (averageGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    private static double calculateGPA(char letterGrade) {
        switch (letterGrade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            default:
                return 0.0;
        }
    }
}