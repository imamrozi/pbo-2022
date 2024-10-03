package relasiklas.sopirpelangganmobil;

public class Mobil {
    private String nama;
    private int biaya;

    public Mobil() {
    }

    public Mobil(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobil(int hari){
        return hari*biaya;
    }
}
