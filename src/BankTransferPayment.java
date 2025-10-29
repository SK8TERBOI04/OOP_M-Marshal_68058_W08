public class BankTransferPayment extends Payment {
    private String bankAccount;
    private String accountName;

    public BankTransferPayment(String paymentId, double amount, String bankAccount, String accountName) {
        super(paymentId, amount);
        this.bankAccount = bankAccount;
        this.accountName = accountName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing bank transfer...");
        System.out.println("Account Name: " + accountName);
        System.out.println("Bank Account: " + bankAccount);
        System.out.println("Amount: Rp" + amount);
        System.out.println("Payment Successful!\n");
    }
}
