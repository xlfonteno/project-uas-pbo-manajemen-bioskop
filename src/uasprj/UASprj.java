/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uasprj;
import java.awt.geom.Arc2D;
import uasprj.model.*;
import uasprj.view.Dashboard;
import uasprj.view.LoginFrame;
/**
 *
 * @author SomethingDelicious
 */
public class UASprj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film moana = new detFilm(1, "Moana", 50000, "Cartoon", 9, 4.7);
        Film zootopia2 = new detFilm(2, "Zootopia 2", 60000, "Cartoon", 155, 4.9);
        Film comic8rev = new detFilm(3, "Comic 8 Revolution", 80000, "Action/Comedy", 200, 4.6);
        Film janurireng = new detFilm(4, "Sewu Dino: Janur Ireng", 85000, "Horror", 185, 4.5);

        Studio studio1 = new Studio(1, "Studio 1", 20);
        Jadwal jadwal1 = new Jadwal(1, janurireng, studio1, "29/01/2026", "16.30");
        
        LoginFrame lg = new LoginFrame();
        lg.setLocationRelativeTo(null);
        lg.setVisible(true);
    }
    
}
