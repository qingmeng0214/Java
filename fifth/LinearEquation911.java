import java.util.Scanner;
import java.util.Scanner;
public class LinearEquation911 {

	public static void main(String[] args) {
		System.out.print("Enter a b c d e f: ");
		Scanner input = new Scanner(System.in); 
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation ass = new LinearEquation(a,b,c,d,e,f);
        if(!ass.isSolvable()) {
        	System.out.println("The equation has no solution.");
        }
        else
        	System.out.println(ass.getX()+" "+ass.getY());
	}

}

class LinearEquation
{
	private double a,b,c,d,e,f;
	public LinearEquation(double a,double b,double c,double d,double e,double f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	public boolean isSolvable() {
		return a*b-b*c!=0;
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
	
	
}