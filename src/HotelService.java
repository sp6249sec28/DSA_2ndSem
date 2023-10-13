
public class HotelService {
	String service;
	static double fee;
	HotelService(String service, double fee){
		this.service = service;
		this.fee = fee;
	}
	void display() {
		System.out.println("Service Provided: " + service);
		System.out.println("Fee: " + fee);
	}
}
class RoomServiceMeal extends HotelService extends RestaurantMeal{

	RoomServiceMeal(String name, int price, String service, double fees) {
		super("Room", 24.00);
	} 
	void RoomServiceMeal() {
		void display() {
			super.display();
			System.out.println("The total amount is " + (RestaurantMeal.price + HotelService.fee));
		}
	
	public static void main (String[] args) {
		RoomServiceMeal R1 = new RoomServiceMeal("Steak Dinner", 500, "Room", 24.00);
		R1.display();
	}
	
}