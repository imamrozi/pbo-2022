/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author Imam F
 */
public class Mahasiswa {
    private String nim, nama;
    static int spp;

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static int getSpp() {
        return spp;
    }

    public static void setSpp(int spp) {
        Mahasiswa.spp = spp;
    }
    
    
    
    
}
