package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<Payment> payments = new ArrayList<>();

        items.add(new Item("Laptop", 12000000));
        items.add(new Item("Smartphone", 7000000));
        items.add(new Item("Smart TV", 8500000));

        boolean running = true;

        while (running) {
            System.out.println("\n===== MENU PEMBELIAN ELEKTRONIK =====");
            System.out.println("1. Lihat Daftar Barang");
            System.out.println("2. Pesan Barang");
            System.out.println("3. Lihat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            if (menu == 1) {
                System.out.println("\n--- Daftar Barang ---");
                for (int i = 0; i < items.size(); i++) {
                    System.out.println((i + 1) + ". " + items.get(i).getName() + " - Rp" + items.get(i).getPrice());
                }

            } else if (menu == 2) {
                System.out.println("\n--- Pesan Barang ---");
                for (int i = 0; i < items.size(); i++) {
                    System.out.println((i + 1) + ". " + items.get(i).getName() + " - Rp" + items.get(i).getPrice());
                }

                System.out.print("Pilih barang (nomor): ");
                int index = input.nextInt() - 1;

                if (index < 0 || index >= items.size()) {
                    System.out.println("Pilihan tidak valid!");
                } else {
                    Item selected = items.get(index);

                    System.out.println("Pilih metode pembayaran:");
                    System.out.println("1. Cash");
                    System.out.println("2. Credit");
                    System.out.print("Masukkan pilihan: ");
                    int method = input.nextInt();

                    if (method == 1) {
                        System.out.print("Masukkan jumlah uang: Rp");
                        int cash = input.nextInt();
                        Cash cashPayment = new Cash(selected, cash);
                        cashPayment.pay();
                        payments.add(cashPayment);
                    } else if (method == 2) {
                        System.out.print("Masukkan jumlah cicilan maksimal: ");
                        int cicilan = input.nextInt();
                        Credit creditPayment = new Credit(selected, cicilan);
                        creditPayment.pay();
                        payments.add(creditPayment);
                    } else {
                        System.out.println("Metode pembayaran tidak dikenal!");
                    }
                }

            } else if (menu == 3) {
                System.out.println("\n--- Daftar Transaksi ---");
                if (payments.isEmpty()) {
                    System.out.println("Belum ada transaksi.");
                } else {
                    for (Payment p : payments) {
                        System.out.println("Barang: " + p.getItem().getName() +
                                " | Total: Rp" + p.getItem().getPrice() +
                                " | Sisa: Rp" + p.getRemainingAmount() +
                                " | Lunas: " + p.getIsPaidOff());
                    }
                }

            } else if (menu == 0) {
                System.out.println("Terima kasih telah menggunakan sistem pembelian!");
                running = false;

            } else {
                System.out.println("Pilihan tidak tersedia!");
            }
        }

        input.close();
    }
}
