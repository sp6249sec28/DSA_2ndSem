import java.util.Scanner;
public class L3Q9 {
	public static int fib(int n) {
		int a=0, b=1, c;
		if(n<=1)
			return n;
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term: ");
		int n = sc.nextInt();
		
		System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
		
	}

}
