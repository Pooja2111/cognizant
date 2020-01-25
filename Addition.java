package methodoverloading;

 class Overloading {
	int add(int a, int b)
	{
		return a+b;
	}
	double add(double a,int b)
	{
		return a+b;
	}
	double add(int a,double b)
	{
		return a+b;
	}
}
	public class Addition{

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Overloading a=new Overloading();
		System.out.println(a.add(1,2));
		System.out.println(a.add(1.2,6));
		System.out.println(a.add(2,2.3));
	}
	}


