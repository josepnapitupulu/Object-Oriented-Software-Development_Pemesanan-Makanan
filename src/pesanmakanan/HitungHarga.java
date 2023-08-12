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

public class HitungHarga extends Validasi{

    Scanner scan = new Scanner(System.in);
    DataFeedback feed = new DataFeedback();//pembuatan obek dari class lain yang merupakan penerapan dari encapsulation

    int hargaPilusGaruda = 9000,
            hargaKuaciRebo = 12000,
            hargaOreo = 8000,
            hargaKacangAtom = 10000,
            hargaRotiBawang = 20000,
            hargaRotiTawar = 5000,
            hargaKueGandum = 6000,
            hargaRotiGulung = 5000,
            hargaKacangPolong = 10000,
            hargaTango = 12000;
    int hargaCocaCola = 12000,
            hargaAqua = 12000,
            hargaIchiOcha = 15000,
            hargaCocoDrink = 12000,
            hargaPocariSweat = 15000,
            hargaNescafe = 15000,
            hargaCoklatDrink = 15000,
            hargaFanta = 15000,
            hargaTorabikaCoffe = 15000,
            hargaMilo = 15000;

    public HitungHarga(int hargaPilusGaruda, int hargaKuaciRebo, int hargaOreo, int hargaKacangAtom,
                       int hargaRotiBawang, int hargaRotiTawar, int hargaKueGandum, int hargaRotiGulung, int hargaKacangPolong,
                       int hargaTango, int hargaCocaCola, int hargaAqua, int hargaIchiOcha, int hargaCocoDrink,
                       int hargaPocariSweat, int hargaNescafe, int hargaCoklatDrink, int hargaFanta, int hargaTorabikaCoffe,
                       int hargaMilo){
        this.hargaPilusGaruda = hargaPilusGaruda;
        this.hargaKuaciRebo = hargaKuaciRebo;
        this.hargaOreo = hargaOreo;
        this.hargaKacangAtom = hargaKacangAtom;
        this.hargaRotiBawang = hargaRotiBawang;
        this.hargaRotiTawar = hargaRotiTawar;
        this.hargaKueGandum = hargaKueGandum;
        this.hargaRotiGulung = hargaRotiGulung;
        this.hargaKacangPolong = hargaKacangPolong;
        this.hargaTango = hargaTango;
        this.hargaCocaCola = hargaCocaCola;
        this.hargaAqua = hargaAqua;
        this.hargaIchiOcha = hargaIchiOcha;
        this.hargaCocoDrink = hargaCocoDrink;
        this.hargaPocariSweat = hargaPocariSweat;
        this.hargaNescafe = hargaNescafe;
        this.hargaCoklatDrink = hargaCoklatDrink;
        this.hargaFanta = hargaFanta;
        this.hargaTorabikaCoffe = hargaTorabikaCoffe;
        this.hargaMilo = hargaMilo;
    }
    public void hitungHarga(int jPilusGaruda, int jKuaciRebo, int jOreo, int jKacangAtom, int jRotiBawang, int jRotiTawar,
                            int jKueGandum, int jRotiGulung, int jKacangPolong, int jTango, int  jCocaCola, int jAqua,
                            int jIchiOcha, int jCocoDrink, int jPocariSweat, int jNescafe, int jCoklatDrink, int jFanta,
                            int jTorabikaCoffe, int jMilo){
        int hargaPilusGaruda = 9000,
            hargaKuaciRebo = 12000,
            hargaOreo = 8000,
            hargaKacangAtom = 10000,
            hargaRotiBawang = 20000,
            hargaRotiTawar = 5000,
            hargaKueGandum = 6000,
            hargaRotiGulung = 5000,
            hargaKacangPolong = 10000,
            hargaTango = 12000;

        int hargaCocaCola = 10000,
                hargaAqua = 5000,
                hargaIchiOcha = 6000,
                hargaCocoDrink = 5000,
                hargaPocariSweat = 10000,
                hargaNescafe = 10000,
                hargaCoklatDrink = 10000,
                hargaFanta = 5000,
                hargaTorabikaCoffe = 10000,
                hargaMilo = 7000;


        double htPilusGaruda = 0,
               htKuaciRebo = 0,
               htOreo = 0,
               htKacangAtom = 0,
               htRotiBawang = 0,
               htRotiTawar = 0,
               htKueGandum = 0,
               htRotiGulung = 0,
               htKacangPolong = 0,
               htTango = 0;

        double htCocaCola = 0,
               htAqua = 0,
               htIchiOcha = 0,
               htCocoDrink = 0,
                htPocariSweat = 0,
                htNescafe = 0,
                htCoklatDrink = 0,
                htFanta = 0,
                htTorabikaCoffe = 0,
                htMilo = 0;

        double hargaTotal = 0;
        int feedback;

        htPilusGaruda = hargaPilusGaruda * jPilusGaruda;
        htKuaciRebo = hargaKuaciRebo * jKuaciRebo;
        htOreo = hargaOreo * jOreo;
        htKacangAtom = hargaKacangAtom * jKacangAtom;
        htRotiBawang = hargaRotiBawang * jRotiBawang;
        htRotiTawar = hargaRotiTawar * jRotiTawar;
        htKueGandum = hargaKueGandum * jKueGandum;
        htRotiGulung = hargaRotiGulung * jRotiGulung;
        htKacangPolong = hargaKacangPolong * jKacangPolong;
        htTango = hargaTango * jTango;

        htCocaCola = hargaCocaCola * jCocaCola;
        htAqua = hargaAqua * jAqua;
        htIchiOcha = hargaIchiOcha * jIchiOcha;
        htCocoDrink = hargaCocoDrink * jCocoDrink;
        htPocariSweat = hargaPocariSweat * jPocariSweat;
        htNescafe = hargaNescafe * jNescafe;
        htCoklatDrink = hargaCoklatDrink * jCoklatDrink;
        htFanta = hargaFanta * jFanta;
        htTorabikaCoffe = hargaTorabikaCoffe * jTorabikaCoffe;
        htMilo = hargaMilo * jMilo;

        hargaTotal = htPilusGaruda + htKuaciRebo + htOreo + htKacangAtom + htRotiBawang + htRotiTawar + htKueGandum +
                htRotiGulung + htKacangPolong + htTango + htCocaCola + htAqua + htIchiOcha + htCocoDrink + htPocariSweat
                + htNescafe + htCoklatDrink + htFanta + htTorabikaCoffe + htMilo;
        System.out.println("========================================");
        System.out.println("Rincian Harga : ");

        if (jPilusGaruda > 0){
            System.out.println("Jumah PilusGaruda yang akan di beli : "+jPilusGaruda);
            System.out.println("Total harga PilusGaruda : Rp."+htPilusGaruda);
        }
        if (jKuaciRebo > 0){
            System.out.println("Jumah KuaciRebo yang akan di beli : "+jKuaciRebo);
            System.out.println("Total harga KuaciRebo : Rp."+htKuaciRebo);
        }
        if (jOreo > 0){
            System.out.println("Jumah Oreo yang akan di beli : "+jOreo);
            System.out.println("Total harga Oreo : Rp."+htOreo);
        }
        if (jKacangAtom > 0){
            System.out.println("Jumah KacangAtom yang akan di beli : "+jKacangAtom);
            System.out.println("Total harga KacangAtom : Rp."+htKacangAtom);
        }
        if (jRotiBawang > 0){
            System.out.println("Jumah RotiBawang yang akan di beli : "+jRotiBawang);
            System.out.println("Total harga RotiBawang : Rp."+htRotiBawang);
        }
        if (jRotiTawar > 0){
            System.out.println("Jumah RotiTawar yang akan di beli : "+jRotiTawar);
            System.out.println("Total harga RotiTawar : Rp."+htRotiTawar);
        }
        if (jKueGandum > 0){
            System.out.println("Jumah KueGandum yang akan di beli : "+jKueGandum);
            System.out.println("Total harga KueGandum : Rp."+htKueGandum);
        }
        if (jRotiGulung > 0){
            System.out.println("Jumah RotiGulung yang akan di beli : "+jRotiGulung);
            System.out.println("Total harga RotiGulung : Rp."+htRotiGulung);
        }
        if (jKacangPolong > 0){
            System.out.println("Jumah KacangPolong yang akan di beli : "+jKacangPolong);
            System.out.println("Total harga KacangPolong : Rp."+htKacangPolong);
        }
        if (jTango > 0){
            System.out.println("Jumah Tango yang akan di beli : "+jTango);
            System.out.println("Total harga Tango : Rp."+htTango);
        }
        if (jCocaCola > 0){
            System.out.println("Jumah CocaCola yang akan di beli : "+jCocaCola);
            System.out.println("Total harga CocaCola : Rp."+htCocaCola);
        }
        if (jAqua > 0){
            System.out.println("Jumah Aqua yang akan di beli : "+jAqua);
            System.out.println("Total harga Aqua : Rp."+htAqua);
        }
        if (jIchiOcha > 0){
            System.out.println("Jumah IchiOcha yang akan di beli : "+jIchiOcha);
            System.out.println("Total harga IchiOcha : Rp."+htIchiOcha);
        }
        if (jCocoDrink > 0){
            System.out.println("Jumah CocoDrink yang akan di beli : "+jCocoDrink);
            System.out.println("Total harga CocoDrink : Rp."+htCocoDrink);
        }
        if (jPocariSweat > 0){
            System.out.println("Jumah PocariSweat yang akan di beli : "+jPocariSweat);
            System.out.println("Total harga PocariSweat : Rp."+htPocariSweat);
        }
        if (jNescafe > 0){
            System.out.println("Jumah Nescafe yang akan di beli : "+jNescafe);
            System.out.println("Total harga Nescafe : Rp."+htNescafe);
        }
        if (jCoklatDrink > 0){
            System.out.println("Jumah CoklatDrink yang akan di beli : "+jCoklatDrink);
            System.out.println("Total harga CoklatDrink : Rp."+htCoklatDrink);
        }
        if (jFanta > 0){
            System.out.println("Jumah Fanta yang akan di beli : "+jFanta);
            System.out.println("Total harga Fanta : Rp."+htFanta);
        }
        if (jTorabikaCoffe > 0){
            System.out.println("Jumah TorabikaCoffe yang akan di beli : "+jTorabikaCoffe);
            System.out.println("Total harga TorabikaCoffe : Rp."+htTorabikaCoffe);
        }
        if (jMilo > 0){
            System.out.println("Jumah Milo yang akan di beli : "+jMilo);
            System.out.println("Total harga Milo : Rp."+htMilo);
        }
        System.out.println("\n==============================================");
        System.out.println("Total harga yang harus anda bayar : Rp."+hargaTotal);
        System.out.println("================= Terimakasi =================\n");

        System.out.printf("%s\n%s", "1. Berikan Feedback", "2. Logout");
        System.out.println("\nMasukkan Pilihan Anda : ");
        feedback = scan.nextInt();scan.nextLine();
        if (feedback == 1){
            feed.komen();//pengimplementasian encapsulation
        } else if (feedback == 2) {
            System.out.println("=============== Berhasil Logout ===============\n");
        }
    }
}

