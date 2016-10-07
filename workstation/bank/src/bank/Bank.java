package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	static double totalBalance=0;
	List<Account> account = new ArrayList<Account>();
	
	public static void transferAmount(Account toAccount,Account fromAccount,double amount) throws Exception{
		if(fromAccount.withDraw(amount))
			toAccount.deposit(amount);
	}
	
	public static void showTotalBalance(){
		System.out.println(totalBalance);
	}
	
	public void addAccount(Account account) {
		this.account.add(account);
		if(account.getBalance()>0){
			totalBalance=totalBalance+account.getBalance();
		}
	}
}
