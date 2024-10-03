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
public class C extends B{
    public void show(){
        System.out.println("C");
    }
    void tes(){
        show();
        super.show();
        super.show2();
    }
    public static void main(String[] args) {
        new C().tes();
    }
}
