/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.dao;

/**
 *
 * @author Lenovo X240
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import uasprj.config.Database;
import uasprj.model.Pelanggan;

public class PelangganDAO {
    
    public void addPelanggan(Pelanggan p) {
        String sql = "INSERT INTO pelanggan (nama, no_hp, email) VALUES (?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getNama());
            stmt.setString(2, p.getNoHp());
            stmt.setString(3, p.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Method getByNoHp untuk mencari pelanggan saat transaksi
    public Pelanggan getByNoHp(String noHp) {
        String sql = "SELECT * FROM pelanggan WHERE no_hp = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, noHp);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Pelanggan(
                    rs.getInt("id_pelanggan"),
                    rs.getString("nama"),
                    rs.getString("no_hp"),
                    rs.getString("email")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
