import java.util.*;
public class L1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		double t1 = Math.log(n);
		double t2 = Math.log(2);
		int ans = (int)(t1/t2);
		System.out.print(n + " must be divided by two " + ans + " times to get a value less than 2");
		
	}

}
