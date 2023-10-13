
class Distance {            // Home Assignment 3
	int meters;
	int centimeters;
	Distance(int meters, int centimeters){
		this.meters = meters;
		this.centimeters = centimeters;
	}
	void display() {
		System.out.println(meters + " m & " + centimeters + " cm");
		
	}
	public static Distance sum(Distance D1, Distance D2) {
		int finalmeters = D1.meters + D2.meters;
		int finalcentimeters = D1.centimeters + D2.centimeters;
		if (finalcentimeters > 100) {
			finalcentimeters -= 100;
			finalmeters += 1;
		} 
		return new Distance(finalmeters, finalcentimeters);
	}
	
	public static void main(String[] args) {
		Distance D1 = new Distance(5, 60);
		Distance D2 = new Distance(4, 70);
		Distance sumDistance = Distance.sum(D1, D2);
		System.out.println("Two distances are: ");
		D1.display();
		D2.display();
		System.out.print("The sum is: ");
		sumDistance.display();

	}

}
 