import java.util.Scanner;
public class Gradecalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int subjects = s.nextInt();
        int totMarks = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = s.nextInt();
            totMarks += marks;
        }
        double avg= (double) totMarks / subjects;
        String grade;
        if (avg >= 90) {
            grade = "A+";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else if (avg >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nTotal Marks: " + totMarks);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        s.close();
    }
}
