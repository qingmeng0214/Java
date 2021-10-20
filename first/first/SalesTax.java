package first;
import java.util.Scanner;
	
public class SalesTax {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount * 0.06;
		System.out.println("Sales tax is $" + (int)(tax *100) / 100.0);
		

	}

}
