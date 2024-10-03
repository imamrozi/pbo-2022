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
public class Main {
    public static void main(String[] args) {
        Mahasiswa.spp = 1000;
        
        Mahasiswa mhs1 = new Mahasiswa();
        //mhs1.nim = "02163001";
        mhs1.setNim("02163001");
        //mhs1.nama = "";
        mhs1.setNama("kamu");
        System.out.println(""+mhs1.getNim());
        Mahasiswa.spp = 2000;
    }
}
