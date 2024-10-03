package q1;

public class Buku {
    private String kode, judul, pengarang;
    private int thnTerbit;

    public Buku() {
    }

    public Buku(String kode, String judul, String pengarang, int thnTerbit) {
        this.kode = kode;
        this.judul = judul;
        this.pengarang = pengarang;
        this.thnTerbit = thnTerbit;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getThnTerbit() {
        return thnTerbit;
    }

    public void setThnTerbit(int thnTerbit) {
        this.thnTerbit = thnTerbit;
    }
    
    public void tampilData(){
        System.out.println("Kode Buku: "+kode);
        System.out.println("Judul Buku: "+judul);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Tahun Terbit: "+thnTerbit);
    }
}
