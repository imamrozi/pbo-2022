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
public class Dosen extends Pegawai{
    int jumSks;
    public static int TARIF_SKS = 35000;

    public void setJumSks(int jumSks) {
        this.jumSks = jumSks;
    }

    public int getGaji() {
        return super.getGaji()+(jumSks*TARIF_SKS);
    }
    
}
