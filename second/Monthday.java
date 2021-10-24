import java.util.Scanner;

public class Monthday {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("Year: ");
		int year = input.nextInt();
		System.out.println("Week: ");
		int week = input.nextInt();
		String[] months = {"January","February","March","April","May","June",
				"July","August","September","Qctober","November","Deceber"};
		String[] weeks = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%400==0 || (year%4==0 && year%100!=0))
			days[1]=29;
		int i;
		for(i=1;i<=12;i++) {
			System.out.printf("%s 1, %d is %s\n", months[i-1],year,weeks[week]);
			week=(week+days[i-1]) % 7;
		}
		
	}
}
