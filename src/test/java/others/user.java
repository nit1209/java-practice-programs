package others;

public class user {
	
		  
		  public static void main(String[] args) {
		    BankAccount account = new BankAccount(1000);
		    
		    account.deposit(5000);
		    account.withdraw(200);
		    
		    System.out.println("Current balance: " + account.getBalance());
		  }
		}

		


