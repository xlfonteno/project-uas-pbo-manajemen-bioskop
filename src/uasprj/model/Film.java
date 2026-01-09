/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.model;

/**
 *
 * @author SomethingDelicious
 */
public class Film {
    protected int idFilm;
    protected String judul;
    protected String genre;
    protected int durasi;
    protected double rating;
    protected double hargaDasar;
    
    public Film(){}
    
    public Film(int idFilm, String judul, String genre, int durasi, double  rating, double harga){
        this.idFilm = idFilm;
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.rating = rating;
        this.hargaDasar = harga;
    }
    
    public double getHargaFilm(){ return hargaDasar;}
    
    public void setHargaFilm(double harga){this.hargaDasar = harga;}

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

    public void getDetailFilm(){
        System.out.println("Judul: "+getJudul());
        System.out.println("Genre: "+getGenre());
        System.out.println("Durasi: "+getDurasi());
        System.out.println("Rating: "+getRating());
        System.out.println("Harga Dasar: "+getHargaFilm());
    }

}
