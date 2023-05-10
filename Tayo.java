/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPL;

/**
 *
 * @author farra
 */
public class Tayo {
    String tampil(){
        return "Menentukan Jarak Tempuh Perjalanan Mobil Tayo";
    }
    
    void tampil2(String merek, String warna, int kecepatan, int waktu, int jumlahroda, String noPlat){
        System.out.println("Merek \t: " + merek);
        System.out.println("Warna Mobil \t: " + warna);
        System.out.println("Jumlah Roda \t: " + jumlahroda);
        System.out.println("Nomor Plat \t: " + noPlat);
        System.out.println("Kecepatan Kendaraan \t: " + kecepatan + "km/jam");
        System.out.println("Waktu Tempuh \t: " + waktu + "jam");
    }
    
    int jarak(int kecepatan, int waktu){
        int total = (kecepatan*waktu);
        return total;
    }
}
