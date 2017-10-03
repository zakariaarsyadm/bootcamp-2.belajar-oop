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
public class Hewan {
    
    protected Integer jumlahKaki = 4;
    private Integer value = 10;
    
    public boolean berburu() {
        return false;
    }
    
    private void makan() {
        System.out.println("Hewan suka berburu");
    }

    public Integer getValue() { //alt+insert untuk auto generate get and set
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
    
    // enkapsulasi
    // public = diakses bisa di semua kelas
    // private = diakses di kelas yg sama
    // protected
    
    
    
    
    
}
