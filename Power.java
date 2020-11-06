
public class Power {

	public static void main(String[] args) {
		//2 raise to 10
		//2*2*2*2*2*2*2*2*2*2
		int base=2;
		int power=3;
		int result=1;//4<=3
		for(int i=1;i<=power;i++)//4
		{
			result=result*base;//8
		}
		
		System.out.println(result);
		
		System.out.println(Math.pow(3,4));
	}

}
