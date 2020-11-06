/*
 *****
 *****
 *****
 *****
 *****
 */
public class Pattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=5;j++)//col
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	System.out.println("______________________________");	
		
	for(int i=1;i<=5;i++)//row
	{
		for(int j=1;j<=5;j++)//col //12345
		{
			System.out.print(j);
		}
		System.out.println();
	}
		
		
	System.out.println("______________________________");	
	
	for(int i=1;i<=5;i++)//row
	{
		for(int j=1;j<=5;j++)//col //
		{
			System.out.print(i);//11111
		}                       //22222
		System.out.println();
	}
		
	System.out.println("______________________________");	
	
	for(int i=10;i<15;i++)//row
	{
		for(int j=5;j>=1;j--)//col
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}	
		
		
	System.out.println("______________________________");	
	
	for(int i=1;i<=5;i++)//row
	{              //1<=4
		for(int j=1;j<=i;j++)//col //1     i=1 j=1
		{                          //12    i=2 j=1,2
			System.out.print(j);   //123
		}                          //1234
		System.out.println();      //12345
	}
		
	/*
	12345
	1234
	123
	12
	1
	 	
	 */
	
	System.out.println("______________________________");	
	
	for(int i=1;i<=5;i++)//row
	{
		for(int j=1;j<=6-i;j++)//col 
		{
			System.out.print(j);
		}
		System.out.println();
	}
	/*
	54321
	5432
	543
	54
	5
	*/
	
	
	
	
	System.out.println("______________________________");	
	
	for(int i=1;i<=5;i++)//row
	{
		for(int j=5;j>=i;j--)//col //12345
		{
			System.out.print(j);
		}
		System.out.println();
	}
	/*
	12345
	2345
	345
	45
	5
	45
	345
	2345
	12345*/
	System.out.println("______________________________");	
	for(int i=1;i<=5;i++)//row
	{
		for(int j=i;j<=5;j++)//col //12345
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
	for(int i=4;i>=1;i--)//row
	{
		for(int j=i;j<=5;j++)//col //
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
	
	
	
	
	
		
	}

}
