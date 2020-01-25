package AbstractExample;
 
class AirAutomobile implements Fly
{
	double speed=20;
	String modelNo;
    void setModelNo(String modelNo) {
    	this.modelNo=modelNo;
    }
	String show()
	{
		return modelNo;
	}
	
	@Override
	public int Fly(int a) {
		// TODO Auto-generated method stub
		return 0;
	}
}
interface Fly
{
	int Maxspeed=100;
	int Fly(int a);
}

public class InterfaceExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AirAutomobile a=new AirAutomobile();
a.setModelNo("Airbus12345");
System.out.println("Aeroplane name is "+a.show());
System.out.println("Aeroplane is flying with"+a.fly(40));
System.out.println("Maxspeed of aeroplane is "+Fly.Maxspeed);
	}
}
