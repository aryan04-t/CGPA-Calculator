import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCourses;

        System.out.print("Enter the number of courses: ");
        numCourses = sc.nextInt();

        double sumCredits = 0, sumGradePoints = 0;
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nFor course " + i + ":");
            System.out.print("Enter the credit ");
            int creditHours = sc.nextInt();
            sumCredits += creditHours;

            System.out.print("Enter the grade (O,A+,A,B+,B,C): ");
            String grade = sc.next().toUpperCase();
            double gradePoints = getGradePoints(grade);
            sumGradePoints += gradePoints * creditHours;
        }

        double cgpa = sumGradePoints / sumCredits;
        System.out.printf("\nCGPA: %.2f", cgpa);
    }

    public static double getGradePoints(String grade) {
        double gradePoints;
        switch (grade) {
            case "O":
                gradePoints =10 ;
                break;
            case "A+":
                gradePoints =9;
                break;
            case "A":
                gradePoints =8;
                break;
            case "B+":
                gradePoints =7;
                break;
            case "B":
                gradePoints =6;
                break;
            case "C":
                gradePoints =5;
                break;
            default:
                gradePoints =0; //default case
                break;
        }
        return gradePoints;
    }
}
