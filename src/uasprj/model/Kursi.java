/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.model;

/**
 *
 * @author SomethingDelicious
 */
public enum Kursi{
    A1("A-1"), A2("A-2"), A3("A-3"), A4("A-4"), A5("A-5"), B1("B-1"), B2("B-2"), B3("B-3"), B4("B-4"), B5("B-5"), 
    C1("C-1"), C2("C-2"), C3("C-3"), C4("C-4"), C5("C-5"), V1("V-1"), V2("V-2"), V3("V-3"), V4("V-4"), V5("V-5");

    private final String nomorKursi;

    private Kursi(String nomorKursi){
        this.nomorKursi = nomorKursi;
    }

    public String getKursi(){
        return nomorKursi;
    }
    
}
