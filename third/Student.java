import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        String[] name = new String[num];
        System.out.print("Enter the names of the students: ");
        for(int i=0;i<num;i++)
        	name[i]=input.next();
        int[] score = new int[num];
        System.out.print("Enter the scores of the students: ");
        for(int i =0;i<num;i++)
        	score[i]=input.nextInt();
        int[] rank = new int[num];
        //排序
        for(int i=0;i<num;i++)
        	rank[i]=score[i];
        int min,temp;
    	int i,j;
    	for(i=0;i<num;i++){
    		min=i;
    		for(j=i+1;j<num;j++){
    			if(rank[j]>rank[min])
    			min=j;
    		}
    		if(i!=min){
    			temp=rank[i];
    			rank[i]=rank[min];
    			rank[min]=temp;
    		}
    	}
        for(i=0;i<num;i++) {
        	for(j=0;j<num;j++) {
        		if(rank[i]==score[j])
        			System.out.print(name[j]+" ");
        	}
        }
	}

}
