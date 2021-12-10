
public class RegularPolygon99 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RegularPolygon a = new RegularPolygon();
		RegularPolygon b = new RegularPolygon(6,4);
		RegularPolygon c = new RegularPolygon(10,4,5.6,7.8);
		System.out.println(a.getPerimeter()+" "+a.getArea());
		System.out.println(b.getPerimeter()+" "+b.getArea());
		System.out.println(c.getPerimeter()+" "+c.getArea());
	}

}


class RegularPolygon
{
	private int n=3;
	private double side=1;
	private double x=0;
	private double y=0;
	RegularPolygon(){
		n=3;
		side=1;
	}
	public RegularPolygon(int num,double len) {
		this.n=num;
		this.side=len;
	}
	public RegularPolygon(int num,double len,double x,double y) {
		this.n=num;
		this.side=len;
		this.x=x;
		this.y=y;
		
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n=n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side=side;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x=x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y=y;
	}
	public double getPerimeter() {
		return n*side;
	}
	public double getArea() {
		return n*side*side/(4*Math.tan(Math.PI/n));
	}
	
	
	
}