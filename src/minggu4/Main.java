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
public class Main {
    public static void main(String[] args) {
        Jurusan j = new Jurusan("Teknologi Informasi");
        j.tampil();
        
        
        Dosen d1 = new Dosen("1", "Adam");
        Dosen d2 = new Dosen("2", "Alis");
        Dosen d3 = new Dosen("3", "Anto");
        Dosen[] data = {d1,d2,d3};
        j.setD(data);
        j.tampil();
    }
}
