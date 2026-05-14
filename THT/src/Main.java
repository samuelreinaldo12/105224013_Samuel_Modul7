import java.util.ArrayList;
// 5. KELAS UTAMA (MAIN) 
public class Main {
    public static void main(String[] args) {
        // Buat ArrayList dengan Upcasting ke Superclass 
        ArrayList<LayananEkspedisi> daftarPengiriman = new ArrayList<>();

        // Memasukkan data
        daftarPengiriman.add(new LayananReguler("REG-11", 2, 50, 50, 50)); 
        daftarPengiriman.add(new LayananExpress("EXP-22", 5, 10, 10, 10)); 
        daftarPengiriman.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100)); 

        // Variabel untuk menyimpan total pendapatan 
        double totalPendapatanPerusahaan = 0.0;

        System.out.println("=== REKAP PENGIRIMAN EKSPEDISI ===");
        
        // Perulangan untuk menelusuri isi koleksi 
        for (LayananEkspedisi layanan : daftarPengiriman) {
            
            // Panggil cetakResi() yang jalan secara polymorphic
            layanan.cetakResi(); 
            
            // Tambahkan ongkir dasar ke total pendapatan
            totalPendapatanPerusahaan += layanan.hitungOngkir(); 

            // instanceof dan Downcasting untuk mengakses metode spesifik subclass 
            if (layanan instanceof LayananReguler) {
                LayananReguler reguler = (LayananReguler) layanan;
                double ongkirFinal = reguler.hitungOngkir(true, 25); 
                System.out.println("   -> Ongkir Final Reguler (Diskon Member & Jarak): Rp" + ongkirFinal);
            } 
            else if (layanan instanceof LayananExpress) {
                LayananExpress express = (LayananExpress) layanan;
                express.klaimAsuransi(1500000);
            } 
            else if (layanan instanceof LayananInternasional) {
                LayananInternasional internasional = (LayananInternasional) layanan;
                internasional.cetakManifest(); 
            }
            
            System.out.println("-------------------------------------------------");
        }

        // Cetak total pendapatan
        System.out.println("Total Pendapatan Perusahaan (Ongkir Dasar): Rp" + totalPendapatanPerusahaan);
    }
}