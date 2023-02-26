import java.util.Scanner;
import java.math.*;
import java.text.*;

public class CGPA{

    public void tellCGPA(double aa[], double bb[]){
        int m1 = aa.length;
        double credit_sum = 0;
        double multiple_sum = 0;

        double cgpa_per_sub[] = new double[m1];

        for(int i=0; i<m1; i++){
            credit_sum = credit_sum + bb[i];
        }

        for(int j=0; j<m1; j++){
            double temp1 = Math.floor(aa[j]/9);
            cgpa_per_sub[j] = temp1;
        }

        for(int k=0; k<m1; k++){
            double temp2 = cgpa_per_sub[k]*bb[k];
            multiple_sum = multiple_sum + temp2;
        }

        double cgpa = multiple_sum/credit_sum;
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Your CGPA is: " + df.format(cgpa));
    }

    public void cgpaCalculator(){

        Scanner at = new Scanner(System.in);
        System.out.print("Enter the no. of subjects: \n");
        int n = at.nextInt();

        if(n>0){
            double marks[] = new double[n];
            double credits[] = new double[n];

            System.out.println("Now enter marks of all the subjects in order out of 100: ");
            for(int i=0; i<n; i++){
                double a = at.nextDouble();
                if(a>=0 && a<=100){
                    marks[i] = a;
                }
            }

            System.out.println("Now enter credits of all the subjects in the same order in which you entered marks: ");
            for(int i=0; i<n; i++){
                double b = at.nextDouble();
                if(b>0 && b<=5){
                    credits[i] = b;
                }
            }

            CGPA c1 = new CGPA();
            c1.tellCGPA(marks, credits);
        }
    }
}