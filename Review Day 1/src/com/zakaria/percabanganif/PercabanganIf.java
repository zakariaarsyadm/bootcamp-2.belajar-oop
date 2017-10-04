/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zakaria.percabanganif;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author namhee
 */
public class PercabanganIf {

//    private BigDecimal gajiPokok = new BigDecimal("4.000.000");
//    private Integer jumlahKehadiran = 22;
    public BigDecimal HitungGajiPokokSebulan(BigDecimal gajiPokok, Integer jumlahKehadiran) {
        if (jumlahKehadiran >= 22) {
            gajiPokok = gajiPokok.multiply(new BigDecimal("1.2"));
        } else {
            gajiPokok = gajiPokok.multiply(new BigDecimal("0.9"));
        }
        return gajiPokok;
    }

    public static void main(String[] args) throws IOException {
        Scanner io = new Scanner(System.in);

        System.out.print("Gaji Pokok = ");
        BigDecimal inputGajiPokok = io.nextBigDecimal();

        System.out.print("Jumlah Kehadiran = ");
        Integer inputKehadiran = io.nextInt();

        System.out.println("Perhitungan gaji sebulannya adalah " + new PercabanganIf().HitungGajiPokokSebulan(inputGajiPokok, inputKehadiran));

    }

}
