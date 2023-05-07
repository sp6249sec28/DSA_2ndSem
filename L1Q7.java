import java.util.Scanner;
public class L1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		System.out.print("Enter the elements: ");
		int arr[] = new int[size];
		for (int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		int max_count = 0;
		int min_count = 0;
		int max_first_occurs = 0;
		int min_last_occurs = 0;
		for (int i=0;i<size;i++) {
			if (arr[i] > max) {
				max = arr[i];
				max_count = 1;
				max_first_occurs = i;
			}
			else if (arr[i] == max) {
				max_count++;
			}
			if (arr[i] < min) {
				min = arr[i];
				min_count = 1;
				min_last_occurs = i;
			}
			else if (arr[i] == min) {
				min_count++;
				min_last_occurs = i;
			}
				
		}
		System.out.println("Maximum element of array is " + max + " and occurs " + max_count + " times.");
		System.out.println("Minimum element of array is " + min + " and occurs " + min_count + " times.");
		System.out.println("First occurrence of maximum element is at position " + max_first_occurs + ".");
		System.out.println("Last occurrence of minimum element is at position " + min_last_occurs + ".");

	}

}
