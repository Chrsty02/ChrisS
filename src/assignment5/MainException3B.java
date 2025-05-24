package assignment5;

// Define Exception3B as a top-level class
class MainException3B {
    // BankAccount class as a static nested class
    public static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    // InsufficientFundsException class as a static nested class
    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}
