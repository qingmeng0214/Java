import java.util.Scanner;

public class SecondISBN {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int num = input.nextInt();
		int sum=0;
		int temp=num;
		for(int i=9;i>=1;i++) {
			sum= sum +num%10*i;
			num=num/10;
		}
		int a=sum%11;
        System.out.printf("The ISBN-10 number is %09d",temp);
        if(a<10)
            System.out.println(a);
        else
            System.out.println("X");

	}

}
