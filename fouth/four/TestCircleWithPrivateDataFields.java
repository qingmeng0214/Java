package four;


public class TestCircleWithPrivateDataFields{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Circle2 myCircle = new Circle2(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + 
				" is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + 
				" is " + myCircle.getArea());
		System.out.println("The number of objects created is " + Circle2.getNumberOfObjects());
	}

}
