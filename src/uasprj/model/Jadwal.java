/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.model;

/**
 *
 * @author SomethingDelicious
 */
public class Jadwal {
    private int idJadwal;
    private Film film;
    private Studio studio;
    private String tanggal;
    private String jamTayang;

    public Jadwal(){}
    
    public Jadwal(int idJadwal, Film film, Studio studio, String tanggal, String jamTayang){
        this.idJadwal = idJadwal;
        this.film = film;
        this.studio = studio;
        this.tanggal = tanggal;
        this.jamTayang = jamTayang;
    }

    public int getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(int idJadwal) {
        this.idJadwal = idJadwal;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public String getTgl() {
        return tanggal;
    }

    public void setTgl(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJamTayang() {
        return jamTayang;
    }

    public void setJamTayang(String jamTayang) {
        this.jamTayang = jamTayang;
    }

    public void tampilkanJadwal(){
        System.out.println("Film: "+film.getJudul());
        System.out.println("Date: "+getTgl());
        System.out.println("Tayang pada: "+getJamTayang());
        System.out.println("Studio: "+studio.getNamaStudio());
    }
}
