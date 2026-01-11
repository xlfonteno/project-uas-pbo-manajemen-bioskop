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
    private double hargaDasar;
    
    public Film(){}
    
    public Film(int idFilm, String judul, double harga){
        this.idFilm = idFilm;
        this.judul = judul;
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


    public void getDetailFilm(){
        System.out.println("Judul: "+getJudul());
        System.out.println("Harga Dasar: "+getHargaFilm());
    }

}
