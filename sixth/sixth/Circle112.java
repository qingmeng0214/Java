package sixth;

public class Circle112 extends GeometricObject{
	private double radius;
	
	public Circle112() {
	}
	
	public Circle112(double radius) {
		this.radius=radius;
	}
	
	public Circle112(double radius, String color , boolean filled) {
		this.radius=radius;
		setColor(color);
		setFilled(filled);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public double getDiameter() {
		return 2*radius;
	}
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	public void printCircle112() {
		System.out.println("The ciecle is created "+ 
				getDateCreated()+ " and the radius is "+ radius);
	}
}
