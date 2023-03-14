import java.util.Scanner;

public class calculatorusingswitch {

	public static void main(String[] args) {
		int x,y,z;
		String choice;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter Two Numbers...");
x=sc.nextInt();
y=sc.nextInt();
System.out.println("Enter Your Choice(+,-,*,/)");
choice=sc.next();
switch(choice) {
case "+":
	z=x+y;
	System.out.println("Addition Is = "+z);
	break;
case "-":
	z=x-y;
	System.out.println("Substraction is = "+z);
	break;
case "/":
	z=x/y;
	System.out.println("Divison Is = "+z);
	break;
case "*":
	z=x*y;
	System.out.println("Multiplication is = "+z);
	break;
	default:
	System.out.println("Wrong Choice!!!!!");
}
	}

}
