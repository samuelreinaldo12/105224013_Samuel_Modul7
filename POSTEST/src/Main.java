import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // 1. Buat ArrayList bertipe MetodePembayaran (Menerapkan konsep Upcasting)
        ArrayList<MetodePembayaran> daftarPembayaran = new ArrayList<>();

        // 2. Masukkan minimal satu objek EWallet dan satu objek KartuKredit
        MetodePembayaran ovo = new EWallet();
        MetodePembayaran visa = new KartuKredit();

        daftarPembayaran.add(ovo);
        daftarPembayaran.add(visa);

        System.out.println("=== DEMONSTRASI PAYMENT GATEWAY ===");

        // 3. Gunakan perulangan untuk menelusuri koleksi
        for (MetodePembayaran metode : daftarPembayaran) {
            
            // a. Mendemonstrasikan Runtime Polymorphism
            metode.bayar(100000.0);

            // b. Menggunakan instanceof dan Downcasting
            if (metode instanceof EWallet) {
                // Downcasting ke EWallet
                EWallet eWalletSpesifik = (EWallet) metode;
                // Memanggil versi overloading
                eWalletSpesifik.bayar(50000.0, "081234567890"); 
                
            } else if (metode instanceof KartuKredit) {
                // Downcasting ke KartuKredit
                KartuKredit ccSpesifik = (KartuKredit) metode;
                // Memanggil metode spesifik
                ccSpesifik.verifikasiPIN();
            }
            
            System.out.println("-------------------------------------------------");
        }
    }
}