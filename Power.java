package com.hefshine.Iterative;

public class Power {

	public static void main(String[] args) {
		int base,power,ans=1;
		base=2;
		power=5;
		//1*2=2
		//2*2=4
		//4*2=8
		//8*2=16
		//16*2=32
		//2*2*2*2*2
		
		for(int i=1;i<=power;i++)
		{
			ans=base*ans;
		}
		System.out.println("Power="+ans);
	}

}
