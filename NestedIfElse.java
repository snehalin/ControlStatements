
public class NestedIfElse {

	public static void main(String[] args) {
		int a=30,b=70,c=50;
		

		if(a>b)
		{
			if(a>c)
			System.out.println(a+"is greatest");
			else
			System.out.println(c+"is greatest");	
		}
		else //b>a
		{
			if(b>c)
				System.out.println(b+"is greatest");
			else
				System.out.println(c+"is greatest");
		}
	}

}
