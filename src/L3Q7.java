import java.util.Scanner;
public class L3Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a Mathematical operation from below: ");
		System.out.println("Type 1 to Determine the factorial of a number");
		System.out.println("Type 2 to Determine X^N for two numbers X, N");
		System.out.println("Type 3 to Determine the GCD of a number");
		System.out.println("Type 4 to Binary equivalent of a Decimal Number");
		System.out.println("Type 5 for Product of two numbers");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.print("Enter a number: ");
			int f = sc.nextInt();
			System.out.println("Factorial of " + f + " is "+ calc_Fact(f));
			break;
			
		case 2:
			System.out.print("Enter X and N: ");
			int x = sc.nextInt();
			int n = sc.nextInt();
			System.out.println("X^N = " + calc_Power(x, n));
			break;
			
		case 3:
			System.out.print("Enter two numbers:");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("GCD of " + a +" and "+b + " is " + calc_GCD(a, b ));
			break;
			
		case 4:
			System.out.print("Enter a number: ");
			int decimal = sc.nextInt();
			System.out.println("Binary form of " + decimal + " is " + calc_bin(decimal));
			break;
			
		case 5:
			System.out.print("Enter two numbers: ");
			int m1 = sc.nextInt();
			int m2= sc.nextInt();
			int product = calc_Prod(m1, m2);
			System.out.print(m1 + " * " + m2 + " = " + product);
			break;
		
		default:
			System.out.print("Invalid choice.😂");
		}
	
		System.out.println();
	}
	
	public static int calc_Fact(int n) {
		if(n==0)
			return 1;
		else
			return (n*calc_Fact(n-1));
	}
	public static int calc_Power(int x, int n) {
		if (n==0)
			return 1;
		else
			return(x*calc_Power(x, n-1));
	}
	public static int calc_GCD(int a, int b) {
		if (a<b) {
			int t = a;
			a=b;
			b=t;
		}
		while(a%b!=0)
		{
			int r = a%b;
			a=b;
			b=r;
		}
		return b;
	}
	public static int calc_bin(int n) {
		if (n==0) {
			return 0;
		}
		else{
			return (n%2 + 10*calc_bin(n/2));
		}
		
	}
	public static int calc_Prod(int m1, int m2) {
		if(m2 == 0)
			return 0;
		else 
			return m1 + calc_Prod(m1, m2-1);
	}
}
	
	
	
	
	