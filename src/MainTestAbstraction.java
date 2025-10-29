import Assignment.Cash;
import Assignment.Item;
import Assignment.Payment;

public class MainTestAbstraction {
    public static void main(String[] args) {
        Item laptop = new Item("Laptop", 12000000);
        Payment cashPayment = new Cash(laptop, 12000000);
        cashPayment.pay();
    }
}
