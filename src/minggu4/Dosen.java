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
public class Dosen {
    private String nip, nama;

    public Dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void tampil(){
        System.out.println("Data Dosen:");
        System.out.println("NIP = "+nip+", Nama = "+nama);
    }
    
    public void pinjam(KTAKoperasi kta){
        kta.cekStatus();
        kta.hitungPotongan();
    }
}
