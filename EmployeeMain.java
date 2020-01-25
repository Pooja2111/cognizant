package Employee;

public class EmployeeMain{

	public static void main(String args[])
	{
		WageEmployee e=new WageEmployee(101,23900,"Pooja","Hyderabad",new Address(21,123,"xyz"),31,34);
		System.out.println(e.calculate());
		System.out.println(e);
	}
	
}
