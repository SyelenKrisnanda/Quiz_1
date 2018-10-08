/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lenovo
 */
public class Dokter { 
    
    
    private String nomorPegawai;
    private String nama;
  //mendeklarasikan variable bertipe data String dan bersifat private
   
    public Dokter(){// membuat konstruktor kosong bernama dokter
    }
       public Dokter(String nama, String nomorPegawai) {// membuat konstruktor kosong bernama dokter 
           this.nama=nama;
           this.nomorPegawai= nomorPegawai;
       }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}