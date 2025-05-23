package assignment5;

public class Exception3B {

	// Define a user-defined exception
	class InsufficientFundsException extends Exception {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InsufficientFundsException(String message) {
	        super(message);
	    }
	}

	// Define a class that uses the user-defined exception
	class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        }
	    }

	    public void withdraw(double amount) throws InsufficientFundsException {
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
	        }
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	}
