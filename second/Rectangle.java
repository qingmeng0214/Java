import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		if(Math.abs(y)<=2.5 && Math.abs(x)<=5)
			System.out.println("Point "+"("+x+","+y+")"+" is in the rectangle");
		else
			System.out.println("Point "+"("+x+","+y+")"+" is not in the rectangle");
	}

}
