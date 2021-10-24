import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double d = y+0.5*x;
		double a = d;
		double b = 2*d;
		 
		if(x<=200 && y<=100 && x>=0 && y>=0 && a*a+b*b<=100*100+200*200)
			System.out.println("The point is in the triangle");
		else
			System.out.println("The point is not in the triangle");		
					
	}

}
