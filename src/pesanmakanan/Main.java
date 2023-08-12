/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanmakanan;

/**
 *
 * @author MSI GAMING
 */
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main extends Fungsi{

    Random rand = new Random();
    Vector<Data> vecData = new Vector<Data>();//penerapan dari generic and collection dimana disini terdapat vektor

    Scanner scan = new Scanner(System.in);

    int menu, stok, harga;
    String nama, id, jenis;

    Data d;

    public void Main(){
        DataFeedback komen = new DataFeedback();//pembuatan obek dari class lain yang merupakan penerapan dari encapsulation

        do {
            System.out.println("1. Tambahkan Menu");
            System.out.println("2. Lihat Menu");
            System.out.println("3. Hapus Menu");
            System.out.println("4. Feedback");
            System.out.println("5. Exit");
            System.out.println("Masukkan Pilihan Anda : ");
            menu = scan.nextInt();scan.nextLine();
            if (menu == 1){
                do {
                    System.out.print("Masukkan nama menu [3 - 20 karakter] : ");
                    nama = scan.nextLine();
                }while (nama.length()<3||nama.length()>20);
                do {
                    System.out.print("Masukkan kedalam kategori [Makanan|Minuman] : ");
                    jenis = scan.nextLine();
                }while (!jenis.equals("Makanan")&&!jenis.equals("Minuman"));
                do {
                    System.out.print("Masukkan jumlah Stok : ");
                    stok = scan.nextInt();scan.nextLine();
                }while (0 > stok);
                do {
                    System.out.print("Masukkan harga : ");
                    harga = scan.nextInt();scan.nextLine();
                }while (harga < 0);

                id = ""+Math.abs(rand.nextInt()%10)+Math.abs(rand.nextInt()%10)+Math.abs(rand.nextInt()%10);

                d = new Data(nama, id, jenis, stok, harga);
                vecData.add(d);
                System.out.println("==========================");
                System.out.println("Menu berhasil di tambahkan");
                System.out.println("==========================");
            } else if (menu == 2) {
                if (vecData.size() == 0){
                    System.out.println("Menu yang belum ada");
                    System.out.println("Tekan enter untuk melanjutkan");
                    scan.nextLine();
                }else {
                    play();
                }

            } else if (menu == 3) {
                if (vecData.size() == 0){
                    System.out.println("Menu yang ditambahkan kosong");
                    System.out.println("Tekan enter untuk melanjutkan");
                    scan.nextLine();
                }else {
                    play();
                    int index = 0, flag = 0;
                    System.out.println("Masukkan id menu yang akan anda hapus :");
                    for (Data data: vecData) {
                        if (data.getId().equals(id)){
                            flag = 1;
                            vecData.remove(index);
                            break;
                        }
                        index++;
                    }
                    if (flag == 0){
                        System.out.println("Menu tidak tersedia");
                        System.out.println("Tekan enter untuk mengulang kembali");
                        scan.nextLine();
                    }
                }
            } else if (menu == 4) {
                komen.play();//pengimplementasian encapsulation
            }
        }while (menu != 5);
    }
    public void  play(){//menggunakan abstract class dari class abstrack Fungsi.
        System.out.println("List Menu : ");
        for (Data data : vecData) {
            System.out.println("\tId = "+data.getId()+"\n\tNama = "+data.getNama()+"\n\tKategori = "+data.getJenis()+
                    "\n\tHarga = "+data.getHarga()+"\n\tStok = "+data.getStok()+"\n");
        }
    }
    int i = 11;
    public void aksesMakanan(){
        for (Data data : vecData) {
            if (jenis.equals("Makanan")){
                System.out.printf("%s\n\t%s",i+". "+ data.getNama()+ " Tersedia : "+data.getStok()+ " Bungkus", "Harga perBungkus : Rp."+data.getHarga()+"\n");
                i++;
            }
        }
    }
    public void aksesMinuman(){
        for (Data data : vecData) {
            if (jenis.equals("Minuman")){
                System.out.printf("%s\n\t%s",i+". ", data.getNama()+ " Tersedia : "+data.getStok()+ " Bungkus", "Harga perBungkus : Rp."+data.getHarga()+"\n");
            }
            i++;
        }
    }
}

