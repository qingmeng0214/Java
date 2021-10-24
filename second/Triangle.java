import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three sides of a triangle: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		if( x+y>z && x+z>y && y+z>x)
			System.out.println("The circagon of the triangle is: "+(x+y+z));
		else
			System.out.println("Invalid input");
		
	}

}
