import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.println("Enter month: 1-12: ");
		int m = input.nextInt();
		System.out.println("Enter the day of the month: 1-31: ");
		int q = input.nextInt();
		if(m==1||m==2) {
			m=m+12;
			year = year - 1;
		}
		int j = year / 100;
		int k = year % 100;
		int h = (q + (26* (m+1) / 10) + k + k/4 +j/4 +5*j) % 7;
		switch (h) {
		case 0: System.out.println("Day of the week is Saturday");break;
		case 1: System.out.println("Day of the week is Sunday");break;
		case 2: System.out.println("Day of the week is Monday");break;
		case 3: System.out.println("Day of the week is Tuesday");break;
		case 4: System.out.println("Day of the week is Wednesday");break;
		case 5: System.out.println("Day of the week is Thursday");break;
		case 6: System.out.println("Day of the week is Friday");
		}
	}

}
