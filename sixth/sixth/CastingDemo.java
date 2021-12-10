package sixth;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Object object1 = new Circle112(1);
		Object object2 = new Rectangle113(1,1);
		
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object object) {
		if(object instanceof Circle112) {
			System.out.println("The circle area is " + 
					((Circle112)object).getArea());
			System.out.println("The circle diameter is "+ 
					((Circle112)object).getDiameter());
		}
		else if(object instanceof Rectangle113) {
			System.out.println("The rectangle area is "+ 
					((Rectangle113)object).getArea());
		}
	}

}
