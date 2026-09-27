import java.util.Scanner;

public class IT26101769Lab09Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.3) + (examMark * 0.7);
    }

    public static char findGrades(double finalMark) {
        char grade;
        if (finalMark >= 75) {
            grade = 'A';
        } else if (finalMark >= 60) {
            grade = 'B';
        } else if (finalMark >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s%-15.2f%-5s%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = input.nextDouble();

            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        System.out.printf("%-15s%-15s%-5s%n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
		
    }
}