import java.util.Scanner;
public class L1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int sum = Sum_of_Digits(num);
		System.out.println("Sum of digits " + num + " until the number is a single digit is " + sum);
	}
	
	public static int Sum_of_Digits(int num)
	{
		int sum=0;
		while (num>0 || sum>9){
			if (num==0){
				num = sum;
				sum=0;
			}
			int r = num%10;
			sum = sum+r;
			num = num/10;
		}
		return sum;
	}	

}
