/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koperasigettersetter;

/**
 *
 * @author User
 */
public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jmlPinjaman;
    
    Anggota(String noKTP, String nama, int limitPinjaman){
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public String getNama(){
        return nama;
    }
    public float getJmlPinjaman(){
        return jmlPinjaman;
    }
    public void pinjam(int jmlPinjaman){
        if(jmlPinjaman < limitPinjaman){
    }
        else {
            System.out.println("Maaf jumlah nominal melebihi batas limit!");
        }
    } 
    public void angsur (int jmlAngsur){
        int angsuran = (int)(0.1*jmlPinjaman);
        if(jmlAngsur > angsuran){
            jmlPinjaman -= jmlAngsur;
        } else {
            System.out.println("Maaf, angsuran harus 100% dari jumlah pinjaman");
        }
        
    }
}
