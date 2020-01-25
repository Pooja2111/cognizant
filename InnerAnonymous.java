package com;
 
abstract class Eatable
{
 abstract void eat();
}   

public class InnerAnonymous {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Eatable e=new Eatable() {
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("nice");
	}
};
e.eat();
	}

}
