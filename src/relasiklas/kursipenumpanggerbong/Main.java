package relasiklas.kursipenumpanggerbong;

public class Main {
    public static void main(String[] args) {
        Gerbong g=new Gerbong("Ekonomi-1", 2);
        g.setPenumpang(new Penumpang("01", "Danang"), 1);
        g.setPenumpang(new Penumpang("02", "Pamungkas"), 1);
        System.out.println(""+g.info());
        g.getArrayKursi()[1].setPenumpang(new Penumpang("02", "Pamungkas"));
        System.out.println(""+g.info());
        System.out.println(""+g.getArrayKursi()[1].getPenumpang().getNama());
    }
    
}
