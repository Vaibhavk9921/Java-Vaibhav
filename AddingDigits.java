import java.util.Scanner;

public class AddingDigits {

	public static void main(String[] args) {
int a,b,c;
System.out.println("Enter A Number...");
Scanner sc= new Scanner(System.in);
a=sc.nextInt();
b=a%10;
c=a/10;
a=b+c;
System.out.println("Addition Is=" +a);
	}

}
