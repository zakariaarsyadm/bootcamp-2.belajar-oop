/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zakaria.interfacestv;

/**
 *
 * @author namhee
 */
public class Rcti implements InterfaceTv{
    
    public String channelTv() {
        return "RCTI";
    }
     public Integer perbesarVolume() {
         return 1;
     }

    @Override
    public Integer perkecilVolume() {
        //To change body of generated methods, choose Tools | Templates.
        return 0;
    }
    
}
