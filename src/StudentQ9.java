import java.util.*;
public class StudentQ9 {
	int roll_number;
	String name;
	String course;
	void input_Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll Number: ");
		roll_number = sc.nextInt();
		System.out.print("Enter Name: " );
		name = sc.next();
		System.out.print("Enter Course: ");
		course = sc.next();
	}
	void display_Student() {
		System.out.println("Name: " + name + ", Roll no.: " +
	              roll_number + ", Course: " + course);
	}
} 

class Exam extends StudentQ9{
	int mark1, mark2, mark3;    
	void input_Marks() {
		super.input_Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your mark 1: ");
		mark1 = sc.nextInt();
		System.out.print("Enter your mark 2: ");
		mark2 = sc.nextInt();
		System.out.print("Enter your mark 3: ");
		mark3 = sc.nextInt();
	}
	void display_Result() {
		super.display_Student();
		System.out.println("Mark of Subject 1: " + mark1);
		System.out.println("Mark of Subject 2: " + mark2);
		System.out.println("Mark of Subject 3: " + mark3);
	}
	public static void main(String[] args) {
		Exam [] students = new Exam[5];
		for (int i=0;i<students.length;i++) {
			students[i] = new Exam(); 
			students[i].input_Marks();  
		}
		for (int i=0;i<students.length;i++) {
			students[i].display_Result();
		}
	}

}
