/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6;

/**
 *
 * @author Imam F
 */
public class Pegawai {
    
    int kodePegawai;
    String nip, nama, alamat;
    int gaji;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }
    public int getGaji(){
        return gaji;
    }
    
    public Pegawai(){
        super();
        System.out.println("konstruktor default Pegawai");
    }
}
