import java.util.*;
public class L1HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word : ");
        String str = sc.nextLine();
        for (int i=str.length()-1 ; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        sc.close();

	}

}
