package masterclass.challange;

import java.math.BigDecimal;

public class Account {

	private String accoutNumber;
	private  BigDecimal balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	
	
	
	public Account(String accoutNumber, BigDecimal balance, String customerName, String email, String phoneNumber) {
		super();
		this.accoutNumber = accoutNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double amount) {
		balance=balance.add(BigDecimal.valueOf(amount));
		StringBuilder sb= new StringBuilder();
		sb.append(amount);
		sb.append(" dollars deposited on your account.\n");
		sb.append("Your current balance is ");
		sb.append(balance);
		sb.append(" dollars\n");
		System.out.println(sb);
	}
	
	public void withdraw(double amount) {
		if(this.balance.compareTo(new BigDecimal(amount))>0) {
		balance=balance.add(BigDecimal.valueOf(-amount));
		StringBuilder sb= new StringBuilder();
		sb.append(amount);
		sb.append(" withdrawed from your account.\n");
		sb.append("Your current balance is ");
		sb.append(balance);
		sb.append(" dollars\n");
		System.out.println(sb);
		}else {
			System.out.println("Insufficient funds\n");
		}
	}

	public String getAccoutNumber() {
		return accoutNumber;
	}

	public void setAccoutNumber(String accoutNumber) {
		this.accoutNumber = accoutNumber;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
