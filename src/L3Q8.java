import java.util.*;
public class L3Q8 {
	public static void reverse(int m) {
		int rev = 0;
		if(m<10) {
			System.out.println(m);
			return;
		}
		System.out.print(m%10);
		reverse(m/10);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number to be reversed: ");
		int rev = sc.nextInt();
		System.out.print("The reversed number is ");
		reverse(rev);

	}

}
/*while (m!=0)
 {
   int rem = m%10;
   rev = 0*rev + rem;
   m=m/10;
 }
 SOPln(rev);*/
