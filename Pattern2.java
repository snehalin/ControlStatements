package com.hefshine.Iterative;

public class Pattern2 {

	public static void main(String[] args) {
		/*
		12345
		1234
		123
		12
		1
		12
		123
		1234
		12345
		*/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
			
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=1+i;j++)
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
	 12345	
	 */
		System.out.println("__________________________");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)// int i=4;i>=1;i--
		{
			for(int j=5-i;j<=5;j++)//j=i;j<=5;j++
			{
				System.out.print(j);
		}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
