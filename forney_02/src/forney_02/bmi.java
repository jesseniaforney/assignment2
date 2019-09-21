package forney_02;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner console = new Scanner(System.in);
        double bmi1 = person(console);
        report(bmi1);
    }

    public static double person(Scanner console) {
        System.out.print("weight (in pounds)? ");
        double weight = console.nextDouble();
        System.out.print("height (in inches)? ");
        double height = console.nextDouble();

        return bmi(height, weight);
    }

    public static double bmi(double height, double weight) {
        return (weight * 703 / height / height);
    }

    public static void report(double bmi) {
        System.out.printf("BMI = %f\n",bmi);
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
	}
}
