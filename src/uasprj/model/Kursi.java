/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.model;

/**
 *
 * @author SomethingDelicious
 */
public class Kursi {
    private int idKursi;
    private String nomorKursi; // Contoh: "A1", "B5" (mengganti int posisiKursi agar lebih umum)
    private int idStudio; // Foreign Key ke Studio
    private boolean isTerisi;

    public Kursi() {}

    public Kursi(int idKursi, String nomorKursi, int idStudio, boolean isTerisi) {
        this.idKursi = idKursi;
        this.nomorKursi = nomorKursi;
        this.idStudio = idStudio;
        this.isTerisi = isTerisi;
    }

    public int getIdKursi() { return idKursi; }
    public void setIdKursi(int idKursi) { this.idKursi = idKursi; }

    public String getNomorKursi() { return nomorKursi; }
    public void setNomorKursi(String nomorKursi) { this.nomorKursi = nomorKursi; }

    public int getIdStudio() { return idStudio; }
    public void setIdStudio(int idStudio) { this.idStudio = idStudio; }

    public boolean isTerisi() { return isTerisi; }
    public void setTerisi(boolean terisi) { isTerisi = terisi; }
}
