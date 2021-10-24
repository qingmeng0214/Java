import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int d1,d2,d3,d4,d5,d6,d7,d8,d9;
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int num = input.nextInt();
		d1 = num / 100000000;
		d2 = num / 10000000 % 10;
		d3 = num / 1000000 % 10;
		d4 = num / 100000 % 10;
		d5 = num / 10000 % 10;
		d6 = num / 1000 % 10;
		d7 = num / 100 % 10;
		d8 = num / 10 % 10;
		d9 = num % 10;
		
		int d10 = (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9) % 11;
		if(d10==10) 
			System.out.println("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
		
		else
			System.out.print("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
		
	}

}
