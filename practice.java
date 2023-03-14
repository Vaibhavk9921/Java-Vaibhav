import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
int a,b,c;
System.out.println("Enter A Two Digit Number");
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
b=a/10;
c=a%10;
a=b+c;
System.out.println(a);

	}

}
