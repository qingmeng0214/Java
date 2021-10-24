import java.util.Scanner;

public class Draw {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of line: ");
		int num = input.nextInt();
		int i,j;
		for(i=1;i<=num;i++) {
			for(j=i;j<=2*num-i;j++) {
					System.out.print(" ");//空格
			}
			for(j=i;j>1;j--) {
				System.out.print(" "+j);//左边倒序
			}
			for(j=1;j<=i;j++) {
				System.out.print(" "+j);//右边正序
			}
			System.out.println();
		}
		
		
	}

}
