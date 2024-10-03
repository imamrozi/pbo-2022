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
public class Main {
    public static void main(String[] args) {
        Tester t = new Tester();
        System.out.println(""+(t instanceof Tester));
        
        PersegiPanjang pp = new PersegiPanjang(10, 5);
        pp.hitungKeliling();
        pp.hitungLuas();
        System.out.println(""+pp.luas);
        System.out.println(""+pp.keliling);
    }
}
