import java.util.Scanner;

public class DecodeLabs_Java_P2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfSubjects;
        int totalMarks = 0;

        System.out.println("======================================");
        System.out.println("     DECODE LABS - STUDENT GRADE");
        System.out.println("          CALCULATOR");
        System.out.println("======================================");

        System.out.print("Enter number of subjects: ");
        numberOfSubjects = sc.nextInt();

        while (numberOfSubjects <= 0) {
            System.out.println("Number of subjects must be greater than 0.");
            System.out.print("Enter number of subjects again: ");
            numberOfSubjects = sc.nextInt();
        }

        for (int i = 1; i <= numberOfSubjects; i++) {

            int marks;

            System.out.print("Enter marks for Subject " + i + " (0-100): ");
            marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
                System.out.print("Enter marks for Subject " + i + " again: ");
                marks = sc.nextInt();
            }

            totalMarks += marks;
        }

        double average = (double) totalMarks / numberOfSubjects;

        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println();
        System.out.println("======================================");
        System.out.println("             RESULT");
        System.out.println("======================================");
        System.out.println("Total Marks : " + totalMarks);
        System.out.printf("Average     : %.2f%%%n", average);
        System.out.println("Grade       : " + grade);
        System.out.println("======================================");

        sc.close();
    }
}