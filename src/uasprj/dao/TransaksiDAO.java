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
import uasprj.config.Database;
import uasprj.model.Transaksi;
import uasprj.model.Tiket;

public class TransaksiDAO {

    public void simpanTransaksi(Transaksi transaksi) {
        String sqlHeader = "INSERT INTO transaksi (total_bayar, tanggal, metode_pembayaran) VALUES (?, ?, ?)";
        String sqlDetail = "INSERT INTO detail_transaksi (id_transaksi, id_tiket) VALUES (?, ?)";
        
        Connection conn = Database.getConnection();
        try {
            conn.setAutoCommit(false); 

            PreparedStatement psHeader = conn.prepareStatement(sqlHeader, Statement.RETURN_GENERATED_KEYS);
            psHeader.setDouble(1, transaksi.getTotalBayar());
            psHeader.setString(2, transaksi.getTanggalTransaksi());
            psHeader.setString(3, transaksi.getMetodePembayaran());
            psHeader.executeUpdate();

            ResultSet rs = psHeader.getGeneratedKeys();
            int idTransaksiBaru = 0;
            if (rs.next()) {
                idTransaksiBaru = rs.getInt(1);
            }

            PreparedStatement psDetail = conn.prepareStatement(sqlDetail);
            for (Tiket t : transaksi.getListTiket()) {
                psDetail.setInt(1, idTransaksiBaru);
                psDetail.setInt(2, t.getIdTiket()); 
                psDetail.addBatch();
            }
            psDetail.executeBatch();

            conn.commit(); 
            System.out.println("Transaksi berhasil disimpan!");

        } catch (SQLException e) {
            try { conn.rollback(); } catch (SQLException ex) {}
            e.printStackTrace();
        }
    }
}
