
public class PersonQ7 {       //Question 07
	String name;
	int age;
	public PersonQ7(String name, int age){
		this.name = name;
		this.age = age;
	}
}
class Employee extends PersonQ7{
	int Eid; 
	double salary;
	public Employee(String name, int age, int Eid, double salary){
		super(name,age);
		this.Eid = Eid;
		this.salary = salary;
	}
	public void empDisplay() {
		System.out.println(name + "\t\t" + age + "\t" + Eid + "\t" + salary);
	}
}
class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee("Somnath", 19, 1689, 50589.54);
		Employee E2 = new Employee("Shivam", 19, 1879, 50547.36);
		System.out.println("Emp-Name\t" + "Age\t" + "Emp_ID\t" + "Salary");
		E1.empDisplay();
		E2.empDisplay();
	}
}
 