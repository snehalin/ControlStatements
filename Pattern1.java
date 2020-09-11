package com.hefshine.Iterative;

public class Pattern1 {

	public static void main(String[] args) {
		/*
		 * System.out.print("*"); System.out.print("*"); System.out.print("*");
		 * System.out.print("*"); System.out.print("*");
		 */
		
		
	for(int j=1;j<=10;j++)      ///rows
	{
		for(int i=1;i<=5;i++)   //columns
			{
				System.out.print("*");
			}
		System.out.println();
	}

		/*
		*               
		**
		***
		****
		*****
		*/
	
	
	System.out.println("____________________________");
	
	
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	/*
	  *
	 ** 
	*** 
   ****
  *****
	 */
	
	System.out.println("____________________________");
	
	for(int i=1;i<=5;i++)
	{
			/*
			 * for(int k=5-i;k>=1;k--)
			 *  { System.out.print("$");
			 *   }
			 */
		for(int k=1;k<=5-i;k++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
/*	
	*****
	****
	***
	**
	*
	*
*/
	System.out.println("_______________________________");
	for(int i=1;i<=5;i++)
	{
		
		for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
		
	System.out.println("_______________________________");	
	
	/*
	 12345
	 12345
	 12345
	 12345
	 
	 
	 */
	
	for(int i=1;i<=5;i++)
	{
		
		for(int j=1;j<=5;j++)
		{
			System.out.print(j);//
		}
		System.out.println();
	}
	
	System.out.println("________________________");
	
	for(int i=1;i<=5;i++)
	{
		
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	
	
	/*
	 A
	 AB
	 ABC
	 ABCD
	 ABCDE
	 */
		
		  
		  for(int i=1;i<=5;i++)
		  {
			  char ch='A';
		    for(int j=1;j<=i;j++)
		     {  
		    	System.out.print(ch); 
		    	ch++;
		     } 
		  System.out.println(); 
		  
		  }
		  
	/*
	ABCDE
	ABCD
	ABC
	AB
	A
		*/
		  
	System.out.println("______________________");	  
		  
	for(int i=1;i<=5;i++)
	{ 
		char ch='A';
		
		for(int j=5;j>=i;j--)
		{
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}	  
		  
/*
 ABCDE
  BCDE
   CDE
    DE
     E
  		  
 */
	char ch='A';
	char temp=ch;
	for(int i=1;i<=5;i++)
	{ ch=temp;
		for(int s=1;s<i;s++)//space
		{
			System.out.print(" ");
		}
		for(int j=5;j>=i;j--)//characters
		{
			System.out.print(ch);
			ch++;//ch=ch+1
		}
		System.out.println();
		
		temp++;
	}
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
