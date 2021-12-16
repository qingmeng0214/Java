import java.util.Scanner;
import java.util.ArrayList;
public class Square1117 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		int oldm = m;
		ArrayList<Integer> divides = new ArrayList<>();
		while(m!=1) {
			for (int i=2;i<=m;i++) {
				if(m%i==0) {
					divides.add(i);
					m/=i;
					break;
				}
			}
		}
		int n=1;
		int s =1;
		for( int j:divides) {
			if(occur(divides,j)%2==1&&j!=s) {
				n*=j;
				s=j;
			}
		}
		System.out.println("The smallest number n for m*n to be a perfect square is "
				+n+" m*n is "+oldm*n);

	}
	public static int occur(ArrayList<Integer> l,int k) {
		int count = 0;
		for(int f:l) {
			if(f==k)
				count++;
		}
		return count;
	}

}
