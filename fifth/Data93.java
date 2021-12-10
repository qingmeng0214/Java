import java.util.Date;
public class Data93 {

	public static void main(String[] args) {
		long second = 10000;
		for (int i=0;i<8;i++) {
			Date c = new Date(second);
			System.out.println(c.toString());
			second*=10;
		}

	}

}
