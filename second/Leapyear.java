import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		int i;
		int sum =0;
		for(i=101;i<=2100;i++) {
			if( i % 400==0 || (i%4==0 && i%100!=0)) {
				sum=sum+1;
				System.out.print(i+"  ");
			}
			if(sum%10==0) {
				System.out.println();
			}		
		}
		System.out.println("101��2100���ڼ����������Ϊ�� "+sum);
	}

}
