import java.util.Scanner;

import java.util.ArrayList;
public class C1119 {

	public static void main(String[] args) {
		ArrayList<Container> containers = new ArrayList<>();
		containers.add(new Container());
		System.out.print("Enter the number of the objects: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.print("Enter the weights of the object: ");
		for (int i=0; i<num;i++) {
			double tmp = input.nextDouble();
			boolean in= false;
			for(Container now : containers) {
				if(now.weightLeft>=tmp) {
					now.asses.add(tmp);
					now.weightLeft-=tmp;
					in=true;
					break;
				}
			}
			if(!in) {
				Container j = new Container();
				j.weightLeft-=tmp;
				j.asses.add(tmp);
				containers.add(j);
			}
		}
		int index = 1;
		for (Container jojo:containers) {
			System.out.print("Container "+index+" containers objects with weight ");
			index++;
			for(double j:jojo.asses) {
				System.out.print(j+" ");
			}
			System.out.print('\n');
		}
	}
}
class Container{
	public double weightLeft = 10;
	public ArrayList<Double> asses;
	public Container(){
		asses = new ArrayList<>();
	}
}
