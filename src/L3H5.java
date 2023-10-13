import java.util.Scanner;
public class L3H5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rings: ");
		int n = sc.nextInt();
		towerofhanoi(n, "S", "H", "D");
	}
	public static void towerofhanoi(int n, String source, String helper, String destination)
	{
		if (n==1) {
			System.out.println("Move disk "+ n + " from rod " + source + " to rod " + destination);
			return;
		}
		towerofhanoi(n-1, source, destination, helper);
		System.out.println("Move disk "+ n + " from rod " + source + " to rod " + destination);
		towerofhanoi(n-1, helper, destination, source);	
	}
}
