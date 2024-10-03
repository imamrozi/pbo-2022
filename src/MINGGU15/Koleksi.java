/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MINGGU15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Imam F
 */
public class Koleksi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList data = new ArrayList();
        while(true){
            int i = sc.nextInt();
            if(i==-1){
                break;
            }else{
                data.add(i);
            }
        }
        
        Iterator it = data.iterator();
        while(it.hasNext()){
            System.out.print(""+it.next()+" - ");
        }
        System.out.println(""+data.contains(10));
        
    }     
}
