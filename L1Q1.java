import java.util.*;
public class L1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int count = 0;
		while(n!=0){
			n=n/2;
			count++;
	}
		System.out.println("The number of times 2 can be divided is " + count);

}
