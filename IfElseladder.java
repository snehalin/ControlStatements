import java.util.Scanner;

/*
 percentage of the marks. Find the grade according to following:
a. Percentage >= 90% : Grade A
b. Percentage >= 80% : Grade B
c. Percentage >= 70% : Grade C
d. Percentage >= 60% : Grade D
e. Percentage >= 40% : Grade E
f. Percentage < 40% : Grade F
 */
public class IfElseladder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 subjects marks:");
				int m1=sc.nextInt();
				int m2=sc.nextInt();
				int m3=sc.nextInt();
		
			int total=m1+m2+m3;
			double per=total*0.3;
			System.out.println("Per="+per);
		if(per>=90)
			System.out.println("A Grade");
		else if(per>=80)
			System.out.println("B Grade");
		else if(per>=70)
			System.out.println("C Grade");
		else if(per>=60)
			System.out.println("D Grade");
		else if(per>=50)
			System.out.println("E Grade");
		else
			System.out.println("F Grade");

	}

}
