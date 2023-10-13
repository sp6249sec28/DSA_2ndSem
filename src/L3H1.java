import java.util.Scanner;
public class L3H1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("Enter account number: ");
		int acc = sc.nextInt();
		System.out.print("Enter balance: ");
		int bal = sc.nextInt();
		try{
			if(bal<=0) {
				throw new Exception("Balance cannot be less than 0.");
			}
			else {
				System.out.println("Details of the Account holder");
				System.out.println("Name: " + name);
				System.out.println("Account number: " + acc);
				System.out.println("Balance: " + bal);
				System.out.println("Enter the money to withdraw");
				int amount = sc.nextInt();
				int finalbal = bal - amount;
				System.out.println("After withdraw, Balance = "+ finalbal);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
