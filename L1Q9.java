import java.util.Scanner;
public class L1Q9 {

	public static void main(String[] args) {
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
		double sum = sumMajorDiagonal(arr);
		System.out.println("Sum of major diagonal elements is " + sum);
	}
	public static double sumMajorDiagonal(double[][] array) {
		double sum=0;
		for (int i=0;i<array.length;i++){
			for (int j=0;j<array.length;j++){
				if (i==j) {
					sum = sum + array[i][j];
				}
			}
		}	
		return sum;

	}

}
