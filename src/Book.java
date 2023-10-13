import java.util.*;
public class Book {           //Home Assignment 2
	String BName;
	int BEdition;
	double BPrice;
	Book(){
		this.BName = BName;
		this.BEdition = BEdition;
		this.BPrice = BPrice;
	}
	void setData() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Book Name: ");
		BName = sc.next();
		System.out.print("Enter Book Edition: ");
		BEdition = sc.nextInt();
		System.out.print("Enter Book Price: ");
		BPrice = sc.nextDouble();	
	}
	void display() {
		System.out.println("The name of the book is " + BName);
		System.out.println("The edition of the book is " + BEdition);
		System.out.println("The price of the book is " + BPrice);
	}
	public static void main(String[] args) {
		Book [] books = new Book[3];
		double maxPrice = 0;
		int index = 0;
		for (int i=0; i<books.length; i++) {
			books[i] = new Book();
			books[i].setData();
			while(books[i].BPrice > maxPrice) {
				maxPrice = books[i].BPrice;
				index = i;
		}
		}
		System.out.println("Highest Price: ");
		books[index].display();

	}
}
