package com;

public class Add {
	static void addition(int... num)
	{
		int n=0; 
		System.out.println("display method)");
		for(int a:num)
		{
			n=n+a;
		}
			System.out.println(n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(1,2);
        addition(1,2,3,4,5,6); 
	}

}
