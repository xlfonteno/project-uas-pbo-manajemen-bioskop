/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.util;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author SomethingDelicious
 */
public final class HargaFormatter {
    public HargaFormatter(){}
    public static final Locale LOCALE_ID = Locale.of("id", "ID"); 
    public static String formatRupiah(int nilai){
        NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALE_ID);
        return nf.format(nilai);
    }
    public static String formatRupiah(double nilai){
        NumberFormat nf = NumberFormat.getCurrencyInstance(LOCALE_ID);
        return nf.format(nilai);
    }
}

