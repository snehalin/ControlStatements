package com.hefshine.Iterative;
/*
 ABCDEFGFEDCBA
 ABCDEF FEDCBA//1   s=1; s=s+2;
 ABCDE   EDCBA//3
 ABCD     DCBA//5
 ABC       CBA//7
 AB         BA//9 spaces
 A           A//11
 */
public class Pattern3 {

	public static void main(String[] args) {
		char ch='A';
		
		  for(int i=1;i<=7;i++) { System.out.print(ch);//ch 
		  ch++;
		  } ch--;//g
		  ch--;//f
		  
		  for(int i=1;i<=6;i++) { 
			  System.out.print(ch);//ch 
			  ch--;
		  }
		  
		 
		
		
		System.out.println();
		int n=6;
		int s=1;
		for(int i=1;i<=6;i++)
		{
			ch='A';
			for(int j=1;j<=n;j++) //ABCDE
			{
				System.out.print(ch);//e
				ch++;   //f
			}
			for(int k=1;k<=s;k++)//space
			{
				System.out.print(" ");
			}
			ch--;//f
			for(int k=1;k<=n;k++)//EDCBA
			{
				System.out.print(ch);
				ch--;
			}
			n--;//5,4
			s=s+2;//s=3
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

	}

}
