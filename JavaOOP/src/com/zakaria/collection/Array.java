/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zakaria.collection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author namhee
 */
public class Array {
    
    private Object[] listData = {
        "Zakaria","Arsyad",10,true,0.1,new BigDecimal(1000000000)
    };
    
    public void addElementOfListData() {
        listData[4] = "Tabungan";
        listData[0] = "zAkaria";
    }
    
    private static Map <Integer,String> mapData = new HashMap<>();
    
   //set utk data yg unik
    
    private static List<Object> arrayListData = new ArrayList<>();
    
    static { //inisiasi variable static, pertama kali dijalankan
        arrayListData.add("Zakaria");
//        arrayListData.addAll(List.);
        List list = Arrays.asList("Tabungan",10,0.5);
        arrayListData.addAll(list);
        
        mapData.put(1, "Zakaria");
        mapData.put(2, "Arsyad");
        mapData.put(3, "M");
        mapData.put(3, "HHH");
    }
    
    public static void main(String[] args) {
        Array arr = new Array();
        arr.addElementOfListData();
        Object[] listData = new Array().listData;
        for(Object value: new Array().listData) {
            System.out.println(value);
        }
        
        arrayListData.forEach((valueData) -> {
            System.out.println(valueData);
        });
        
        mapData.forEach((key,value) -> {
            System.out.println("Key dari map "+key+" bernilai "+value);
        });
        
    }
    
    
}
