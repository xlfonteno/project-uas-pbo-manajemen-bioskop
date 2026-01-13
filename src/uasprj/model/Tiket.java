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

    public Tiket(int idTiket, Jadwal jadwal, Kursi kursi, double harga, boolean booked) {
        this.idTiket = idTiket;
        this.jadwal = jadwal;
        this.kursi = kursi;
        this.harga = jadwal.getHargaFilm(jadwal.getFilm());
        this.booked = booked;
}

    // Getters and Setters
    int getIdTiket() { return idTiket; }
    Jadwal getJadwal() { return jadwal; }
    Kursi getKursi() { return kursi;}
    double getHarga() { return harga; }
    boolean getStatus() { return booked; }

    public double hitungTiket(){
        double total;
        if(kursi != Kursi.V1 || kursi != Kursi.V2 || kursi != Kursi.V3 || kursi != Kursi.V4 || kursi != Kursi.V5){
            total= harga+25000;
        }
        else{
            total=harga+0;
        }
        
        return total;
    }
    
    
}
