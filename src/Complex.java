import java.util.*;        //QUESTION 02 
class Complex {
	int real;
	int imag;
	public void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real number: ");
		real = sc.nextInt();
		System.out.print("Enter imaginary number: ");
		imag = sc.nextInt();
	}
	public void display() {
		System.out.println(real + " + " + imag + "i");
	}
	public Complex add(Complex num1, Complex num2) {
		Complex sum = new Complex();
		sum.real = num1.real + num2.real;
		sum.imag = num1.imag + num2.imag;
		return sum; 
	}

	public static void main(String[] args) {
		Complex num1 = new Complex();
		Complex num2 = new Complex();
		Complex sum_total = new Complex();
		num1.setData();
		num2.setData();
		sum_total = sum_total.add(num1,  num2);
		num1.display();
		num2.display();
		System.out.print("The sum of two complex numbers is: ");
		sum_total.display();

	}

}
