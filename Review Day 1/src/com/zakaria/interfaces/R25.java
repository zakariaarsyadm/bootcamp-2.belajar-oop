/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zakaria.interfaces;

/**
 *
 * @author namhee
 */
public class R25 implements Motor {
    
    public Integer jumlahRoda() {
        return 2;
    }
    
    public static void main(String[] args) {
        System.out.println(new R25().jumlahRoda());
        System.out.println(new R25().merek);
        
    }
    
}
