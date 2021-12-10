import java.util.GregorianCalendar;
public class GregorianCalendar95 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(g.get(GregorianCalendar.YEAR)+"年"+
				g.get(GregorianCalendar.MONTH)+"月"+g.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		g.setTimeInMillis(1234567898765L);
		System.out.println(g.get(GregorianCalendar.YEAR)+"年"+
				g.get(GregorianCalendar.MONTH)+"月"+g.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		}

}
