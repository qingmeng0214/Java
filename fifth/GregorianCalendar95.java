import java.util.GregorianCalendar;
public class GregorianCalendar95 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		GregorianCalendar g = new GregorianCalendar();
		System.out.println(g.get(GregorianCalendar.YEAR)+"��"+
				g.get(GregorianCalendar.MONTH)+"��"+g.get(GregorianCalendar.DAY_OF_MONTH)+"��");
		g.setTimeInMillis(1234567898765L);
		System.out.println(g.get(GregorianCalendar.YEAR)+"��"+
				g.get(GregorianCalendar.MONTH)+"��"+g.get(GregorianCalendar.DAY_OF_MONTH)+"��");
		}

}