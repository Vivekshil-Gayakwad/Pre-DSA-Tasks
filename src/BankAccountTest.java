public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        long accountNo= b1.getAccountNo();
        System.out.println(accountNo);
        b1.setAccountNo(2345678);
        long accountNo2= b1.getAccountNo();
        System.out.println(accountNo2);

    }
}
