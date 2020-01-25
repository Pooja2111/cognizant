package Shapeclass;

public class Shape {
int shapeId;
String shapeName;
public int getShapeId() {
	return shapeId;
}
public void setShapeId(int shapeId) {
	this.shapeId = shapeId;
}
public String getShapeName() {
	return shapeName;
}
public void setShapeName(String shapeName) {
	this.shapeName = shapeName;
}
public Shape(int shapeId, String shapeName) {
	super();
	this.shapeId = shapeId;
	this.shapeName = shapeName;
}
public Shape() {
	super();
	// TODO Auto-generated constructor stub
}

}
