package Assignment2;
import java.util.ArrayList;

import Assignment2.*;
public class AccountManager {
	
	ArrayList<Account> ac = new ArrayList<>();
	
	void addNewCheckingAccount(CheckingAccount a)
	{
		ac.add(a);
	}
	void addNewSavingAcct(SavingAccount s) {
		ac.add(s);
	}
	
	void displayAllAccount()
	{
		System.out.println(ac);
	}
	public static void main(String[] args)
	{
		
		AccountManager am = new AccountManager();
		
		CheckingAccount c1 = new CheckingAccount();
		c1.accountNUmber=1;
		c1.balance=100;
		c1.ownerName="Aditi";
		
		
		
		am.addNewCheckingAccount(c1);
		am.displayAllAccount();
		
		
	}

}
