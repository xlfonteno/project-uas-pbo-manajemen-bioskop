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
    private String nomorKursi; // A1, A2, B3
    private boolean tersedia;
    private int idStudio;

    public Kursi() {}

    public Kursi(int idKursi, String nomorKursi, boolean tersedia, int idStudio) {
        this.idKursi = idKursi;
        this.nomorKursi = nomorKursi;
        this.tersedia = tersedia;
        this.idStudio = idStudio;
    }

    // getter & setter
}
