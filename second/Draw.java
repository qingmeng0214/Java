import java.util.Scanner;

public class Draw {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of line: ");
		int num = input.nextInt();
		int i,j;
		for(i=1;i<=num;i++) {
			for(j=i;j<=2*num-i;j++) {
					System.out.print(" ");//�ո�
			}
			for(j=i;j>1;j--) {
				System.out.print(" "+j);//��ߵ���
			}
			for(j=1;j<=i;j++) {
				System.out.print(" "+j);//�ұ�����
			}
			System.out.println();
		}
		
		
	}

}
