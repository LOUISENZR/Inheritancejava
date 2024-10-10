package BestPractice;

public class Kendaraan {
    public int kecepatan;

    public void infoKendaraan(String jenis, String warna) {
        System.out.println(jenis);
        System.out.println("Dengan warna " + warna);
        System.out.println("Berada pada kecepatan " + kecepatan + " km/jam");
        System.out.println("============================================");
    }
}

