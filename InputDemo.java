import java.util.Scanner;
public class InputDemo {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int rollno;
		String name;
		double per;
		char grade;
		//System.out.println("Enter rollno");
		System.out.println("Enter rollno,name,percentage,grade");
		 rollno=sc.nextInt();
		//System.out.println("Enter name");
		name=sc.next();
		//System.out.println("Enter Percentage");
		per=sc.nextDouble();
		//System.out.println("Enter Grade");
		grade=sc.next().charAt(0);//character 
		System.out.println("Name="+name+" Rollno.="+rollno+
				" Percentage="+per+" Grade="+grade);
		
		
		System.out.println("Enter Character");
		char c=sc.next().charAt(0);
		//char c='G';
		if(c>=65 && c<=90) {
			System.out.println("Uppercase");
		}
		if(c>=97 && c<=122)
		{
			System.out.println("LOwercase");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
