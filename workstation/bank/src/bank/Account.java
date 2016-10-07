package bank;

public class Account {
	int id;
	double balance;
	Customer customer;
	public Account(int id, double balance, Customer customer) {
		super();
		this.id = id;
		this.balance = balance;
		this.customer = customer;
		customer.account.add(this);
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	synchronized
	public boolean deposit(double amount) throws Exception{
		if(amount>0){
			this.balance=this.balance+amount;
		}
		else{
		throw new Exception();
		}
		return true;
	}
	synchronized
	public boolean withDraw(double amount){
		
		if(amount>0&&amount<getBalance())
		{
			this.balance=this.balance-amount;
		}
		else
		{
			return false;
		}
		return true;
	}
	
	public void showBalance(){
		System.out.println(getBalance());
	}


}
