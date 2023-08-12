/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanmakanan;

/**
 *
 * @author MSI GAMING
 */
public class MenuMinuman extends HitungHarga{//penggunaan class relationship tepatnya pada penggunaan
                                            // Is-a relationship dimana ini juga di sebut sebagai Inheritance

    private DaftarMinuman cocaCola;
    private DaftarMinuman aqua;
    private DaftarMinuman ichiOcha;
    private DaftarMinuman cocoDrink;
    private DaftarMinuman pocariSweat;
    private DaftarMinuman nescafe;
    private DaftarMinuman coklatDrink;
    private DaftarMinuman fanta;
    private DaftarMinuman torabikaCoffe;
    private DaftarMinuman milo;

    public MenuMinuman(DaftarMinuman cocaColaBaru, DaftarMinuman aquaBaru, DaftarMinuman ichiochaBaru,
                       DaftarMinuman cocoDrinkBaru, DaftarMinuman pocariSweatBaru, DaftarMinuman nescafeBaru,
                       DaftarMinuman coklatDrinkBaru, DaftarMinuman fantaBaru, DaftarMinuman torabikaCoffeBaru,
                       DaftarMinuman miloBaru, int hargaPilusGaruda, int hargaKuaciRebo, int hargaOreo, int hargaKacangAtom,
                       int hargaRotiBawang, int hargaRotiTawar, int hargaKueGandum, int hargaRotiGulung,
                       int hargaKacangPolong, int hargaTango, int hargaCocaCola, int hargaAqua, int hargaIchiOcha,
                       int hargaCocoDrink, int hargaPocariSweat, int hargaNescafe, int hargaCoklatDrink, int hargaFanta,
                       int hargaTorabikaCoffe, int hargaMilo){
        super(hargaPilusGaruda, hargaKuaciRebo, hargaOreo, hargaKacangAtom, hargaRotiBawang, hargaRotiTawar,
                hargaKueGandum, hargaRotiGulung, hargaKacangPolong, hargaTango, hargaCocaCola, hargaAqua, hargaIchiOcha,
                hargaCocoDrink, hargaPocariSweat, hargaNescafe, hargaCoklatDrink, hargaFanta, hargaTorabikaCoffe, hargaMilo);
        setCocaCola(cocaColaBaru);
        setAqua(aquaBaru);
        setIchiOcha(ichiochaBaru);
        setCocoDrink(cocoDrinkBaru);
        setPocariSweat(pocariSweatBaru);
        setNescafe(nescafeBaru);
        setCoklatDrink(coklatDrinkBaru);
        setFanta(fantaBaru);
        setTorabikaCoffe(torabikaCoffeBaru);
        setMilo(miloBaru);
    }

    public void setCocaCola(DaftarMinuman cocaColaBaru){
        this.cocaCola = cocaColaBaru;
    }
    public void setAqua(DaftarMinuman aquaBaru){
        this.aqua = aquaBaru;
    }
    public void setIchiOcha(DaftarMinuman ichiochaBaru){
        this.ichiOcha = ichiochaBaru;
    }
    public void setCocoDrink(DaftarMinuman cocoDrinkBaru){
        this.cocoDrink = cocoDrinkBaru;
    }
    public void setPocariSweat(DaftarMinuman pocariSweatBaru){
        this.pocariSweat = pocariSweatBaru;
    }
    public void setNescafe(DaftarMinuman nescafeBaru){
        this.nescafe = nescafeBaru;
    }
    public void setCoklatDrink(DaftarMinuman coklatDrinkBaru){
        this.coklatDrink = coklatDrinkBaru;
    }
    public void setFanta(DaftarMinuman fantaBaru){
        this.fanta = fantaBaru;
    }
    public void setTorabikaCoffe(DaftarMinuman torabikaCoffeBaru){
        this.torabikaCoffe = torabikaCoffeBaru;
    }
    public void setMilo(DaftarMinuman miloBaru){
        this.milo = miloBaru;
    }

    public void menuMinuman(int jCocaCola, int jAqua, int jIchiOcha, int jCocoDrink, int jPocariSweat, int jNescafe, int jCoklatDrink,
                            int jFanta, int jTorabikaCoffe, int jMilo){
        double sCocaCola = 20;
        double sAqua = 22;
        double sIchiOcha = 40;
        double sCocoDrink = 35;
        double sPocariSweat = 25;
        double sNescafe = 75;
        double sCoklatDrink = 85;
        double sFanta = 49;
        double sTorabikaCoffe = 77;
        double sMilo = 32;


        sCocaCola = sCocaCola - jCocaCola;
        sAqua = sAqua - jAqua;
        sIchiOcha = sIchiOcha - jIchiOcha;
        sCocoDrink = sCocoDrink - jCocoDrink;
        sPocariSweat = sPocariSweat - jPocariSweat;
        sNescafe = sNescafe - jNescafe;
        sCoklatDrink = sCoklatDrink - jCoklatDrink;
        sFanta = sFanta - jFanta;
        sTorabikaCoffe = sTorabikaCoffe - jTorabikaCoffe;
        sMilo = sMilo - jMilo;

        System.out.println("=========== Menu Minuman ===========");
        System.out.printf("%s%.0f%s\n\t%s\n","1. "+this.cocaCola+ " Tersedia : ", sCocaCola, " Bungkus", " Harga perBungkus : Rp."+hargaCocaCola);
        System.out.printf("%s%.0f%s\n\t%s\n","2. "+this.aqua+ " Tersedia : ", sAqua, " Bungkus", " Harga perBungkus : Rp."+hargaAqua);
        System.out.printf("%s%.0f%s\n\t%s\n","3. "+this.ichiOcha+ " Tersedia : ", sIchiOcha, " Bungkus", " Harga perBungkus : Rp."+hargaIchiOcha);
        System.out.printf("%s%.0f%s\n\t%s\n","4. "+this.cocoDrink+ " Tersedia : ", sCocoDrink, " Bungkus", " Harga perBungkus : Rp."+hargaCocoDrink);
        System.out.printf("%s%.0f%s\n\t%s\n","5. "+this.pocariSweat+ " Tersedia : ", sPocariSweat, " Bungkus", " Harga perBungkus : Rp."+hargaPocariSweat);
        System.out.printf("%s%.0f%s\n\t%s\n","6. "+this.nescafe+ " Tersedia : ", sNescafe, " Bungkus", " Harga perBungkus : Rp."+hargaNescafe);
        System.out.printf("%s%.0f%s\n\t%s\n","7. "+this.coklatDrink+ " Tersedia : ", sCoklatDrink, " Bungkus", " Harga perBungkus : Rp."+hargaCoklatDrink);
        System.out.printf("%s%.0f%s\n\t%s\n","8. "+this.fanta+ " Tersedia : ", sFanta, " Bungkus", " Harga perBungkus : Rp."+hargaFanta);
        System.out.printf("%s%.0f%s\n\t%s\n","9. "+this.torabikaCoffe+ " Tersedia : ", sTorabikaCoffe, " Bungkus", " Harga perBungkus : Rp."+hargaTorabikaCoffe);
        System.out.printf("%s%.0f%s\n\t%s\n","10. "+this.milo+ " Tersedia : ", sMilo, " Bungkus", " Harga perBungkus : Rp."+hargaMilo);
    }
}

