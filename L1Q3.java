import java.util.Scanner;
public class L1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r, s=0, p=1;
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int temp=n;
		while (n!=0)
		{
			r = n%10;
			s = s+r;
			p = p*r;
			n = n/10;
		}
		if (s==p)
			System.out.println(temp + " is a spy number.");
		else
			System.out.println(temp + " is not a spy number. ");
		

	}

}
