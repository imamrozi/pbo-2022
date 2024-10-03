/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

public class Member {
    private String id, nama;
    private Buku[] buku;

    public Member(String id, String nama, Buku[] buku) {
        this.id = id;
        this.nama = nama;
        this.buku = buku;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Buku[] getBuku() {
        return buku;
    }

    public void setBuku(Buku[] buku) {
        this.buku = buku;
    }
    
    public void tampilData(){
        System.out.println("ID Member: "+id);
        System.out.println("Nama: "+nama);
        for(Buku b:buku){
            b.tampilData();
        }
    }
    
    public void tampilBukuTerbaru(){
        int thnMax = buku[0].getThnTerbit();
        for(int i=1;i<buku.length;i++){
            if(buku[i].getThnTerbit()>thnMax){
                thnMax = buku[i].getThnTerbit();
            }
        }
        System.out.println("Buku Terbaru:");
        for(int i=0;i<buku.length;i++){
            if(buku[i].getThnTerbit()==thnMax){
                buku[i].tampilData();
            }
        }
        
    }
}
