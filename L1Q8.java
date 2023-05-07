import java.util.*;
public class L1Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of array: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];
		System.out.print("Enter element: ");
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int sum=0;
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				sum = sum + arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The sum of elements of a 2D array is: " + sum);
	}

}
