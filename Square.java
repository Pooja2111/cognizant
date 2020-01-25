package Shapeclass;

public class Square extends Shape{
	int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Square(int shapeId, String shapeName, int length) {
		super(shapeId, shapeName);
		this.length = length;
	}

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Square [length=" + length + "]";
	}
	int Calculate()
	{
		return length*length;
	}
}

