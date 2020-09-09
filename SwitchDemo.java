import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number");
		int dayno=sc.nextInt();
		switch(dayno)
		{
		case 1+1:System.out.println("Tueday");
	       break;
		case 3:System.out.println("Sunday");
		       break;
		case 4:System.out.println("Monday");
		       break;
		case 5:System.out.println("Thurday");
	       break;
		case 6:System.out.println("Wednsday");
	       break;
		
		case 1:System.out.println("Friday");
	       break;
		case 7:System.out.println("Saturday");
	       break;
	     	
		default:System.out.println("Enter day  no. between 1-7");
		}
		
		
		System.out.println("have a nice day");

	}

}
