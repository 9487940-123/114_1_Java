public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        try {
            this.setBalance(initialBalance);
        }catch (IllegalArgumentException e){
            System.out.println("初始餘額錯誤: " + e.getMessage()+"初始餘額設為0");
        }
        this.setBalance(initialBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setbalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("Initial balance must be non-negative.");
        }
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if(balance>0){
            this.balance = balance;
        } else {
            System.out.println("Balance must be positive.");
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void  setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }
    public void deposit1(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("存款必須為正數");
        }
    }

    public void withdarw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("提款金額不合法");
        }
    }
}
