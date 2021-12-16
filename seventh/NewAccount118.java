import java.util.ArrayList;
import java.util.Date;
public class NewAccount118 {

	public static void main(String[] args) {
		Account ass = new Account(1122,1000,"George");
	    ass.deposit(30,"1st dep");
	    ass.deposit(40,"2nd dep");
	    ass.deposit(50,"3rd dep");
	    ass.withDraw(5,"1st wdw");
	    ass.withDraw(4,"2nd wdw");
	    ass.withDraw(2,"3rd wdw");
	    System.out.print("name :"+ass.getName()+" rate: "+ass.getAnnualInterestRate()+" balance: "+ass.getBalance()+"\n");
	    for(Transaction dick:ass.transactions) {
	        System.out.println("date: "+dick.date);
	        System.out.println("type: " + dick.type);
	        System.out.println("amount: "+dick.amount);
	        System.out.println("new balance: "+dick.balance);
	        System.out.println("description: "+dick.description);
        }
	}
}

class Account
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private String name;
	ArrayList<Transaction> transactions ;
	public Account()
	{
		this.id=0;
		this.balance=0 ;
		this.annualInterestRate=0;
		this.dateCreated= new Date();
		this.transactions = new ArrayList<Transaction>();
	}
	public Account(int id,double b)
	{
		this.id=id;
		this.balance=b;
		this.annualInterestRate=0;
		this.dateCreated= new Date();
		this.transactions = new ArrayList<Transaction>();
	}
	public Account(int id,double b,String name)
	{
		this.id=id;
		this.balance=b;
		this.annualInterestRate=0;
		this.dateCreated= new Date();
		this.name=name;
		this.transactions = new ArrayList<Transaction>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double b) {
		this.balance=b;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double a) {
		this.annualInterestRate=a;
	}
	public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return annualInterestRate/12*balance;
    }
    public void withDraw(double m,String ass){
        balance-=m;
        transactions.add(new Transaction('W',m,balance,ass));
    }
    public void deposit(double m,String ass){
        balance+=m;
        transactions.add(new Transaction('D',m,balance,ass));
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }

}

class Transaction{
    public Date date;
    public char type;
    public double amount;
    public double balance;
    public String description;
    public Transaction(char t,double am,double bl,String des){
        date=new Date();
        type=t;
        amount=am;
        balance=bl;
        description=des;
    }
}

