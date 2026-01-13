/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.dao;

/**
 *
 * @author SomethingDelicious
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import uasprj.config.Database;

public class AdminDAO {
    
    // Method untuk mengecek login
    public boolean login(String username, String password) {
        String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
        
        try (Connection conn = Database.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, username);
            ps.setString(2, password);
            
            try (ResultSet rs = ps.executeQuery()) {
                // Jika ada baris data yang kembali, berarti login valid
                if (rs.next()) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Login Error: " + e.getMessage());
            e.printStackTrace();
        }
        
        return false;
    }

    public boolean checkLogin(String username, String password) {
        if ("admin".equals(username) && "12345".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
    }

