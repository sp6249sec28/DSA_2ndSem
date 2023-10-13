import java.util.*;
public class L3Q10 {
	public static void reverse(String str)
	{
		if (str.length() == 1)
		{ 	
			System.out.print(str);
			return;
		}
		
		System.out.print(str.charAt(str.length()-1));
		reverse(str.substring(0,str.length()-1));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		System.out.print("The reverse is ");
		reverse(str);

	}

}
