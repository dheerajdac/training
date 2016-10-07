package bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	String firstName;
	String lastName;
	String address;
	String phoneNo;
	List<Account> account = new ArrayList<Account>();
	public Customer(String firstName, String lastName, String address, String phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNo = phoneNo;
	}
}
