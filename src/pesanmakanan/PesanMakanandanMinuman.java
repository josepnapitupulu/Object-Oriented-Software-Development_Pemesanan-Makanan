/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanmakanan;

/**
 *
 * @author MSI GAMING
 */
import java.util.Scanner;


public class PesanMakanandanMinuman {

    public static void main(String[] args) {

        MenuMakanan daftarMakanan = new MenuMakanan(DaftarMakanan.pilusGaruda, DaftarMakanan.kuaciRebo, DaftarMakanan.oreo,
                DaftarMakanan.kacangAtom, DaftarMakanan.rotiBawang, DaftarMakanan.rotiTawar, DaftarMakanan.kueGandum,
                DaftarMakanan.rotiGulung, DaftarMakanan.kacangPolong, DaftarMakanan.tango, 9000, 12000,
                8000, 10000, 20000, 5000, 6000, 5000,
                10000, 12000, 10000, 5000, 6000, 5000,
                10000, 10000, 10000, 5000, 10000, 7000);
        MenuMinuman daftarMinuman = new MenuMinuman(DaftarMinuman.cocaCola, DaftarMinuman.aqua, DaftarMinuman.ichiOcha,
                DaftarMinuman.cocoDrink, DaftarMinuman.pocariSweat, DaftarMinuman.nescafe, DaftarMinuman.coklatDrink,
                DaftarMinuman.fanta, DaftarMinuman.torabikaCoffe, DaftarMinuman.milo, 9000, 12000,
                8000, 10000, 20000, 5000, 6000,
                5000, 10000, 12000, 10000, 5000,
                6000, 5000, 10000, 10000, 10000, 5000,
                10000, 7000);
        HitungHarga hitungHarga = new HitungHarga(9000, 12000, 8000, 10000,
                20000, 5000, 6000, 5000, 10000,
                12000, 10000, 5000, 6000, 5000, 10000,
                10000, 10000, 5000, 10000, 7000);
        Login login = new Login();//pembuatan obek dari class lain yang merupakan penerapan dari encapsulation
        Main main = new Main();//pembuatan obek dari class lain yang merupakan penerapan dari encapsulation


        int sjPilusGaruda = 0,
                sjKuaciRebo = 0,
                sjOreo = 0,
                sjKacangAtom = 0,
                sjRotiBawang = 0,
                sjRotiTawar = 0,
                sjKueGandum = 0,
                sjRotiGulung = 0,
                sjKacangPolong = 0,
                sjTango = 0;


        int sjCocaCola = 0,
                sjAqua = 0,
                sjIchiOcha = 0,
                sjCocoDrink = 0,
                sjPocariSweat = 0,
                sjNescafe = 0,
                sjCoklatDrink = 0,
                sjFanta = 0,
                sjTorabikaCoffe = 0,
                sjMilo = 0;


        int jPilusGaruda = 0,
                jKuaciRebo = 0,
                jOreo = 0,
                jKacangAtom = 0,
                jRotiBawang = 0,
                jRotiTawar = 0,
                jKueGandum = 0,
                jRotiGulung = 0,
                jKacangPolong = 0,
                jTango = 0;

        int jCocaCola = 0,
                jAqua = 0,
                jIchiOcha = 0,
                jCocoDrink = 0,
                jPocariSweat = 0,
                jNescafe = 0,
                jCoklatDrink = 0,
                jFanta = 0,
                jTorabikaCoffe = 0,
                jMilo = 0;

        int user;
        int jenisMenu;
        int pengulangan = 1;
        int mmakanan;
        int mminuman;
        Scanner input = new Scanner(System.in);
        String[] ArrAkun = {};

        System.out.println("Silahkan Anda Melakukan Login Sebelum Membeli Barang ");

        do {
            System.out.printf("%s\n%s\n%s", "1. Pembeli", "2. Admin", "3. Registrasi\n");
            System.out.println("Masukkan Role Anda : ");
            user = input.nextInt();
            if (user == 1) {
               if(ArrAkun.length == 0) {
                  ArrAkun = Login.authRegister();//penerapan inheritance
               }else {
                login.authLogin(ArrAkun);//penerapan inheritance
               }
                do {
                    System.out.println("=========================================");
                    System.out.println("Jenis Menu Yang Akan Anda Pesan :");
                    System.out.printf("%s\n%s", "1. Makanan", "2. Minuman\n");
                    System.out.println("=========================================");
                    System.out.println("Silahkan Pilih Kategori Pesanan Anda : ");
                    jenisMenu = input.nextInt();

                    if (jenisMenu == 1) {
                        daftarMakanan.menuMakanan(jPilusGaruda, jKuaciRebo, jOreo, jKacangAtom, jRotiBawang, jRotiTawar, jKueGandum, jRotiGulung, jKacangPolong, jTango);
                        main.aksesMakanan();//pengimplementasian encapsulation
                        System.out.println("=========================================");
                        System.out.println("Pilih makanan yang ingin anda beli : ");
                        mmakanan = input.nextInt();

                        try {//implements Exception Handling pada program
                            if (mmakanan == 1) {
                                System.out.println("=========================================");
                                System.out.println("Jumlah Pilus Garuda Yang ingin anda Beli : ");
                                sjPilusGaruda = input.nextInt();
                                jPilusGaruda = jPilusGaruda + sjPilusGaruda;
                                System.out.println("=========================================");
                                System.out.println("Tekan 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mmakanan == 2) {
                                System.out.println("=========================================");
                                System.out.println("Jumlah Kuaci Rebo Yang ingin anda Beli : ");
                                sjKuaciRebo = input.nextInt();
                                jKuaciRebo = jKuaciRebo + sjKuaciRebo;
                                System.out.println("=========================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mmakanan == 3) {
                                System.out.println("=========================================");
                                System.out.println("Jumlah Oreo Yang ingin anda Beli : ");
                                sjOreo = input.nextInt();
                                jOreo = jOreo + sjOreo;
                                System.out.println("=========================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mmakanan == 4) {
                                System.out.println("=========================================");
                                System.out.println("Jumlah Kacang Atom Yang ingin anda Beli : ");
                                sjKacangAtom = input.nextInt();
                                jKacangAtom = jKacangAtom + sjKacangAtom;
                                System.out.println("=========================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mmakanan == 5) {
                                System.out.println("=========================================");
                                System.out.println("Jumlah Roti Bawang Yang ingin anda Beli : ");
                                sjRotiBawang = input.nextInt();
                                jRotiBawang = jRotiBawang + sjRotiBawang;
                                System.out.println("=========================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mmakanan == 6) {
                                System.out.println("=========================================");
                                System.out.println("Jumlah Roti Tawar Yang ingin anda Beli : ");
                                sjRotiTawar = input.nextInt();
                                jRotiTawar = jRotiTawar + sjRotiTawar;
                                System.out.println("=========================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mmakanan == 7) {
                                System.out.println("=========================================");
                                System.out.println("Jumlah Kue Gandum Yang ingin anda Beli : ");
                                sjKueGandum = input.nextInt();
                                jKueGandum = jKueGandum + sjKueGandum;
                                System.out.println("=========================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mmakanan == 8) {
                                System.out.println("=========================================");
                                System.out.println("Jumlah Roti Gulung Yang ingin anda Beli : ");
                                sjRotiGulung = input.nextInt();
                                jRotiGulung = jRotiGulung + sjRotiGulung;
                                System.out.println("=========================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mmakanan == 9) {
                                System.out.println("=========================================");
                                System.out.println("Jumlah Kacang Polong Yang ingin anda Beli : ");
                                sjKacangPolong = input.nextInt();
                                jKacangPolong = jKacangPolong + sjKacangPolong;
                                System.out.println("=========================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mmakanan == 10) {
                                System.out.println("=========================================");
                                System.out.println("Jumlah Tango Yang ingin anda Beli : ");
                                sjTango = input.nextInt();
                                jTango = jTango + sjTango;
                                System.out.println("=========================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            }
                        }catch (Exception e){
                            System.err.println("Masukkan pilihan sesuai yang ada dengan Menu");
                        }
                    } else if (jenisMenu == 2) {
                        daftarMinuman.menuMinuman(jCocaCola, jAqua, jIchiOcha, jCocoDrink, jPocariSweat, jNescafe, jCoklatDrink, jFanta, jTorabikaCoffe, jMilo);
                        main.aksesMinuman();//pengimplementasian encapsulation
                        System.out.println("======================================");
                        System.out.println("Pilih minuman yang ingin anda beli : ");
                        mminuman = input.nextInt();

                        try {//implements Exception Handling pada program
                            if (mminuman == 1) {
                                System.out.println("======================================");
                                System.out.println("Jumlah Coca Cola Yang ingin anda Beli : ");
                                sjCocaCola = input.nextInt();
                                jCocaCola = jCocaCola + sjCocaCola;
                                System.out.println("======================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mminuman == 2) {
                                System.out.println("======================================");
                                System.out.println("Jumlah Aqua Yang ingin anda Beli : ");
                                sjAqua = input.nextInt();
                                jAqua = jAqua + sjAqua;
                                System.out.println("======================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mminuman == 3) {
                                System.out.println("======================================");
                                System.out.println("Jumlah Ichi Ocha Yang ingin anda Beli : ");
                                sjIchiOcha = input.nextInt();
                                jIchiOcha = jIchiOcha + sjIchiOcha;
                                System.out.println("======================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mminuman == 4) {
                                System.out.println("======================================");
                                System.out.println("Jumlah Coco Drink Yang ingin anda Beli : ");
                                sjCocoDrink = input.nextInt();
                                jCocoDrink = jCocoDrink + sjCocoDrink;
                                System.out.println("======================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mminuman == 5) {
                                System.out.println("======================================");
                                System.out.println("Jumlah Pocari Sweat Yang ingin anda Beli : ");
                                sjPocariSweat = input.nextInt();
                                jPocariSweat = jPocariSweat + sjPocariSweat;
                                System.out.println("======================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mminuman == 6) {
                                System.out.println("======================================");
                                System.out.println("Jumlah Nescafe Yang ingin anda Beli : ");
                                sjNescafe = input.nextInt();
                                jNescafe = jNescafe + sjNescafe;
                                System.out.println("======================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mminuman == 7) {
                                System.out.println("======================================");
                                System.out.println("Jumlah Coklat Drink Yang ingin anda Beli : ");
                                sjCoklatDrink = input.nextInt();
                                jCoklatDrink = jCoklatDrink + sjCoklatDrink;
                                System.out.println("======================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mminuman == 8) {
                                System.out.println("======================================");
                                System.out.println("Jumlah Fanta Yang ingin anda Beli : ");
                                sjFanta = input.nextInt();
                                jFanta = jFanta + sjFanta;
                                System.out.println("======================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mminuman == 9) {
                                System.out.println("======================================");
                                System.out.println("Jumlah Torabika Coffe Yang ingin anda Beli : ");
                                sjTorabikaCoffe = input.nextInt();
                                jTorabikaCoffe = jTorabikaCoffe + sjTorabikaCoffe;
                                System.out.println("======================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            } else if (mminuman == 10) {
                                System.out.println("======================================");
                                System.out.println("Jumlah Milo Yang ingin anda Beli : ");
                                sjMilo = input.nextInt();
                                jMilo = jMilo + sjMilo;
                                System.out.println("======================================");
                                System.out.println("Tekan angka 1 jika ingin membeli lagi atau tekan angka random jika selesai ");
                                pengulangan = input.nextInt();
                            }
                        }catch (Exception e){
                            System.err.println("Masukkan pilihan sesuai yang ada dengan Menu");
                        }
                    } else {
                        System.err.println("Masukkan pilihan yang tepat!!");
                    }
                }
                while (pengulangan == 1);
                hitungHarga.hitungHarga(jPilusGaruda, jKuaciRebo, jOreo, jKacangAtom, jRotiBawang, jRotiTawar, jKueGandum,
                        jRotiGulung, jKacangPolong, jTango, jCocaCola, jAqua, jIchiOcha, jCocoDrink, jPocariSweat, jNescafe,
                        jCoklatDrink, jFanta, jTorabikaCoffe, jMilo);
            } else if (user == 2) {
                login.loginAdmin();//pengimplementasian encapsulation
                main.Main();//pengimplementasian encapsulation
            } else if (user == 3) {
                ArrAkun = Login.authRegister();//penerapan inheritance
            } else{
                System.exit(0);
            }
        }while (user != 0);
    }
}


