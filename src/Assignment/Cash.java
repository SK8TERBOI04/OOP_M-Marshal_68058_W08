package Assignment;

public class Cash extends Payment {
    private int cashAmount;

    public Cash(Item item, int cashAmount) {
        super(item);
        this.cashAmount = cashAmount;
    }

    @Override
    public int pay() {
        if (cashAmount >= item.getPrice()) {
            isPaidOff = true;
            System.out.println("Pembayaran tunai untuk " + item.getName() + " berhasil. Barang sudah lunas.");
            return item.getPrice();
        } else {
            System.out.println("Uang tidak mencukupi untuk membayar " + item.getName());
            return 0;
        }
    }

    @Override
    public int getRemainingAmount() {
        if (isPaidOff) return 0;
        return item.getPrice() - cashAmount;
    }
}

