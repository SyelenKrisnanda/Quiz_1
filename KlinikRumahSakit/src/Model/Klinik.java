/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
/**
 *
 * @author admin
 */
public class Klinik {

    private String Nama;// membuat variable bertipe data Sting dan bersifat private
    private String idKlinik;// membuat variabel bertipe data int dan bersifat iprivate
    public static ArrayList<Dokter> DaftarDokter = new ArrayList<Dokter>();

   
    public Klinik(){
        
    }

    public Klinik(String Nama, String idKlinik) {
        this.Nama = Nama;
        this.idKlinik = idKlinik;
    }

   

    public String getNamaKlinik() {//membuat method bernama getNama yang akan mereturn variabel bertipe data String
        return Nama;
    }

    public void setNamaKlinik(String Nama) {//membuat method void bernama setNama dengan parameter variabel nama bertipe data String
        this.Nama = Nama;
    }

    public String getIdKlinik() {//membuat method bernama getIdKlinik yang akan mereturn variabel bertipe data int
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) throws Exception { // Membuat method bernama setIdKlinik dengan parameter variable idKlinik bertipe data int dengan menambahkan eception
      
        this.idKlinik=idKlinik;
    }
public static void tambahDokter(Dokter dokter) {
       DaftarDokter.add(dokter);
    }

    public static int cariKlinik(String namaKlinik) {
        for (int i = 0; i < DaftarDokter.size(); i++) {
            if (DaftarDokter.get(i).getNama().equalsIgnoreCase(namaKlinik)) {
            
             return i;
            }
        }
        return -1;
    }

 public static ArrayList<Dokter> getDaftarDokter() {
        return DaftarDokter;
    }

    public static void setDaftarDokter(ArrayList<Dokter> DaftarDokter) {
        Klinik.DaftarDokter = DaftarDokter;
    }
}