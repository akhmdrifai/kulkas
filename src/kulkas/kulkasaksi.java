/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kulkas;

/**
 *
 * @author user
 */
public class kulkasaksi {
    public static void main(String[] args) {
        
        Classkulkas adrian = new Classkulkas();
        System.out.println("kulkas adrian");
        adrian.merek="samsung";
        adrian.harga=8000000;
        adrian.jenis="3 pintu";
        adrian.warna="putih tosca";
        adrian.pendingin();
        
        Classkulkas aska = new Classkulkas();
        System.out.println("kulkas aska");
        aska.merek="LG";
        aska.harga=5000000;
        aska.jenis="2 pintu";
        aska.warna="biru muda";
        aska.pendingin();
        
        Classkulkas fadlan = new Classkulkas();
        System.out.println("kulkas fadlan");
        fadlan.merek="toshiba";
        fadlan.harga=7000000;
        fadlan.jenis="3 pintu";
        fadlan.warna="hijau tosca";
        fadlan.pendingin();
        
        
        
    }
}
