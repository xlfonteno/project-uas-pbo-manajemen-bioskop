/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.model;

/**
 *
 * @author SomethingDelicious
 */
import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private int idTransaksi;
    private List<Tiket> listTiket = new ArrayList<>();
    private double totalBayar;
    private String tanggalTransaksi; // Bisa diganti Date/LocalDateTime jika mau
    private String metodePembayaran;

    public Transaksi() {}

    public int getIdTransaksi() { return idTransaksi; }
    public void setIdTransaksi(int idTransaksi) { this.idTransaksi = idTransaksi; }

    
    public List<Tiket> getListTiket() { return listTiket; }
    public void setListTiket(List<Tiket> listTiket) { this.listTiket = listTiket; }
    
    public void tambahTiket(Tiket tiket) {
        this.listTiket.add(tiket);
        this.totalBayar += tiket.getHarga();
    }

    public double getTotalBayar() { return totalBayar; }
    public void setTotalBayar(double totalBayar) { this.totalBayar = totalBayar; }

    public String getTanggalTransaksi() { return tanggalTransaksi; }
    public void setTanggalTransaksi(String tanggalTransaksi) { this.tanggalTransaksi = tanggalTransaksi; }

    public String getMetodePembayaran() { return metodePembayaran; }
    public void setMetodePembayaran(String metodePembayaran) { this.metodePembayaran = metodePembayaran; }
}
