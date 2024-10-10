package BestPractice;

public class KendaraanMain {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        Becak b = new Becak();
        Motor mt = new Motor();

        m.kecepatan = 100;
        b.kecepatan = 15;
        mt.kecepatan = 60;

        m.infoKendaraan("Mobil", m.getWarna());
        b.infoKendaraan("Becak", b.getWarna());
        mt.infoKendaraan("Motor", mt.getWarna());

    }
}
