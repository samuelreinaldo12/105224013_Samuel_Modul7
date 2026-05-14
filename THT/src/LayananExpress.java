// 3. SUBCLASS LAYANANEXPRESS
// Mewarisi LayananEkspedisi 
class LayananExpress extends LayananEkspedisi {

    public LayananExpress(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Overriding metode hitungOngkir() dengan tarif Rp 30.000/kg
    @Override
    public double hitungOngkir() {
        return 30000.0 * hitungBeratEfektif();
    }

    // Metode spesifik untuk klaim asuransi
    public void klaimAsuransi(double nilaiBarang) {
        if (nilaiBarang > 1000000.0) {
            System.out.println("Klaim Asuransi VIP Rp" + nilaiBarang + " untuk resi " + nomorResi + " sedang diproses prioritas.");
        } else {
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja."); 
        }
    }
}