package Shapeclass;

public class Circle extends Shape{
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(int shapeId, String shapeName, double radius) {
		super(shapeId, shapeName);
		this.radius = radius;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int shapeId, String shapeName) {
		super(shapeId, shapeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", shapeId=" + shapeId + ", shapeName=" + shapeName + "]";
	}
	double Calculate()
	{
		return 3.14*radius*radius;
	}
	

}
