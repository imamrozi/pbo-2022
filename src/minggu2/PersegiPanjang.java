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
public class PersegiPanjang {
    int panjang, lebar, hasil;
    
    void hitungLuas(){
        hasil= panjang*lebar;
    }
    
    public static void main(String[] args) {
        PersegiPanjang p = new PersegiPanjang();
        p.panjang = 10;
        p.lebar = 20;
        System.out.println("Luas = "+p.hitungLuas());
    }
}
