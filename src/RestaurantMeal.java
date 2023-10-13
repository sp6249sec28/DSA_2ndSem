
public class RestaurantMeal {
	String name;
	static int price;
	RestaurantMeal(String name, int price){
		this.name = name;
		this.price = price;
	}	
	void display() {
		System.out.println("Name of the food item: " + name);
		System.out.println("Price is " + price);
	}

}
