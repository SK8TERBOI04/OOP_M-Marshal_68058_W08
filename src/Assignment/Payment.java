package Assignment;

public abstract class Payment {
    protected Item item;
    protected boolean isPaidOff;

    public Payment(Item item) {
        this.item = item;
        this.isPaidOff = false;
    }

    public abstract int pay();
    public abstract int getRemainingAmount();

    public boolean getIsPaidOff() {
        return isPaidOff;
    }

    public Item getItem() {
        return item;
    }
}

