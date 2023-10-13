
abstract class Shape {               //Question 6
	abstract double calc_Area();
}
class Square extends Shape
{
	int side;
	Square(int side){
		this.side = side;
	}
	double calc_Area() {
		return side*side;
	} 
}
class Triangle extends Shape
{
	double base, height;
	Triangle(double base, double height){     //Question 6
		this.base = base;
		this.height = height;
	}
	double calc_Area() {
		return 0.5*base*height;
	}
}
class Circle extends Shape
{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	double calc_Area() {
		return Math.PI*radius*radius;
	}
}
class Display {
	public static void main(String[] args) {
		Square obj1 = new Square(5);
		System.out.println("The area of square is " + obj1.calc_Area());
		Triangle obj2 = new Triangle(3, 5.2);
		System.out.println("The area of triangle is " + obj2.calc_Area());
		Circle obj3 = new Circle(4.2);
		System.out.println("The area of circle is " + obj3.calc_Area());
	}

}
