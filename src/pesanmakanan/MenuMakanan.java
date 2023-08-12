/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanmakanan;

/**
 *
 * @author MSI GAMING
 */
public class MenuMakanan extends HitungHarga{//penggunaan class relationship tepatnya pada penggunaan
                                            // Is-a relationship dimana ini juga di sebut sebagai Inheritance

    private DaftarMakanan pilusGaruda;
    private DaftarMakanan kuaciRebo;
    private DaftarMakanan oreo;
    private DaftarMakanan kacangAtom;
    private DaftarMakanan rotiBawang;
    private DaftarMakanan rotiTawar;
    private DaftarMakanan kueGandum;
    private DaftarMakanan rotiGulung;
    private DaftarMakanan kacangPolong;
    private DaftarMakanan tango;

    public MenuMakanan(DaftarMakanan pilusGarudaBaru, DaftarMakanan kuaciReboBaru, DaftarMakanan oreoBaru, DaftarMakanan kacangAtomBaru,
                       DaftarMakanan rotiBawangBaru,DaftarMakanan rotiTawarBaru,DaftarMakanan kueGandumBaru,DaftarMakanan rotiGulungBaru,
                       DaftarMakanan kacangPolongBaru,DaftarMakanan tangoBaru, int hargaPilusGaruda, int hargaKuaciRebo, int hargaOreo,
                       int hargaKacangAtom, int hargaRotiBawang, int hargaRotiTawar, int hargaKueGandum, int hargaRotiGulung, int hargaKacangPolong,
                       int hargaTango, int hargaCocaCola, int hargaAqua, int hargaIchiOcha, int hargaCocoDrink, int hargaPocariSweat, int hargaNescafe,
                       int hargaCoklatDrink, int hargaFanta, int hargaTorabikaCoffe, int hargaMilo){//Is-a Relationship
        super(hargaPilusGaruda, hargaKuaciRebo, hargaOreo, hargaKacangAtom, hargaRotiBawang, hargaRotiTawar, hargaKueGandum, hargaRotiGulung,
                hargaKacangPolong, hargaTango, hargaCocaCola, hargaAqua, hargaIchiOcha, hargaCocoDrink, hargaPocariSweat, hargaNescafe, hargaCoklatDrink,
                hargaFanta, hargaTorabikaCoffe, hargaMilo);//Is-a Relationship
        setPilusGaruda(pilusGarudaBaru);
        setKuaciRebo(kuaciReboBaru);
        setOreo(oreoBaru);
        setKacangAtom(kacangAtomBaru);
        setRotiBawang(rotiBawangBaru);
        setRotiTawar(rotiTawarBaru);
        setKueGandum(kueGandumBaru);
        setRotiGulung(rotiGulungBaru);
        setKacangPolong(kacangPolongBaru);
        setTango(tangoBaru);
    }

    public void setPilusGaruda(DaftarMakanan pilusGarudaBaru){
        this.pilusGaruda = pilusGarudaBaru;
    }
    public void setKuaciRebo(DaftarMakanan kuaciReboBaru){
        this.kuaciRebo = kuaciReboBaru;
    }
    public void setOreo(DaftarMakanan oreoBaru){
        this.oreo = oreoBaru;
    }
    public void setKacangAtom(DaftarMakanan kacangAtomBaru){
        this.kacangAtom = kacangAtomBaru;
    }
    public void setRotiBawang(DaftarMakanan rotiBawangBaru){
        this.rotiBawang = rotiBawangBaru;
    }
    public void setRotiTawar(DaftarMakanan rotiTawarBaru){
        this.rotiTawar = rotiTawarBaru;
    }
    public void setKueGandum(DaftarMakanan kueGandumBaru){
        this.kueGandum = kueGandumBaru;
    }
    public void setRotiGulung(DaftarMakanan rotiGulungBaru){
        this.rotiGulung = rotiGulungBaru;
    }
    public void setKacangPolong(DaftarMakanan kacangPolongBaru){
        this.kacangPolong = kacangPolongBaru;
    }
    public void setTango(DaftarMakanan tangoBaru){
        this.tango = tangoBaru;
    }

    public void menuMakanan(int jPilusGaruda, int jKuaciRebo, int jOreo, int jKacangAtom, int jRotiBawang, int jRotiTawar, int jKueGandum, int jRotiGulung, int jKacangPolong, int jTango){
        double sPilusGaruda = 20;
        double sKuaciRebo = 30;
        double sOreo = 32;
        double sKacangAtom = 41;
        double sRotiBawang = 21;
        double sRotiTawar = 51;
        double sKueGandum = 67;
        double sRotiGulung = 43;
        double sKacangPolong = 21;
        double sTango = 45;


        sPilusGaruda = sPilusGaruda - jPilusGaruda;
        sKuaciRebo = sKuaciRebo - jKuaciRebo;
        sOreo = sOreo - jOreo;
        sKacangAtom = sKacangAtom - jKacangAtom;
        sRotiBawang = sRotiBawang - jRotiBawang;
        sRotiTawar = sRotiTawar - jRotiTawar;
        sKueGandum = sKueGandum - jKueGandum;
        sRotiGulung = sRotiGulung - jRotiGulung;
        sKacangPolong = sKacangPolong - jKacangPolong;
        sTango = sTango - jTango;

        System.out.println("=========== Menu Makanan ===========");
        System.out.printf("%s%.0f%s\n\t%s\n","1. "+ this.pilusGaruda + " Tersedia : ", sPilusGaruda, " Bungkus", " Harga perBungkus : Rp." + hargaPilusGaruda);
        System.out.printf("%s%.0f%s\n\t%s\n","2. "+this.kuaciRebo+ " Tersedia : ", sKuaciRebo, " Bungkus", " Harga perBungkus : Rp."+hargaKuaciRebo);
        System.out.printf("%s%.0f%s\n\t%s\n","3. "+this.oreo+ " Tersedia : ", sOreo," Bungkus", " Harga perBungkus : Rp."+hargaOreo);
        System.out.printf("%s%.0f%s\n\t%s\n","4. "+this.kacangAtom+" Tersedia : ", sKacangAtom, " Bungkus", " Harga perBungkus : Rp."+hargaKacangAtom);
        System.out.printf("%s%.0f%s\n\t%s\n","5. "+this.rotiBawang+" Tersedia : ", sRotiBawang, " Bungkus", " Harga perBungkus : Rp."+hargaRotiBawang);
        System.out.printf("%s%.0f%s\n\t%s\n","6. "+this.rotiTawar+" Tersedia : ", sRotiTawar, " Bungkus", " Harga perBungkus : Rp."+hargaRotiTawar);
        System.out.printf("%s%.0f%s\n\t%s\n","7. "+this.kueGandum+" Tersedia : ", sKueGandum, " Bungkus", " Harga perBungkus : Rp."+hargaKueGandum);
        System.out.printf("%s%.0f%s\n\t%s\n","8. "+this.rotiGulung+" Tersedia : ", sRotiGulung, " Bungkus", " Harga perBungkus : Rp."+hargaRotiGulung);
        System.out.printf("%s%.0f%s\n\t%s\n","9. "+this.kacangPolong+" Tersedia : ", sKacangPolong, " Bungkus", " Harga perBungkus : Rp."+hargaKacangPolong);
        System.out.printf("%s%.0f%s\n\t%s\n","10. "+this.tango+" Tersedia : ", sTango, " Bungkus", " Harga perBungkus : Rp."+hargaTango);
    }
}

