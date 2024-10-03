package relasiklas.kursipenumpanggerbong;

public class Kursi {
    private String nomer;
    private Penumpang penumpang;

    public Kursi(String nomer) {
        this.nomer = nomer;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }
    
    public String info(){
        String i1 = "Data Kursi:";
        String i2 = "No Kursi = "+nomer;
        String i3 = "";
        if(this.penumpang!=null){
            i3 = this.penumpang.info();
        }
        return i1+'\n'+i2+'\n'+i3;
    }
}
