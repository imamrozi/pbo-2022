package relasiklas.sopirpelangganmobil;

public class Main {
    public static void main(String[] args) {
        Sopir s = new Sopir("Danang", 1000);
        Mobil m = new Mobil("Pajero", 5000);
        Pelanggan p = new Pelanggan("Pamungkas", 5, m, s);
        System.out.println("Biaya Total = "+p.hitungBiayaTotal());
        System.out.println("Nama Pelanggan = "+p.getNama());
        System.out.println("Nama mobil = "+p.getMobil().getNama());
    }
}
