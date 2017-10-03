/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zakaria.java.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author namhee
 */
public class AplikasiJava {
    
    private final static String url = "jdbc:postgresql://localhost:5432/bootcamp_2",
            username = "bootcamp_2",
            password = "root";
    
    public static void main(String[] args) throws SQLException {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        
        Connection connection = ds.getConnection();
        connection.setAutoCommit(false);
        String insertStatement = "insert into users(uname,fullname) values (?,?)";
        PreparedStatement statement = connection.prepareStatement(insertStatement);
        statement.setString(1, "asep");
        statement.setString(2, "asep show");
        statement.executeUpdate();
        String sql = "select * from users where id = ? or uname = ? order by ?";
//        String sql = "select * from users";
        statement.close();
        //Buka koneksi ke database
//        Connection connection1 = ds.getConnection();
        statement = connection.prepareStatement(sql);
        Integer id = 1;
        statement.setInt(1, 1);
        statement.setString(2, "zakaria");
        statement.setString(3, "id");
        //Jalankan Perintah SQL dari java
        ResultSet resultSet = statement.executeQuery();
        //Tampilkan dari database ke java
        while (resultSet.next()) {
            //Sesuaikan tipe data yang ada di tabel dengan di java
            //dan nama kolom di tabel di panggil di parameter columnLabel
            System.out.print(resultSet.getInt("id") + ",");
            System.out.print(resultSet.getString("uname") + ",");
            System.out.print(resultSet.getString("fullname"));
            System.out.println("");
        }
        //Tutup koneksi
        resultSet.close();
        statement.close();
        connection.close();

//        statement.executeQuery(sql);
//        ds.getConnection();
        System.out.println("Database Terkoneksi");
        
    }
    
}
