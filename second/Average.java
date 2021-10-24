import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten number: ");
		double average=0;
		double sum=0;
		double v=0;
		double variance;
		for(int i=0;i<10;i++) {
			double n = input.nextDouble();
			sum=sum+n;
			v=v+n*n;
		}
		average = sum/10;
		variance = Math.sqrt((v-sum*sum/10)/9);
		System.out.printf("The mean is %.2f\n", average);
		System.out.printf("The standard deviation is %.5f", variance);
	}

}
