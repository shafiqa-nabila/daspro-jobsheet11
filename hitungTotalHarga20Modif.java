import java.util.Scanner;

public class hitungTotalHarga20Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan (atau ketik 0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            System.out.print("Masukkan kode promo (jika ada): ");
            sc.nextLine();
            String kodePromo = sc.nextLine();

            int totalHarga = hitungTotalHarga20(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;

            System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
        }

        System.out.println("Total keseluruhan pesanan: Rp" + totalKeseluruhan);
        sc.close();
    }

    public static int hitungTotalHarga20(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        if (pilihanMenu < 1 || pilihanMenu > hargaItems.length) {
            System.out.println("Pilihan menu tidak valid.");
            return 0;
        }

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal / 2;
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = (int)(hargaTotal * 0.7);
            System.out.println("Anda mendapat diskon 30%.");
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid. Tidak ada pengurangan total harga.");
        }
        return hargaTotal;
    }
}