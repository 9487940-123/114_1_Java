public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("A12345", 1000.0);

        //System.out.println("帳戶號碼:" + account1.getAccountNumber());
        //System.out.println("初始餘額:" + account1.getBalance());


        System.out.println("帳戶密碼:%s%n初始餘額: %.2f%n" + account1.getAccountNumber() + account1.getBalance());
        System.out.println("帳戶密碼:%s%n初始餘額: %.2f%n" + account1.getAccountNumber() + account1.getBalance());

        account1.deposit(500.0);
        System.out.println("存款:%s%n目前餘額: %.2f%n" + account1.getBalance());

        account1.withdraw(1000.0);
        System.out.println("帳戶密碼:%s%n初始餘額: %.2f%n" + account1.getBalance());


        try {
            account1.deposit1(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("錯誤訊息:" + e.getMessage());
        }

        try {
            account1.withdraw(-2000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("錯誤訊息:" + e.getMessage());
        }
    }
}

