import java.util.Scanner;

public class hitungTotalHarga20 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
    int pilihanMenu = sc.nextInt();
    System.out.print("Masukkan jumlah item yang ingin dipesan: ");
    int banyakItem = sc.nextInt();
    System.out.print("Masukkan kode promo (jika ada): ");
    String kodePromo = sc.nextLine();


    int totalHarga = hitungTotalHarga20(pilihanMenu, banyakItem, kodePromo);

    System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
}

    public static int hitungTotalHarga20(int pilihanMenu, int banyakItem, String kodePromo) {
        
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal / 2; // Diskon 50%
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = (int)(hargaTotal * 0.7); // Diskon 30%
            System.out.println("Anda mendapat diskon 30%.");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid. Tidak ada pengurangan total harga.");
        }
        return hargaTotal;
    }
}

