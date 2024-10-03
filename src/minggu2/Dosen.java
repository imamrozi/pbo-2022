/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author Imam F
 */
public class Dosen {
    String nip, nama;
    Mahasiswa mhs;
    
    void setNilaiMahasiswa(){
        mhs.setNilai();
    }
    public static void main(String[] args) {
        Dosen d = new Dosen();
        d.mhs = new Mahasiswa();
        d.mhs.mk = new Matakuliah();
        d.setNilaiMahasiswa();
        
       
    }
}
