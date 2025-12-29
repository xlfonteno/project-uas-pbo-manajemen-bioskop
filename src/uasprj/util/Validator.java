/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.util;

/**
 *
 * @author SomethingDelicious
 */
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validator {
    
    // Cek apakah text field kosong
    public static boolean isEmpty(JTextField field, String fieldName) {
        if (field.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, fieldName + " tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            field.requestFocus();
            return true;
        }
        return false;
    }
    
    // Cek apakah input adalah angka
    public static boolean isNumber(JTextField field, String fieldName) {
        try {
            Integer.parseInt(field.getText().trim());
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, fieldName + " harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
