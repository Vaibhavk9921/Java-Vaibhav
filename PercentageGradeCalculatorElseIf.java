import java.util.Scanner;

public class PercentageGradeCalculatorElseIf {

	public static void main(String[] args) {
		float Science,Maths,English,Marathi,Hindi,History,Geography,Total;
		System.out.println("Enter Marks Of Given Seven Subjects..");
Scanner sc=new Scanner(System.in);
System.out.println("1) Science:-");
Science=sc.nextFloat();
System.out.println("2) Maths:-");
Maths=sc.nextFloat();
System.out.println("3) English:-");
English=sc.nextFloat();
System.out.println("4) Marathi:-");
Marathi=sc.nextFloat();
System.out.println("5) Hindi:-");
Hindi=sc.nextFloat();
System.out.println("6) History:-");
History=sc.nextFloat();
System.out.println("7) Geography:-");
Geography=sc.nextFloat();
Total=(Science+Maths+English+Marathi+Hindi+History+Geography)/7;
System.out.println("Total Marks Obtained Are:-"+Total);
System.out.println("Grades Is:-");
if(Total>=90) {
	System.out.println("A Grade");
}
else if(Total>=80) {
	System.out.println("B Grade");
}
else if(Total>=70) {
	System.out.println("C Grade");
}
else if(Total>=60) {
	System.out.println("D Grade");
}
else if(Total>=40) {
	System.out.println("E Grade");
}
else{
	System.out.println("Failed!!!!");
}

	}

}
