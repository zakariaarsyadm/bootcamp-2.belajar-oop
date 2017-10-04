/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zakaria.percabanganswitch;

import java.util.Scanner;

/**
 *
 * @author namhee
 */
public class PercabanganSwitch {

    private String MenampilkanPilihanMenu(String pilihan) {
        
        switch (pilihan) {
            case "A":
                pilihan = "Sushi";
                break;
            case "B":
                pilihan = "Ramen";
                break;
            case "C":
                pilihan = "Dorayaki";
                break;
        }
        return pilihan;
    }

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.print("Apa yang ingin anda makan hari ini ? \n"
                + "A. Sushi \n"
                + "B. Ramen \n"
                + "C. Dorayaki \n"
                + "\n"
                + "Jawaban anda (A, B, atau C) : ");
        String inputPilihan = io.next();

        System.out.println("Anda memilih " + new PercabanganSwitch().MenampilkanPilihanMenu(inputPilihan));

    }

}
