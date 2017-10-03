/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zakaria;

/**
 *
 * @author namhee
 */
public class Tiger extends Hewan {
    
    private boolean bertaring = true;
    
    public boolean berburu() { //polimorfism override dari kelas induk
        return true;
    }
    
    public void meraung() { // polimorfism overload di kelas yg sama
        System.out.println("AAAAAAA.....");
    }
    
    public void meraung(String text) { // hanya bisa beda argumen
        System.out.println(text);
    }
    
    public static void main(String[] args) {
        Tiger macan = new Tiger();
        System.out.println("Jumlah kaki di kelas macan = "+macan.jumlahKaki);
        System.out.println(macan.berburu() ? "Ya dia memiliki sifat berburu" : "Hanya diam saja");
        System.out.println(macan.bertaring ? "Ya dia bertaring" : "Tidak Bertaring");
        // AAAAAAA...
        macan.meraung();
        // Yang kita inputkan
        macan.meraung("BBBBBBB....");
        macan.getValue();
    }
    
    
            
}
