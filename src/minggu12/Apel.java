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
public class Apel extends Buah implements Kupas {

    @Override
    public void dikupas() {
        System.out.println("pakai pisau");
    }
    void dipetik(){
        System.out.println("Apel dipetik");
    }
    void dirasa(){
        System.out.println("Apel dirasa");
    }
    void dijual(){
        System.out.println("Apel dijual");
    }
    void dikeripik(){
        System.out.println("Keripik apel");
    }
}
