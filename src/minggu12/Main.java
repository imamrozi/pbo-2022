/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12;

/**
 *
 * @author Imam F
 */
public class Main {
    public static void main(String[] args) {
        Buah b = new ApelFuji();
        b = new Pisang();
        
        Kupas ku = new Apel();
        ku = new Roti();
        ku = new ApelFuji();
        
        makanBuah(new Apel());
        makanBuah(new Pisang());
        makanBuah(new ApelFuji());
        
        makan(new Apel());
        makan(new Roti());
        makan(new ApelFuji());
        
        //proses(new Apel());
        proses(new Pisang());
    }
    
    static void makanBuah(Buah b){
    
    }
    static void makan(Kupas ku){
        
    }
    static void proses(Buah b){
        b.dijual();
        b.dipetik();
        b.dirasa();
        if(b instanceof Pisang){
            Pisang p = (Pisang)b;
            p.digoreng();
        }else if(b instanceof Apel){
            Apel a = (Apel)b;
            a.dikeripik();
        }
    }
}
