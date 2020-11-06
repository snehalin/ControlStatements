import java.util.Scanner;

// 0 1 1 2 3 5 8 13 21 34
  //         a b c
public class FibonacciSeries {

	public static void main(String[] args) {
		int a,b,c=0;
		a=0;
		b=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n=sc.nextInt();
		System.out.print(a+" "+b+" ");//0 1 
		//int n=10;
		
		int i=1;
		while(i<=n-2)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
		
		
		
		
		
		
		
		/*while(c<=20)
		{
		c=a+b;//c=8+13  =21
		if(c<=20)
		System.out.print(c+" ");
		a=b;//8
		b=c;//13
		}*/
		
		
		
		
		
		
		
		
		

	}

}
