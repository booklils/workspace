
public class tester {
	public static void main(String args[]){
		BankAccount myAccount = new BankAccount(1000,"Hinata Shouyou");
		myAccount.deposit(505.22);
		System.out.println(myAccount.balance());
		myAccount.withdraw(100);
		System.out.println("The Hinata Shouyou account is, " + myAccount.balance());
	
		
		
	}
}
