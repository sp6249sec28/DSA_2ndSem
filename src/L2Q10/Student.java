package L2Q10;
import java.util.*;
import L2Q10_2.sport.Sports;
import L2Q10_2.*;

class Student {
	String name;
	int roll;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Roll: ");
		roll = sc.nextInt();
	}
	public void output() {
		System.out.println("Name: " + name + "having Roll No.: " + roll);
	}
}
class Test extends Student{
	int mark1, mark2;
	public void input() {
		super.input();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Mark 1: ");
		mark1 = sc.nextInt();
		System.out.print("Enter Mark 2: ");
		mark2 = sc.nextInt();
	}
	public void output() {
		super.output();
		System.out.println("Mark 1: "+ mark1 + " & Mark 2: " + mark2);
	}
}
class GrandTotal extends Test implements Sports {
	public void input() {
		super.input();
	}
	public void output() {
		super.output();
		System.out.println("Score 1: " + score1 + " & Score 2: " + score2);
		System.out.println("Total mark: " + (mark1+mark2) + " and Total score: "+ (score1+score2));
		System.out.println("Grand Total is: " + (mark1+mark2+score1+score2));
	}
}
class Q10{
	public static void main(String [] args) {
		GrandTotal g1 = new GrandTotal();
		g1.input();
		g1.output();
	}
}

