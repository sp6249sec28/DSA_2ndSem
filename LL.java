package Lab_4;
import java.util.*;
class Node
{
	protected int regd_no;
	protected float mark;
	protected Node next;
	Node (int r, float m){
		regd_no = r;
		mark = m;
	}
}

public class LL
{
	static Scanner sc = new Scanner(System.in);
	public static Node create(Node head)
	{
		System.out.print("Enter regd_no: ");
		int rgno = sc.nextInt();
		System.out.print("Enter Marks: ");
		float mark = sc.nextFloat();
		head = new Node(rgno, mark);
		System.out.println("Linked List created...");
		return head;
	}
	//Insert at the beginning
	public static Node InsBeg(Node head)
	{
		if(head==null) {
			head = create(head);
			return head;
		}
		else {
			System.out.print("Enter regd_no: ");
			int rgno = sc.nextInt();
			System.out.print("Enter Marks: ");
			float mark = sc.nextFloat();
			Node newNode = new Node(rgno, mark);
			newNode.next = head;
			System.out.println("Node inserted at the beginning...");
			return newNode;
		}
	}
	//Insert at the End
	public static Node InsEnd(Node head)
	{
		if (head==null){
			head = create(head);
			return head;
		}
		else {
			System.out.print("Enter regd_no: ");
			int r = sc.nextInt();
			System.out.print("Enter Marks: ");
			float m = sc.nextFloat();
			Node newNode = new Node(r, m);
			Node temp = head;
			while(temp.next!=null) 
			{
				temp = temp.next;
			}
			temp.next = newNode;
			System.out.println("Node inserted at the end...");
			return head;
		}
	}
	//Insert at any position
	public static Node InsAny(Node head)
	{
		System.out.print("Enter the position to insert at: ");
		int position = sc.nextInt();
		Node temp = head;
		if(position == 1) {
			return InsBeg(head);
		}
		else {
			for (int i=2; i<position; i++) {
				try {
					temp = temp.next;
					if(temp==null) {
						throw new NullPointerException();
					}
				}
				catch (NullPointerException e) {
					System.out.println("Invalid position...");
					return head;
				}
			}
			System.out.print("Enter regd_no: ");
			int r = sc.nextInt();
			System.out.print("Enter Marks: ");
			float m = sc.nextFloat();
			Node newNode = new Node(r, m);
			newNode.next = temp.next;
			temp.next = newNode;
			System.out.println("Node inserted at "+position+" position.");
			return head;
		}
		
	}
	//Delete at the beginning
	public static Node DelBeg(Node head)
	{
		if(head==null) {
			System.out.println("Nothing to delete in the list...");
		}
		else {
			head = head.next;
			System.out.println("Node deleted at the beginning...");
		}
		return head;
	}
	//Delete at the end
	public static Node DelEnd(Node head)
	{
		if(head==null) {
			System.out.println("Nothing to delete in the list...");
		}
		else if(head.next == null) {
			head = null;
			System.out.println("End node deleted...");
		}
		else {
			Node temp = head;
			while(temp.next.next!=null) {
				temp = temp.next;
			}
			temp.next = null;
			System.out.println("End node deleted...");
		}
		return head;
	}
	//Delete at any position
	public static Node DelAny(Node head) {
		System.out.print("Enter the position to delete at: ");
		int position = sc.nextInt();
		if(position==1) {
			head = head.next;
			System.out.println("Node deleted at the first position...");
			return head;
		}
		else {
			Node temp = head;
			for (int i=2;i<position;i++) {
				try {
					temp = temp.next;
					if(temp == null) {
						throw new NullPointerException();
					}
				}
				catch(NullPointerException e) {
					System.out.println("Invalid position, nothing to delete...");
					return head;
				}
			}
			Node jumper = temp;
			jumper = jumper.next;
			temp.next = jumper.next;
			System.out.println("Node deleted successfully...");
			return head;
		}
	}
	//Delete by regd_no
	public static Node DelByRegd(Node head)
	{
		if(head==null) {
			System.out.println("Nothing to delete, empty linked list...");
			return null;
		}
		System.out.print("Enter the regd_no of the node to delete: ");
		int reg = sc.nextInt();
		Node current = head;
		Node previous = null;
		if(head.regd_no == reg) {
			System.out.println("Node with regd_no " + reg + " deleted successfully.");
			return head.next;
		}
		boolean key = true;
		while(current!=null) {
			if(current.regd_no == reg) {
				previous.next = current.next;
				current.next = null;
				System.out.println("Node with regd_no "+reg+ " deleted successfully.");
				key = false;
				return head;
			}
			previous = current;
			current = current.next;
		}
		try {
			if(key)
				throw new NullPointerException();
		}
		catch (NullPointerException e) {
			System.out.println("Node with regd_no " + reg + " not found in the list.");
		}
		return head;
	}
	//SEARCH
	public static void search(Node head) 
	{
		if(head==null) {
			System.out.println("List is empty, Nothing to search.");
		}
		else {
			System.out.print("Enter the regd_no for search: ");
			float reg = sc.nextFloat();
			Node temp = head;
			boolean found = false;
			while(temp != null) {
				if(temp.regd_no == reg) {
					System.out.print("Enter the new mark for the student: ");
					float marks = sc.nextFloat();
					temp.mark = marks;
					System.out.println("Mark updated...");
					found = true;
				}
				temp = temp.next;
			}
			try {
				if(!found) {
					throw new Exception("Not found any node having this regd_no...");
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	//SORTING
	public static void sort(Node head)
	{
		if(head==null) {
			System.out.println("Linked list is empty...");
		}
		else if(head.next == null) {
			System.out.println("Linked list is sorted...");
		}
		else {
			boolean swap;
			Node temp;
			Node lastNode = null;
			do {
				swap = false;
				temp = head;
				while (temp.next != lastNode) {
					if(temp.mark < temp.next.mark) {
						int tempReg = temp.regd_no;
						float tempMark = temp.mark;
						temp.regd_no = temp.next.regd_no;
						temp.mark = temp.next.mark;
						temp.next.regd_no = tempReg;
						temp.next.mark = tempMark;
						swap = true;
					}
				}
			}
			while(swap);
			{
				System.out.println("Linked list sorted according to marks in ascending order...");
			}
		}
	}
	//COUNT
	public static int count(Node head) {
		int count=0;
		Node temp= head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	//REVERSE
	public static Node reverse(Node head) {
		Node reverse = null;
		Node present = head;
		Node hold;
		while(present!=null) {
			hold = present.next;
			present.next = reverse;
			reverse = present;
			present = hold;
		}
		System.out.println("Linked list reversed successfully!");
		return reverse;
	}
	//DISPLAY
	public static void display(Node head) {
		Node temp = head;
		if(temp == null) {
			System.out.println("Empty linked list...");
		}
		else {
			System.out.println("Regd.no\t\tMarks");
			while(temp!=null) {
				System.out.println(temp.regd_no + "\t\t" + temp.mark);
				temp = temp.next;
			}
			System.out.println("All list printed...");
		}
	}
	
	public static void main(String[] args)
	{
		Node head = null;
		System.out.println("\n***********MENU***********");
		System.out.println("0 : EXIT");
		System.out.println("1 : Creation");
		System.out.println("2 : Display");
		System.out.println("3 : Insert at the beginning");
		System.out.println("4 : Insert at the end");
		System.out.println("5 : Insert at any position");
		System.out.println("6 : Delete from the beginning");
		System.out.println("7 : Delete from the end");
		System.out.println("8 : Delete from any position");
		System.out.println("9 : Delete by student regd_no");
		System.out.println("10 : Search and update mark");
		System.out.println("11 : Sort the list");
		System.out.println("12 : Count the number of nodes");
		System.out.println("13 : Reverse the Linked List");
		while(true) {
			System.out.println("\nEnter your choice: ");
			int choice = sc.nextInt();
			switch(choice) 
			{
			case 0: 
				System.out.println("Thank You...\nVisit Again...");
				System.exit(0);
			case 1:
				head = create(head);
				break;
			case 2:
				display(head);
				break;
			case 3:
				head = InsBeg(head);
				break;
			case 4:
				head = InsEnd(head);
				break;
			case 5:
				head = InsAny(head);
				break;
			case 6:
				head = DelBeg(head);
				break;
			case 7:
				head = DelEnd(head);
				break;
			case 8:
				head = DelAny(head);
				break;
			case 9:
				head = DelByRegd(head);
				break;
			case 10:
				search(head);
				break;
			case 11:
				sort(head);
				break;
			case 12:
				System.out.println("Number of nodes in the list: " + count(head));
				break;
			case 13:
				head = reverse(head);
				break;
			default:
				System.out.println("Wrong choice!!.... Please enter a valid choice...");
				break;
			}
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	