/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.dao;

/**
 *
 * @author SomethingDelicious
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import uasprj.config.Database;
import uasprj.model.Studio;

public class StudioDAO {
    
    // Menambah Studio Baru
    public void addStudio(Studio studio) {
        String sql = "INSERT INTO studio (nama_studio, kapasitas) VALUES (?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, studio.getNamaStudio());
            stmt.setInt(2, studio.getKapasitas());
            stmt.executeUpdate();
            System.out.println("Studio berhasil ditambahkan!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Mengambil semua data studio
    public List<Studio> getAllStudios() {
        List<Studio> studios = new ArrayList<>();
        String sql = "SELECT * FROM studio";
        try (Connection conn = Database.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Studio s = new Studio(
                    rs.getInt("id_studio"),
                    rs.getString("nama_studio"),
                    rs.getInt("kapasitas")
                );
                studios.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studios;
    }
    
    // Anda bisa menambahkan method deleteStudio() atau updateStudio() di sini
}
