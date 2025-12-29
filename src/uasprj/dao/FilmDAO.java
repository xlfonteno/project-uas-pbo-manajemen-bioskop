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
import uasprj.model.Film;

public class FilmDAO {
    
    public void addFilm(Film film) {
        String sql = "INSERT INTO film (judul, genre, durasi, rating) VALUES (?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, film.getJudul());
            stmt.setString(2, film.getGenre());
            stmt.setInt(3, film.getDurasi());
            stmt.setDouble(4, film.getRating());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Film> getAllFilms() {
        List<Film> listFilm = new ArrayList<>();
        String sql = "SELECT * FROM film";
        try (Connection conn = Database.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Film f = new Film(
                    rs.getInt("id_film"),
                    rs.getString("judul"),
                    rs.getString("genre"),
                    rs.getInt("durasi"),
                    rs.getDouble("rating")
                );
                listFilm.add(f);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listFilm;
    }
    
    // Tambahkan method updateFilm dan deleteFilm jika perlu
}
