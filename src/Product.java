                                  //QUESTION 04
public class Product {
	int pid;
	double price;
	static double tot_price;
	public Product(int pid, double price) {
		this.pid = pid;
		this.price = price;
		tot_price += price;
	}

	public void display() {
		System.out.println(pid + "\t\t" + price);
	}
	
	
	public static void main(String[] args) {
		Product [] products = new Product[5];
		products[0] = new Product(100, 10.5);
		products[1] = new Product(200, 20.5);
		products[2] = new Product(300, 30.5);
		products[3] = new Product(400, 40.5);
		products[4] = new Product(500, 50.5);
		System.out.println("Sl No.\tProduct-id\tProduct Price");
		for (int i=0;i<products.length;i++) 
		{
			System.out.print((i+1)+"\t");
			products[i].display();
		}
		
		System.out.print("Total price is: " + tot_price + " rupees only...");

	}

}
