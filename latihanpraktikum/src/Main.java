import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {

        ArrayList<PerangkatPintar> daftarPerangkat = new ArrayList<>();

        PerangkatPintar lampu = new LampuPintar();
        PerangkatPintar ac = new AcPintar();

        daftarPerangkat.add(lampu);
        daftarPerangkat.add(ac);

        System.out.println("=== HASIL SOAL 3: ===");
        for (PerangkatPintar p : daftarPerangkat) {
            p.aktifkan();
        }

        System.out.println("\n=== HASIL SOAL 2: ===");
        if (lampu instanceof LampuPintar) {
            LampuPintar lampuSpesifik = (LampuPintar) lampu;

            lampuSpesifik.aturKecerahan(60);
            lampuSpesifik.aturKecerahan(85, "Kuning Hangat");
        }
    }
}