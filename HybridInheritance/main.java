package HybridInheritance;

public class main {
    public static void main(String[] args) {
        jenis b1 = new jenis();
        System.out.println(b1.jam() + " banyak " + b1.nama() 
        + " di " + b1.tempat());

        Pembeli p1 = new Pembeli();
        System.out.println("Pembeli " + p1.kegiatan() 
        + " di " + p1.tempat());
    }
}
