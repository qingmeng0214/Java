import java.util.Scanner;
public class Octal {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();
		int num=0;
		int i=0;
		while(a>0) {
			num=num*10+a%8;
			a=a/8;
			i+=1;
		}
		for(int j=0;j<i;j++) {
			System.out.printf("%d",num%10);
			num=num/10;	
		}	
	}

}
