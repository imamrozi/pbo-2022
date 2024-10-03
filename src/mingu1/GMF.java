package mingu1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Imam F
 */
public class GMF {
    /*void servis1(PesawatBalingBaling p){
    
    }
    void servis2(PesawatJet p){
    
    }*/
    static void servis(Pesawat p){
    
    }
    public static void main(String[] args) {
        PesawatJet pj = new PesawatJet();
        PesawatBalingBaling pb = new PesawatBalingBaling();
        servis(pj);
        servis(pb);
        
        Pesawat[] data={pj, pb};
        
    }
}
