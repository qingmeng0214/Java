import java.util.Scanner;

public class Readnum {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] a = new int[100];
        int n = 0;
        System.out.print("Enter  numbers: ");
        int tmp=input.nextInt();
        while(tmp!=0) {
            boolean in = false;
            for(int j=0;j<n;j++)
            {
                if(a[j]==tmp)
                {
                    in=true;
                    break;
                }
            }
            if(!in)
            {
                a[n]=tmp;
                n++;
            }
            tmp=input.nextInt();
        }
        
        System.out.println("The number of distinct number is "+n);
        System.out.print("The distinct numbers are: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");

	}

}
