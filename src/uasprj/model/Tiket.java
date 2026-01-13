/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.model;

/**
 *
 * @author SomethingDelicious
 */
public class Tiket{
    private int idTiket;
    private Jadwal jadwal; 
    private Kursi kursi;
    private double harga;
    private boolean booked;
    
    public Tiket() {}

    public Tiket(int idTiket, Jadwal jadwal, Kursi kursi, boolean booked) {
        this.idTiket = idTiket;
        this.jadwal = jadwal;
        this.kursi = kursi;
        this.booked = booked;
        
        // Ambil harga dasar dari jadwal/film
        double hargaDasar = jadwal.getHargaFilm(jadwal.getFilm());
        
        // Hitung harga final (tambah surcharge VIP jika perlu)
        this.harga = hitungTiket(hargaDasar);
    }

    // Getters and Setters
    public int getIdTiket() {
        return idTiket;
    }
    public Jadwal getJadwal() {
        return jadwal;
    }
    public Kursi getKursi() {
        return kursi;
    }
    public double getHarga() {
        return harga;
    }
    public boolean getStatus() {
        return booked;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }
    public void setKursi(Kursi kursi) {
        this.kursi = kursi;
    }
    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    private double hitungTiket(double hargaDasar){
        double total;
        // Cek apakah kursi termasuk VIP (V1-V5)
        if(kursi == Kursi.V1 || kursi == Kursi.V2 || kursi == Kursi.V3 || 
           kursi == Kursi.V4 || kursi == Kursi.V5) {
            total = hargaDasar + 25000; // Tambahan biaya VIP
        } else {
            total = hargaDasar;
        }
        return total;
    }
    
    public String tampilkanTiket() {
        // Contoh Output: "A1 (Regular) - Rp 35.000"
        String tipe = (harga > jadwal.getHargaFilm(jadwal.getFilm())) ? "VIP" : "Regular";
        return kursi + " (" + tipe + ") - " + uasprj.util.HargaFormatter.formatRupiah(harga);
    }
    
    @Override
    public String toString() {
        return "Kursi: " + kursi + " (Rp" + (long)harga + ")";
    }
    
    
}
