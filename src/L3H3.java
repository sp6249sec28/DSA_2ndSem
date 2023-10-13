import java.util.Scanner;
public class L3H3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		if(str = rev)
		{
			
		}
		

	}
	public static String reverse(String str)
	{
		if(str.length() == 1)
		{
			System.out.println(str);
		}
		else	
		{
			System.out.println(str.charAt(str.length()-1));
			String rev = reverse(str.substring(0, str.length()-1));
		}
		return str;
	}

}
