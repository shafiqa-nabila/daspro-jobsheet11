public class PengunjungCafe20 {

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
}