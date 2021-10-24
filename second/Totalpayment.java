import java.util.Scanner;
public class Totalpayment {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 Scanner input = new Scanner(System.in);
	        System.out.print("Loan Amount: ");
	        double amount = input.nextDouble();
	        System.out.print("Number of Years: ");
	        int years = input.nextInt();
	        System.out.println("Interest Rate      Monthly Payment      Total Payment");
	        int i;
	        for(i=0;i<=24;i++) {
	        	 double rate = (0.125*i+5)/1200;
	             double monthMoney = amount*rate/(1-1/Math.pow(1+rate,years*12));
	             System.out.printf("%-4.3f%%             %-5.2f               %-7.2f\n",0.125*i+5,monthMoney,monthMoney*12*years);
	             
	        }
	}

}
