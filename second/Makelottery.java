import java.util.Scanner;

public class Makelottery {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		while(num1==num2) {
			num2 = (int)(Math.random()*10);
		}
		System.out.println("The lottery number is "+num1+num2);
	}

}
