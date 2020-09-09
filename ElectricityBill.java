import java.util.Scanner;

/*Consider a situation below of the electricity unit charges. 
Now input electric units by the user and calculate total electricity bill 
according to the given condition.
For first 50 units Rs. 0.50/unit 
For next 100 units Rs.0.75/unit 
For next 100 units Rs. 1.20/unit
For unit above 250 Rs.1.50/unit
An additional surcharge of 20% is added to the bill*/
/*120
 50*0.50+(120-50)*0.75
 bill=150
 totalbill=150+150*0.2;
 230
 50*0.5+100*0.75+(unit-150)*1.2
 
 
 
 
 280
 50*0.5+100*0.75+100*1.20+(280-250)*1.50
*/
public class ElectricityBill {

	public static void main(String[] args) {
		double unit,bill,totalbill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Unit");
		unit=sc.nextDouble();
		if(unit<=50)
		{
			bill=unit*0.5;
		}
		else
		if(unit<=150)
		{
			bill=50*0.5+(unit-50)*0.75;
		}
		else
	      if(unit<=250)
	      {
	    	 bill= 50*0.5+100*0.75+(unit-150)*1.2;
	      }
	      else
	      {
	    	  bill=50*0.5+100*0.75+100*1.20+(unit-250)*1.50;
	      }
		
		totalbill=bill+bill*0.2;
		System.out.println("Bill="+bill+"Total Bill"+totalbill);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
