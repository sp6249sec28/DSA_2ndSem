import java.util.Scanner;
class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String m1){
		super(m1);
	}
} 


public class Student {
	String name;
	double mark;
	Student(String n, double m){
		this.name = name;
		this.mark = mark;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student's name: ");
		String name = sc.nextLine();
		System.out.print("Enter student's mark: ");
		double mark = sc.nextDouble();
		
		
		try {
			if(mark > 100) {
				throw new MarksOutOfBoundException("Marks can't be greater than 100");
			}
			Student s1 = new Student(name, mark);
			System.out.println(name + " has got " + mark + " marks.");
			
		}
		catch(MarksOutOfBoundException e) {
			System.out.println("Error: " + e);
		}
	}

}
