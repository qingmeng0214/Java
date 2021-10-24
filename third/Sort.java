import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int num = input.nextInt();
        int[] a = new int[num];
        System.out.print("Enter the contents of the list: ");
        for(int i=0;i<num;i++)
            a[i]=input.nextInt();
        System.out.print("The list has "+num+" integer(s) ");
        for(int i=0;i<num;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        if(isSorted(a))
        	System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");
	}
	
	public static boolean isSorted(int[] list) {
		int len=list.length;
		if(len==1||len==0)
			return true;
		else {
			for(int i=0;i<len-1;i++) {
				if(list[i]>list[i+1])
					return false;
			}
		}
		return true;
	}

}
