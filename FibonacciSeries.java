package com.hefshine.Iterative;



/*
 0 1 1 2 3 5 8 13
 
 *
 *
 *
 */

public class FibonacciSeries {

	public static void main(String[] args) {
		
	int	a,b,c=0;
	a=0;
	b=1;
	System.out.print(a+" "+b);
	//c=a+b;//1
		/*
		 * a=b;//a=1 b=c;//b=2
		 * 
		 * c=a+b;
		 * 
		 * a=b;// a=1 b=c;// b=1
		 * 
		 * c=a+b;//c=2
		 */
	while(c<13) {
		c=a+b;
		System.out.print(" "+c);
		a=b;//a=1;
		b=c;//b=2
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
