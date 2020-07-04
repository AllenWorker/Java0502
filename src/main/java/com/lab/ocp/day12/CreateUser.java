/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.ocp.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author MB-study
 */
public class CreateUser {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ocp?serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
        String user = "root";
        String password ="12345678";
        String sql = "INSERT INTO user(name, password) VALUES (? ,?)";
        try(Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, "anita");
            EncrypDES des = new EncrypDES();
            pstmt.setBytes(2, des.Encrytor("5678"));
            int rowcount = pstmt.executeUpdate();
            System.out.println("新增異動筆數: " + rowcount);
            
        } catch (Exception e) {
        }
    }
}
