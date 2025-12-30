/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uasprj.model;

/**
 *
 * @author SomethingDelicious
 */
public class Admin {
    private int idAdmin;
    private String username;
    private String password;
    
    public String getUsn(){return username;}
    public String getPw(){return password;}
    public int getId(){return idAdmin;}
    
    public void SetUsn(String u){this.username = u;}
    public void SetPw(String pw){this.password = pw;}
    
    
}
