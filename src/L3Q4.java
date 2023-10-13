import java.util.Scanner;
public class L3Q4 {
	public static <E> void printArray(E [] inputArray){
		for (int i=0; i<inputArray.length; i++) {
			System.out.println(inputArray[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements: ");
		Integer[] num = new Integer[5];
		for (int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Integer array contains: ");
		printArray(num);
		
		System.out.println("Enter the array elements: ");
		Double[] num2 = new Double[5];
		for(int i=0; i<num2.length;i++) {
			num2[i] = sc.nextDouble();
		}
		System.out.println("Double array contains: ");
		printArray(num2);

	}

}
