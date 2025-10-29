public class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String paymentId, double amount, String cardNumber, String cardHolderName) {
        super(paymentId, amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount: Rp" + amount);
        System.out.println("Payment Successful!\n");
    }
}
