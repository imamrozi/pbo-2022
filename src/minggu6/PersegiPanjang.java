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
public class PersegiPanjang extends BangunDatar{
    int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    void hitungLuas(){
        luas = panjang*lebar;
    }
    @Override
    void hitungKeliling(){
        keliling = 2*(panjang+lebar);
    }
}
