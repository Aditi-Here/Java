package Assignment2;

public class CheckingAccount extends Account {
	

	
	void depositMoney(int amount)
	{
		balance +=amount;
		
	}
	void withdrawMoney(int amount)
	{
		balance -= amount;
	}
	void displayAccountDetails()
	{
		System.out.println("Account Number is : "+accountNUmber);
		System.out.println("Owner name is : "+ownerName);
		System.out.println("Balance is : "+ balance);
	}
	

}
