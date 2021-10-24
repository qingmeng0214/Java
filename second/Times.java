import java.util.Scanner;

public class Times {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 Scanner input = new Scanner(System.in);
	        System.out.print("Loan Amount: ");
	        double amount = input.nextDouble();
	        System.out.print("Number of Years: ");
	        double years = input.nextDouble();
	        System.out.print("Annual Interest Rate: ");
	        double rate = input.nextDouble();
	        double monthrate = rate/1200;
	        double monpay = amount*monthrate/(1-1/(Math.pow(1+monthrate, 12*years)));
	        double total = monpay*years*12;
	        System.out.printf("Month Payment: %.2f\n",monpay);
	        System.out.printf("Total Payment: %.2f\n",total);
	        System.out.println("Payment# Interset  Principle Balance");
	        double balance = amount ;
	        int i;
	        for(i=1;i<=years*12;i++) {
	        	double interset = monthrate*balance;
	        	double principle = monpay-interset;
	        	balance =balance - principle;
	        	System.out.printf("%d\t\t %.2f\t\t%.2f\t\t%.2f\n", i,interset,principle,balance);
	        }
	}

}
