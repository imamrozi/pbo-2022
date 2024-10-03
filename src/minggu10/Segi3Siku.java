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
public class Segi3Siku extends BangunDatar{
    int a, t;
    @Override
    public void hitungLuas() {
        luas = 0.5*a*t;
    }
    public void hitungLuas(int x) {
        luas = 0.5*a*t;
    }

    @Override
    public void hitungKeliling() {
        double sm = Math.sqrt((a*a)+(t*t));
    }
    
}
