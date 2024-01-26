package Assignment2;

abstract class Account {
	int accountNUmber;
	int balance;
	String ownerName;
	
	


	

	@Override
	public String toString() {
		return "Account [accountNUmber=" + accountNUmber + ", balance=" + balance + ", ownerName=" + ownerName + "]";
	}

	abstract void depositMoney(int amount);
	
	abstract void withdrawMoney(int amount);
	
	abstract void displayAccountDetails();
	
}
