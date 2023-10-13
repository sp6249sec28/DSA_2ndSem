import java.util.Scanner;
public class L3Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter four colours: ");
		String[] color = new String[4];
		for(int i=0;i<color.length; i++) {
			color[i] = sc.next();
		}
		
		try { 
			String invalidNumber = color[0];
			Integer.parseInt(invalidNumber);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		System.out.print("Enter one  more colour: ");
		String n1 = sc.next();
		
		try {
			color[5] = n1;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("The colours entered are ");
		for (int i=0; i<color.length; i++) {
			System.out.println(color[i]);
		}
	}

}
