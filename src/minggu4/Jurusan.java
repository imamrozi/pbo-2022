/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author Imam F
 */
public class Jurusan {
    private String nama;
    private Dosen d[];
    //langsung instansiasi objek sk
    private SKPendirian sk = new SKPendirian();

    public Jurusan(String nama) {
        this.nama = nama;
        //atau bisa juga dg di bawah ini
        sk = new SKPendirian();
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Dosen[] getD() {
        return d;
    }

    public void setD(Dosen d[]) {
        this.d = d;
    }
    
    public void tampil(){
        System.out.println("Data Jurusan:");
        sk.tampil();
        System.out.println("Nama Jurusan = "+nama);
        for(int i=0;i<d.length;i++){
            d[i].tampil();
        }
    }
}
