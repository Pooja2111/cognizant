package com;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Pooja";
		String s1="Prakash";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("equal");
		}
			else
			{
		System.out.println("Not equal");
		//System.out.println(count);
			}
		

	}

}
