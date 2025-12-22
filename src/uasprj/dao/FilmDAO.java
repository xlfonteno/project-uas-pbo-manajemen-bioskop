/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import uasprj.model.Film;
/**
 *
 * @author SomethingDelicious
 */
public class FilmDAO {
    public boolean insert(Film film){
        String sql = "INSERT INTO film (judul, genre, durasi, rating) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = Koneksi.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, film.getJudul());
            ps.setString(2, film.getGenre());
            ps.setInt(3, film.getDurasi());
            ps.setDouble(4, film.getRating());
            ps.executeUpdate();

            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Film> getAll() {
        List<Film> list = new ArrayList<>();
        String sql = "SELECT * FROM film";
        
        try (Connection conn = Koneksi.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Film film = new Film(
                rs.getInt("idFilm"),
                rs.getString("judul"),
                rs.getString("genre"),
                rs.getInt("durasi"),
                rs.getDouble("rating")
            );
            list.add(film);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean update(Film film) {
        String sql = "UPDATE film SET judul=?, genre=?, durasi=?, rating=? WHERE idFilm=?";
        try (Connection conn = Koneksi.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, film.getJudul());
            ps.setString(2, film.getGenre());
            ps.setInt(3, film.getDurasi());
            ps.setDouble(4, film.getRating());
            ps.setInt(5, film.getIdFilm());
            ps.executeUpdate();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(int id) {
        String sql = "DELETE FROM film WHERE idFilm=?";

        try (Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Film getById(int id){
        Film film = null;
        String sql = "SELECT * FROM film WHERE idFilm=?";
        try (Connection conn = Koneksi.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                film = new Film(
                    rs.getInt("idFilm"),
                    rs.getString("judul"),
                    rs.getString("genre"),
                    rs.getInt("durasi"),
                    rs.getDouble("rating")
                );
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return film;
    }

}
