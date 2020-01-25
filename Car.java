package Automobile;

class Car {
	int carnumber;
	int run()
	{
		return 50;
	}
}
class Fordcar extends Car
{
	int run()
	{
		return super.run()+40;
	}
}
class Automobile
{
	public static void main(String args[]) {
     Fordcar f=new Fordcar();
     System.out.println(f.run());
	}
}
     
     
     
     
     
     
     
     
     
     
     
}