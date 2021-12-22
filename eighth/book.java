

public class book {
	public int id;
	public String name;
	public double price;
	public String press;
	public book() {
		super();
	}
	public book(int id, String name, double price,String press) {
		super();
		this.id=id;
		this.name=name;
		this.press=press;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getPress() {
		return press;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPress(String press ){
		this.press=press;
	}
	
	@Override
	public String toString() {
		return  id +"\t"+name+"\t"+press+
				"\t"+price;
	}
}
