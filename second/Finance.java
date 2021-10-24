import java.util.Scanner;

public class Finance {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		double sum = 0;
		int i;
		double money = 10000.0;
		for(i=0;i<10;i++) {
			money = money * 0.05 + money;
		}
		System.out.println("Tuition in ten years: "+money+"$");
		for(i=0;i<4;i++) {
			money = money * 0.05 + money;
			sum = sum + money;
		}
		System.out.println("Tuition for four years is "+sum+"$");
	}

}
