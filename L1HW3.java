import java.util.*;
public class L1HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        System.out.print("Enter element for a Array : ");
        for (int i=0 ; i<n ; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter element for b Array : ");
        for (int i=0 ; i<n ; i++) {
            b[i] = sc.nextInt();
        }
        for (int i=0 ; i<n ; i++) {
            c[i] = a[i] * b[i];

        }
        System.out.println(Arrays.toString(c));
        sc.close();
	}

}
