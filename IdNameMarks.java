import java.util.Scanner;

public class IdNameMarks {

	public static void main(String[] args) {
	String name;	
	int id;
	float marks;
	System.out.println("Enter Following Details");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Name...");
	name=sc.next();
	System.out.println("Enter Id...");
	id=sc.nextInt();
	System.out.println("Enter Marks...");
	marks=sc.nextFloat();
	System.out.println("Name:- "+name);
	System.out.println("Id:- "+id);
	System.out.println("Marks:- "+marks);

	}

}
