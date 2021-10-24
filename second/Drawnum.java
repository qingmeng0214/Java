import java.util.Scanner;

public class Drawnum {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int i,j;
		for(i=0;i<8;i++) {
			for(j=i;j<15-i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print(" "+(int)(Math.pow(2,j)));
			}
			for(j=i;j>=0;j--) {
				System.out.print(" "+(int)(Math.pow(2,j)));
			}
			System.out.print("\n");
		}
	}

}
