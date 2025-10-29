package Assignment;

public class Credit extends Payment {
    private int installment;
    private int maxInstallmentAmount;

    public Credit(Item item, int maxInstallmentAmount) {
        super(item);
        this.maxInstallmentAmount = maxInstallmentAmount;
        this.installment = 0;
    }

    @Override
    public int pay() {
        if (isPaidOff) {
            System.out.println("Cicilan untuk " + item.getName() + " sudah lunas.");
            return 0;
        }
        installment++;
        int amount = item.getPrice() / maxInstallmentAmount;
        System.out.println("Pembayaran cicilan ke-" + installment + ": Rp" + amount);
        if (installment >= maxInstallmentAmount) {
            isPaidOff = true;
        }
        return amount;
    }

    @Override
    public int getRemainingAmount() {
        if (isPaidOff) return 0;
        return item.getPrice() - (item.getPrice() / maxInstallmentAmount * installment);
    }
}
