import java.util.ArrayList;

// 1. SUPERCLASS LAYANANEKSPEDISI
// Kelas induk untuk semua jenis layanan ekspedisi
class LayananEkspedisi {
    // Menggunakan access modifier 'protected' agar atribut bisa diakses langsung oleh subclass 
    protected String nomorResi;
    protected double beratAktualKg;
    protected double panjang, lebar, tinggi;

    // Konstruktor untuk menginisialisasi atribut 
    public LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Metode untuk menghitung berat efektif (terbesar antara aktual vs volumetrik)
    public double hitungBeratEfektif() {
        // Rumus volumetrik = (P x L x T) / 6000 
        double volumetrik = (panjang * lebar * tinggi) / 6000.0;
        // Mengembalikan nilai tertinggi
        return Math.max(beratAktualKg, volumetrik);
    }

    // Metode untuk mencetak resi dan berat efektif 
    public void cetakResi() {
        System.out.println("Nomor Resi: " + nomorResi + " | Berat Efektif: " + String.format("%.2f", hitungBeratEfektif()) + " kg");
    }

    // Metode polymorphic yang akan dioverride di subclass 
    public double hitungOngkir() {
        return 0.0;
    }
}