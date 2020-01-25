package Shapeclass;

public class Shapemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(2,"rectangle",2,3);
		System.out.println(r.calculate());
		System.out.println(r);
		Square s=new Square(2,"square",2);
		System.out.println(s.Calculate());
		System.out.println(s);
		Circle c=new Circle(2,"circle",2);
		System.out.println(c.Calculate());
		System.out.println(c);

	}

}
