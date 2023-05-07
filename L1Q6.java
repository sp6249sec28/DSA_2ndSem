import java.util.*;
public class L1Q6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.println(a + " is odd: " + isOdd(a));
		sc.close();
	}
	public static boolean isOdd(int n)
	{
		int b = n&1;       //converting to binary, last digit of binary number and 1 are calculated
		if (b==0)          //1&1=True, 1&0=0&1=0&0=false
			return false;
		else 
			return true;
	}

}
