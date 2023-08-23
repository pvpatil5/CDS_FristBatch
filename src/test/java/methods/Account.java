package methods;

public  class Account
{

	 double accBalace = 6000.00;
	
	public void checkBalance() 
	{
		System.out.println("Available Balance="+accBalace);
	}
	
	public void deposit(double dAmount) {
		System.out.println("Deposited Amount="+dAmount);
		accBalace= accBalace+dAmount;
		checkBalance();
	}
	
	public void withdrawl(double withdrawl) {
		System.out.println("Withdrawl Amount="+withdrawl);
		accBalace=accBalace-withdrawl;
		checkBalance();		
	}
	
	
	
}
