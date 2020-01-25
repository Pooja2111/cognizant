package Access;

public class A {

 protected static int a;
}
class B extends A
{
	public static void main(String[] args)
	{
System.out.println(A.a);	
	}
}
