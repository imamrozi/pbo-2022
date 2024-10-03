/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author Imam F
 */
public class Main {
    public static void main(String[] args) {
        Buku b1 = new Buku("B01","OOP","Pengarang 1", 2020);
        Buku b2 = new Buku("B02","Web","Pengarang 2", 2018);
        Buku b3 = new Buku("B03","Pancasila","Pengarang 3", 2020);
        
        Buku b[] = {b1,b2,b3};
        Member m = new Member("M01", "Member 1", b);
        
        m.tampilData();
        m.tampilBukuTerbaru();
    }
}
