package relasiklas.kursipenumpanggerbong;

public class Penumpang {
    private String ktp, nama;

    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String info(){
        String i1 = "Data Penumpang: ";
        String i2 = "Nama = "+nama;
        String i3 = "No KTP = "+ktp;
        return i1+'\n'+i2+'\n'+i3;
    }
}
