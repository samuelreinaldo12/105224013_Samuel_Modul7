public class LampuPintar extends PerangkatPintar {
    
    public void aturKecerahan(int level) {
        System.out.println("Kecerahan lampu diatur ke level " + level + "%.");
    } 

    public void aturKecerahan(int level, String warna) {
        System.out.println("Kecerahan lampu diatur ke level " + level + "% dengan warna cahaya " + warna + ".");
    }

    @Override
    public void aktifkan() {
        System.out.println("Lampu menyala dengan tingkat kecerahan standar.");
    }
} 