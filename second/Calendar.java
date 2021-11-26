import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("Year: ");
		int year = input.nextInt();
		System.out.println("Week: ");
		int week = input.nextInt();
		String[] months = {"January","February","March","April","May","June",
				"July","August","September","Qctober","November","Deceber"};
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year%400==0 || (year%4==0 && year%100!=0))
			days[1]=29;
		int i;
		for(i=1;i<=12;i++) {
			System.out.println();
			System.out.printf("            %s%d              \n",months[i-1],year);
			System.out.printf("______________________________\n");
			System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
			for(int k=0;k<week;k++) {
				System.out.printf("    ");
			}
			int count =0;
			int j;
			for(j=1;j<=days[i-1];j++) {
				System.out.printf("%4d",j);
				count+=1;
				if(week+j==7) {
					System.out.printf("\n");
					count=count-j;
				}				
				if(count%7==0&&count!=0)
					System.out.printf("\n");
			}
			week=(week+days[i-1]) % 7;
		}
		
		
	}

}
