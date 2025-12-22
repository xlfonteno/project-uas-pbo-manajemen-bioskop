/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.model;

/**
 *
 * @author SomethingDelicious
 */
public class Studio {
    private int idStudio;
    private String namaStudio;
    private int kapasitas;

    public Studio(){}

    public Studio(int idStudio, String namaStudio, int kapasitas){
        this.idStudio = idStudio;
        this.namaStudio = namaStudio;
        this.kapasitas = kapasitas;
    }

    public int getIdStudio() {
        return idStudio;
    }

    public void setIdStudio(int idStudio) {
        this.idStudio = idStudio;
    }

    public String getNamaStudio() {
        return namaStudio;
    }

    public void setNamaStudio(String namaStudio) {
        this.namaStudio = namaStudio;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void tampilkanStudio(){
        System.out.println(getNamaStudio());
        System.out.println("Kapasitas: "+getKapasitas()+" Orang");
    }
}
