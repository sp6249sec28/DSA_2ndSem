import java.util.*;              //QUESTION 01
public class Phone {
	int area_code;
	int exchange;
	int number;
	
	void input(int area_code, int exchange, int number){
		this.area_code = area_code;
		this.exchange = exchange;
		this.number = number;

	}
	
	void display() {
		System.out.println("(" + area_code + ") " + exchange + "-" + number);
	}

	public static void main(String[] args) {
		Phone P1 = new Phone();
		P1.input(212, 767, 8900);
		Phone P2 = new Phone();
		P2.input(415, 555, 1212);
		System.out.print("My number is: ");
		P1.display();
		System.out.print("Your number is: ");
		P2.display();
	}

}
