package Shapeclass;

public class Rectangle extends Shape  {
int length;
int width;
@Override
public String toString() {
	return "Rectangle [length=" + length + ", width=" + width + ", shapeId=" + shapeId + ", shapeName=" + shapeName
			+ "]";
}
public int getLength() {
	return length;
}

public void setLength(int length) {
	this.length = length;
}

public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}
public Rectangle(int shapeId,String shapeName,int length, int width) {
	super(shapeId,shapeName);
	this.length = length;
	this.width = width;
}

public Rectangle() {
	super();
	// TODO Auto-generated constructor stub
}
public int calculate()
{
	return width*length;
}

}
