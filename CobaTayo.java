/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPL;

/**
 *
 * @author farra
 */
public class CobaTayo {
    public static void main(String[] args) {
        Tayo cth = new Tayo();
        System.out.println(cth.tampil());
        
        cth.tampil2("Tayo", "Biru", 60, 2, 6, "BM 1234 TIF");
        
        int total = cth.jarak(60, 2);
        System.out.println("Total : " + total + "km");    
    }
}
