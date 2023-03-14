import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
    int a,b,c;
    System.out.println("Enter A Number:");
Scanner sc= new Scanner(System.in);
a=sc.nextInt();
b=a/10;
c=a%10;
a=b+c*10;
System.out.println("Reverse Number Is:"+a);
	}
}
