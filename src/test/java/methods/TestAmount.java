package methods;

public class TestAmount {

	public static void main(String[] args) {
		
		Account pavan = new Account();
		pavan.checkBalance();
		
		pavan.deposit(2000);
		
		pavan.withdrawl(3000);
		
		System.out.println("================");
		
		Account ram = new Account();
		ram.checkBalance();
		ram.withdrawl(1000);
		ram.deposit(3000);
		

	}

}
