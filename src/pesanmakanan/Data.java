/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanmakanan;

/**
 *
 * @author MSI GAMING
 */
public class Data {
    private String nama;
    private String id;
    private  String jenis;
    private int stok;
    private int harga;

    public Data(String nama, String id, String jenis, int stok, int harga){
        this.nama = nama;
        this.id = id;
        this.jenis = jenis;
        this.stok = stok;
        this.harga = harga;
    }


    public void setNama(String nama){
        this.nama = nama;
    }
    public String  getNama(){
        return nama;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getJenis(){
        return jenis;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public int getStok(){
        return stok;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getHarga(){
        return harga;
    }

}

