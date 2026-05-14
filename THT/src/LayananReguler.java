// 2. SUBCLASS LAYANANREGULER
// Mewarisi LayananEkspedisi 
class LayananReguler extends LayananEkspedisi {

    public LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    // Overriding metode hitungOngkir() dengan tarif Rp 15.000/kg 
    @Override
    public double hitungOngkir() {
        return 15000.0 * hitungBeratEfektif();
    }

    // Overloading metode hitungOngkir dengan tambahan parameter 
    public double hitungOngkir(boolean isMember, int jarakKm) {
        double tarifDasar = hitungOngkir(); // Panggil metode override di atas 
        
        if (isMember) {
            tarifDasar -= (tarifDasar * 0.10); // Diskon 10% jika member 
        }
        
        // Tambahkan surcharge jarak jauh Rp 500 per km 
        return tarifDasar + (500.0 * jarakKm);
    }
}