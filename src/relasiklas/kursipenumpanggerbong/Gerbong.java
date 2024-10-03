package relasiklas.kursipenumpanggerbong;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        initKursi(jumlah);
    }
    
    private void initKursi(int jum){
        arrayKursi = new Kursi[jum];
        for(int i=0; i<jum; i++){
           arrayKursi[i] = new Kursi((i+1)+"");
        }
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public void setArrayKursi(Kursi[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }
    
    public void setPenumpang(Penumpang p, int noKursi){
        if(arrayKursi[noKursi-1].getPenumpang()==null){
            arrayKursi[noKursi-1].setPenumpang(p);
        }else{
            System.out.println("Gak boleh!");
        }
    }
    
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info()+'\n';
        }
        return info;
    }
}
