import java.util.*;
public class L1Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Length of array: ");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		double arr[][] = new double[rows][cols];
		for (int i=0;i<rows;i++){
			for (int j=0;j<cols;j++){
				System.out.println("Enter element: ");
				arr[i][j] = sc.nextDouble();
			}
		}

		for (int j=0;j<cols;j++) {
			System.out.println("Sum of the elements at column " + j + " is " + sumColumn(arr, j));
		}
	}

	public static double sumColumn(double arr[][], int columnIndex) {
		double sum=0;
		for (int i=0;i<arr.length;i++) {
			sum = sum + arr[i][columnIndex];
		}
		
		return sum;

	}

}
