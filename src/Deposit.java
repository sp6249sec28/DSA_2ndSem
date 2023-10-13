           
public class Deposit {         //Question 5
	long Principal;
	int Time;
	double Rate;
	double Total_amt;
	void Deposit() {	
	}
	void Deposit(long Principal, int Time, double Rate) {
		this.Principal = Principal;
		this.Time = Time;
		this.Rate = Rate;
	}
	void Deposit(long Principal, int Time) {
		this.Principal = Principal;
		this.Time = Time;
	}
	void Deposit(long Principal, double Rate) {
		this.Principal = Principal;
		this.Rate = Rate;
	}

	public void display() {
		System.out.println("Principal: " + Principal + " Time: " + Time + " Rate: " + Rate);
	}
	public void calc_amt() {
		Total_amt = Principal + (Principal*Rate*Time)/100;
		System.out.print("The total amount is " + Total_amt);
	}

	public static void main(String[] args) {
		Deposit D1 = new Deposit();
		D1.Deposit();
		D1.Deposit(10500, 2, 15.0);
		D1.Deposit(10500, 2);
		D1.Deposit(10500, 15.0);
		D1.display();
		D1.calc_amt();
	}
}
