package four;


public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("befoer creating objects");
		System.out.println("The number of Circle objrcts is "+ Circle1.numberOfObjects);
		Circle1 c1 = new Circle1();
		
		System.out.println("\nAfter cresting c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle1 objects("
				+ c1.numberOfObjects+ ")" );
		
		Circle1 c2 = new Circle1(5);
		c1.radius = 9;
		 System.out.println("\nAfter cresting c2 and modifying c1");
		 System.out.println("c1: radius (" + c1.radius + ") and number of Circle1 objects("
				+ c1.numberOfObjects+ ")" );
		 System.out.println("c2: radius (" + c2.radius + ") and number of Circle1 objects("
					+ c2.numberOfObjects+ ")" );
	}

}
