package bank;

import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer("dheeraj", "kumar", "pune", "9420026037");
		Bank b =new Bank();
		Random random = new Random();
		for(int i=0; i<10;i++){
			b.addAccount(new Account(i, random.nextInt(100000 - 10000 + 1) + 10000, c));
		}
		
		b.showTotalBalance();
		/*for(Account a:b.account){
			System.out.println(a.id +" "+a.balance);
		}*/
		
		
		for(int i=0;i<1000;i++){
			new Thread(){
				@Override
				public void run() {
					for(int y=0;y<5000000;y++){
						int toaccount;
						int fromaccount;
						toaccount=random.nextInt(9 - 0 + 1);
						fromaccount=random.nextInt(9 - 0 + 1);
						int amount=random.nextInt((100 - 10 + 1)+10)+1;
						try {
							Bank.transferAmount(b.account.get(toaccount), b.account.get(fromaccount),amount);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}
			}.start();
		}
		
		new Thread(){
			@Override
			public void run() {
				try {
					this.sleep(100000);
					double balance=0;
					for(Account a:b.account){
						balance=balance+a.balance;
					}
					b.showTotalBalance();
					System.out.println(balance);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}
}
