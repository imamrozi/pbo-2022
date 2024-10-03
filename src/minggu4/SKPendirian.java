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
public class SKPendirian {
    private String nomor, tanggal, isi;

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
    
    public void tampil(){
        System.out.println("Data SK=");
        System.out.println("Nomor="+nomor);
        System.out.println("Tanggal="+tanggal);
        System.out.println("Isi="+isi);
    }
    
}
