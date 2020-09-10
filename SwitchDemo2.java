import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=0;
	do
	{
	System.out.println("Enter name");
	String day=sc.next();
	switch(day)
	{
	case "Mon":System.out.println("1st day");
	break;
	case "Tue":System.out.println("2st day");
	break;
	case "Wedn":System.out.println("3st day");
	break;
	default:System.out.println("Invalid day");
	
	}
	System.out.println("Press 0 to continue");
	n=sc.nextInt();
	}while(n==0);
	System.out.println("end");
}
}
