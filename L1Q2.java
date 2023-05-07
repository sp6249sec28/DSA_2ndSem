import java.util.Scanner;

public class L1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the weight: ");
		double w = sc.nextDouble();
		System.out.print("Enter your height in cm: ");
		double h = sc.nextDouble();
		double ht = h/100;
		double bmi = w/(ht*ht);
		System.out.println("Your BMI score is: " + bmi);
		if (bmi < 18.5)
			System.out.println("You are underweight.");
		else if (bmi >= 18.5 && bmi <= 24.9)
			System.out.println("You are normal weight.");
		else if (bmi >= 25.0 && bmi <=29.9)
			System.out.println("You are overweight.");
		else if (bmi >= 30.0)
			System.out.println("You are obese.");

	}

}
