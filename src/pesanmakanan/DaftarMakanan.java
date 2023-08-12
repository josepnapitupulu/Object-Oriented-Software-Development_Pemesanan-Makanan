/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pesanmakanan;

/**
 *
 * @author MSI GAMING
 */
public enum DaftarMakanan {//implements enum pada program
    pilusGaruda, kuaciRebo, oreo, kacangAtom, rotiBawang, rotiTawar, kueGandum, rotiGulung, kacangPolong, tango;
    public String toString(){
        switch (this){
            case pilusGaruda :
                return "PILUS GARUDA";
            case kuaciRebo:
                return "KUACI REBO";
            case oreo:
                return "OREO";
            case kacangAtom:
                return "KACANG ATOM";
            case rotiBawang:
                return "ROTI BAWANG";
            case rotiTawar:
                return "ROTI TAWAR";
            case kueGandum:
                return "KUE GANDUM";
            case rotiGulung:
                return "ROTI GULUNG";
            case kacangPolong:
                return "KACANG POLONG";
            default:
                return "TANGO";
        }
    }
}

