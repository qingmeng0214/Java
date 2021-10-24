import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int i,j;
		for(i=1;i<=10000;i++) {
			int sum = 0;
			for(j=1;j<i;j++) {
				if(i%j==0)
					sum=sum+j;
			}
			if(sum==i)
				System.out.printf("%d  ",i);
		}
		
		
	}

}
