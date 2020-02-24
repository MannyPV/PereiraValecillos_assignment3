
public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
	
	
	saver1.setSavingsBalance(2000.0);
	saver2.setSavingsBalance(3000.0);
	SavingsAccount.modifyInterestRate(.04);
	for(int i=0;i<12;i++) {
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	
	System.out.print((i+1+". Month For Saver 1: "));
	System.out.println(saver1.getSavingsBalance());
	
	
	System.out.print((i+1+". Month For Saver 2: "));
	System.out.println(saver2.getSavingsBalance());
	System.out.println(" ");
	}
	
	
	SavingsAccount.modifyInterestRate(.05);
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	System.out.println("New Rate For Saver 1: "+saver1.getSavingsBalance());
	System.out.println("New Rate For Saver 2: "+saver2.getSavingsBalance());
	System.out.println(" ");
	
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	System.out.println("New Month For Saver 1: "+saver1.getSavingsBalance());
	System.out.println("New month For Saver 2: "+saver2.getSavingsBalance());
	
	}
}