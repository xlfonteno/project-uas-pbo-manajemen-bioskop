/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.model;

/**
 *
 * @author SomethingDelicious
 */
public class Tiket {
    private int idTiket;
    private Jadwal jadwal; // Relasi ke Jadwal
    private Kursi kursi;   // Relasi ke Kursi
    private double harga;
    private String status; // "BOOKED", "PAID", "CANCELLED"

    public Tiket() {}

    public Tiket(int idTiket, Jadwal jadwal, Kursi kursi, double harga, String status) {
        this.idTiket = idTiket;
        this.jadwal = jadwal;
        this.kursi = kursi;
        this.harga = harga;
        this.status = status;
    }

    // Getters and Setters
    public int getIdTiket() { return idTiket; }
    public void setIdTiket(int idTiket) { this.idTiket = idTiket; }

    public Jadwal getJadwal() { return jadwal; }
    public void setJadwal(Jadwal jadwal) { this.jadwal = jadwal; }

    public Kursi getKursi() { return kursi; }
    public void setKursi(Kursi kursi) { this.kursi = kursi; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
