package com.constructor;

public class BankAccount {
	double balance;
	String customerName;
	String Address;
	public BankAccount(double balance,String customerName ,String Address) {
		System.out.println("-----parameterized constructor----");
		balance=balance;
	 customerName =customerName;
	    Address=Address;
	}
	public BankAccount() {
		System.out.println("-----non parameterized constructor-------");
		balance =0;
		customerName="NA";
		Address="NA";		
	}
	public void withdraw(double amount) {
		if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal failed.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        }
    }
		
	
	public void deposit(double amount) {
		if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }
		
		public void updateAddress(String newAddress) {
	        Address = newAddress;
	        System.out.println("Address updated successfully to: " + newAddress);
	    }

	   
	    public void updateCustomerName(String newCustomerName) {
	        customerName = newCustomerName;
	        System.out.println("Customer name updated successfully to: " + newCustomerName);
	    }

	    
	     public void displayAccountInfo() {
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Address: " + Address);
	        System.out.println("Balance: " + balance);
	    }
	 public static void main(String[] args) {
	      
	        BankAccount account = new BankAccount(1000.0, "Alice", "123 Street");
	        account.deposit(5000.0);
            account.deposit(1000.0);
            account.withdraw(500.0);
            account.withdraw(1500.0);
            account.updateCustomerName("Alice reddy");
	        account.updateAddress("456 Abids");
            account.displayAccountInfo();
	    
	}
	}


