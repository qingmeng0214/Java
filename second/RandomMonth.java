 import java.util.Scanner;
public class RandomMonth {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int num = (int)(Math.random() * 12 + 1);
		switch (num) {
		case 1: System.out.println(num + " January");break;
		case 2: System.out.println(num + " February");break;
		case 3: System.out.println(num + " March");break;
		case 4: System.out.println(num + " April");break;
		case 5: System.out.println(num + " May");break;
		case 6: System.out.println(num + " June");break;
		case 7: System.out.println(num + " July");break;
		case 8: System.out.println(num + " August");break;
		case 9: System.out.println(num + " September");break;
		case 10: System.out.println(num + " October");break;
		case 11: System.out.println(num + " November");break;
		case 12: System.out.println(num + " December");
		}
	}

}
