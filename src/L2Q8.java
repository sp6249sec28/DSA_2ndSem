import java.util.Scanner;
interface DetailInfo {         //Question 08
	void display();
	void count();
}
class person implements DetailInfo{
	static int maxcount=0;
	String name;
	void Person(String name){
		this.name = name;
	}
	public void count() {
		maxcount = name.length();
	}
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("No of characters: " + maxcount);
	}
	
}
class L2Q8{
	public static void main(String [] args) {
		
		person P1 = new person();
		P1.name = "Shivam patnaik";
		P1.count();
		P1.display();
	}
}
