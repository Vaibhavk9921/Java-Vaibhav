import java.util.Scanner;

public class MaxNumberAmong3ElseIf {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter Three Numbers..");
	Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	if(a>b && a>c) {
		System.out.println("First One Is Maximum.");
	}
	else if(b>a && b>c) {
		System.out.println("Second One Is Maximum");
	}
	else {
		System.out.println("Third One Is Maximum");
	}
		}

	}

