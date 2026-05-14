// 4. SUBCLASS LAYANANINTERNASIONAL
// Mewarisi LayananEkspedisi 
class LayananInternasional extends LayananEkspedisi {
    // Atribut tambahan khusus untuk internasional 
    private String negaraTujuan;
    private double nilaiBarangUSD;

    public LayananInternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    // Overriding metode hitungOngkir() dengan tarif Rp 200.000/kg
    @Override
    public double hitungOngkir() {
        double tarifDasar = 200000.0 * hitungBeratEfektif();
        
        // Pajak 20% jika nilai barang > 50 USD 
        if (nilaiBarangUSD > 50.0) {
            tarifDasar += (tarifDasar * 0.20); 
        }
        
        return tarifDasar; // Total ongkir dasar + pajak 
    }

    // Metode spesifik untuk cetak manifest 
    public void cetakManifest() {
        System.out.println("Manifest Internasional ke " + negaraTujuan + " - Deklarasi Nilai: $" + nilaiBarangUSD);
    }
}