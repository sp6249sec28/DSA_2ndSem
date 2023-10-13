import java.util.*;
class Commission {        //Home Assignment 1
	double sales;
	Commission(double sales){
		this.sales = sales;
	}
	double getCommission() 
	{
		if (sales<0) 
		{
			System.out.println("Invalid Input.");
			sales = 0;
		}
		else if (sales<500) 
			sales = 0.02*sales;
		else if (sales>=500 && sales<5000) 
			sales = 0.05*sales;
		else if (sales>=5000)
			sales = 0.08*sales;
		return sales;
		
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the sale: ");
		double sale = sc.nextDouble();
		
		Commission com = new Commission(sale);
		double amount = com.getCommission();
		if (amount>0) {
			System.out.println("The commission is Rs. " + amount);
		}
		
	}
}