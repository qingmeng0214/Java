package first;
import java.util.Scanner;
public class ComputeLoan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Enter annual interest rate, e.g., 7.25:");
		double annualInterestRate = input.nextDouble();
		
		double monlyInteresRate = annualInterestRate / 1200;
		System.out.print("Enter annual interest rate, e.g., 5: ");
		int numberOFYears = input.nextInt();
		System.out.print("Enter annual interest rate, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		
		double monthlyPayment =loanAmount * monlyInteresRate / (1- 1/Math.pow(1+ monlyInteresRate, numberOFYears * 12));
		double totalPayment = monthlyPayment * numberOFYears * 12;
		
		System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);

		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
		
		
	}

}
