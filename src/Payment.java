public abstract class Payment {
    protected String paymentId;
    protected double amount;

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public abstract void processPayment();

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }
}
