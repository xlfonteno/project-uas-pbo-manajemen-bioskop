/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.model;

/**
 *
 * @author SomethingDelicious
 */
public class detFilm extends Film{
    private int idFilm;
    private String genre;
    private int durasi;
    private double rating;
    
    public detFilm(){}
    
    public detFilm(int idFilm, String judul, String genre, int durasi, double  rating){
        this.idFilm = idFilm;
        setJudul(judul);
        this.genre = genre;
        this.durasi = durasi;
        this.rating = rating;
    }
    
    public double getHargaFilm(){ return harga;}
    
    public void setHargaFilm(double harga){this.harga = harga;}

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void tampilkanInfoFilm(){
        System.out.println("Judul: "+getJudul());
        System.out.println("Genre: "+getGenre());
        System.out.println("Durasi: "+getDurasi());
        System.out.println("Rating: "+getRating());
    }
}
