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
public class DaftarGaji {
    Pegawai[] listPegawai;
    int idx = 0;
    
    public DaftarGaji(int n){
        listPegawai = new Pegawai[n];
    }
    void addPegawai(Pegawai p){
        if(idx<listPegawai.length){
            listPegawai[idx] = p;
            idx++;
        }else{
            System.out.println("sudah penuh");
        }
        
    }
    void printSemuaGaji(){
        for(int i=0;i<listPegawai.length;i++){
            System.out.println(""+listPegawai[i].getGaji());
        }
    }
}
