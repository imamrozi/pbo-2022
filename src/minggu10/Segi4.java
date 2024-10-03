/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10;

/**
 *
 * @author Imam F
 */
public class Segi4 extends BangunDatar{
    int p, l;
    @Override
    public void hitungLuas() {
        luas = p*l;
    }

    @Override
    public void hitungKeliling() {
        keliling = 2*(p+l);
    }
    
}
