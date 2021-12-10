import java.util.Random;
public class Time96 {

	public static void main(String[] args) {
		int[] num = new int[1000];
		Random r = new Random(1000);
		StopWatch timer = new StopWatch();
		
		for( int i=0;i<num.length;i++) {
			num[i]=r.nextInt(100);
		}
		
		timer.start();
		for (int i = 0; i < num.length; i++) {
            int minIndex = i;
            for (int j = i; j < num.length; j++) {
                if (num[j]<num[minIndex]){
                    minIndex = j;
                }
            }
            int temp = num[i];
            num[i] = num[minIndex];
            num[minIndex] = temp;
        }
		timer.stop();
		System.out.println(timer.getElapsedTime());
	}

}

class StopWatch
{
	private long startTime;
	private long endTime;
	StopWatch(){
		this.startTime=System.currentTimeMillis();
	}
	public void start() {
		this.startTime=System.currentTimeMillis();
	}
	public void stop() {
		this.endTime=System.currentTimeMillis();
	}
	public long getElapsedTime() {
		return this.endTime-this.startTime;
	}
}